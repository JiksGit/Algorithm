import java.io.*;
import java.util.*;

class Main {

    static final int[] dx = {1, 0, -1, 0};
    static final int[] dy = {0, 1, 0, -1};
    public static int N, M;
    public static int[][] graph;
    public static int[][] dist;

    static class Node{
        int x;
        int y;
        Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bis.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        graph = new int[N][M];
        dist = new int[N][M];
        for(int[] row : dist){
            Arrays.fill(row, -1);
        }

        Deque<Node> queue = new ArrayDeque<>();

        for(int i=0; i<N; i++){
            st = new StringTokenizer(bis.readLine());
            for(int j=0; j<M; j++){
                int now = Integer.parseInt(st.nextToken());
                graph[i][j] = now;
                if(now == 1){
                    queue.add(new Node(i,j));
                    dist[i][j] = 0;
                }
            }
        }

        int result = 0;

        while(!queue.isEmpty()){
            Node node = queue.poll();
            for(int i=0; i<4; i++){
                int nx = dx[i]+node.x;
                int ny = dy[i]+node.y;
                if(nx < N && ny < M && nx >=0 && ny>= 0){
                    if(dist[nx][ny] == -1 && graph[nx][ny] == 0){
                        graph[nx][ny] = 1;
                        queue.add(new Node(nx,ny));
                        dist[nx][ny] = dist[node.x][node.y] + 1;
                    }
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                // 익을 수 없는 토마토가 남아 있다면 -1
                if (graph[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }
                result = Math.max(result, dist[i][j]);
            }
        }
        System.out.println(result);
    }
}