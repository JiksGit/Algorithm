import java.io.*;
import java.util.*;

class Main {
    static int[][] graph;
    static int[][] visited;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int N, count;

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bis.readLine());

        N = Integer.parseInt(st.nextToken());

        count = 0;

        graph = new int[N][N];
        visited = new int[N][N];
        for(int[] row : visited) Arrays.fill(row, -1);

         // 🔥 수정: 띄어쓰기 없는 입력 처리
         for (int i = 0; i < N; i++) {
            String line = bis.readLine();
            for (int j = 0; j < N; j++) {
                graph[i][j] = line.charAt(j) - '0';
            }
        }

        for(int i=0; i< N; i++){
            for(int j=0; j<N; j++){
                if(graph[i][j] == 1 && visited[i][j] == -1){
                    count++;
                    dfs(i, j);
                }
            }
        }

        int[] result = new int[count+1];

        System.out.println(count);
        
        for(int i=0; i<N; i++){
            for(int j=0; j<N ;j++){
                int now = visited[i][j];
                if(now>0)result[now]++;
            }
        }

        Arrays.sort(result);

        for(int i=1; i< count+1; i++){
            System.out.println(result[i]);
        }
    }

    public static void dfs(int x, int y){
        visited[x][y] = count;
        for(int i=0; i<4; i++){
            int nx = dx[i] + x;
            int ny = dy[i] + y;
            if(nx >= 0 && ny >=0 && nx < N && ny < N){
                if(graph[nx][ny] == 1 && visited[nx][ny] == -1){
                    visited[nx][ny] = count;
                    dfs(nx, ny);
                }
            }
        }
    }
}