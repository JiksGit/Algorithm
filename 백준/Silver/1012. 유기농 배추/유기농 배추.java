import java.io.*;
import java.util.*;

class Main {

    public static int M, N, K;
    public static int[][] graph;
    public static boolean[][] visited;
    public static int[] dx = new int[]{1,-1,0,0};
    public static int[] dy = new int[]{0,0,1,-1};


    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(bis.readLine());

        for(int i=0; i< T; i++){
            StringTokenizer st = new StringTokenizer(bis.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            graph = new int[N][M];
            visited = new boolean[N][M];

            int count = 0;

            for(int j=0; j< K; j++){
                st = new StringTokenizer(bis.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                graph[y][x] = 1;
            }

            for(int k=0; k<N; k++){
                for(int p=0; p<M; p++){
                    if(!visited[k][p] && graph[k][p] == 1){
                        DFS(k, p);
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
    }

    public static void DFS(int x, int y){
        visited[x][y] = true;
        for(int s = 0; s<4; s++){
            int nx = dx[s] + x;
            int ny = dy[s] + y;
            if(nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
            if(!visited[nx][ny] && graph[nx][ny] == 1){
                DFS(nx, ny);
            }
        }
    }
}