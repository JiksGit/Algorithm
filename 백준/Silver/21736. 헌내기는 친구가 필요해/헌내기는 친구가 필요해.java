import java.io.*;
import java.util.*;

class Main {

    public static int[] dx = new int[]{-1,1,0,0};
    public static int[] dy = new int[]{0,0,-1,1};
    public static int N, M;
    public static char[][] graph;
    public static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bis.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        graph = new char[N][M];
        visited = new boolean[N][M];

        int x = 0;
        int y = 0;

        for(int i=0; i<N; i++){
            String arr = bis.readLine();
            for(int j=0; j<M; j++){
                char now = arr.charAt(j);
                graph[i][j] = now;
                if(now == 'I'){
                    x = i;
                    y = j;
                }
            }
        }

        dfs(x, y);

        int count = 0;
        for(int i=0; i< N; i++){
            for(int j=0; j<M ; j++){
                if(graph[i][j] == 'P' && visited[i][j]){
                    count++;
                }
            }
        }
        if(count == 0){
            System.out.print("TT");
            return;
        } else{
            System.out.print(count);
        }

    }

    public static void dfs(int x, int y){
        for(int i=0; i<4; i++){
            int nx = dx[i] + x;
            int ny = dy[i] + y;
            if(nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
            if(graph[nx][ny] != 'X' && !visited[nx][ny]){
                visited[nx][ny] = true;
                dfs(nx, ny);
            }
        }
    }
}