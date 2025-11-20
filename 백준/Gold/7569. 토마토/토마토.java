import java.io.*;
import java.util.*;

class Main{

    public static int M, N, H;
    public static int[][][] graph;
    public static int[] dx = new int[]{1,-1,0,0,0,0};
    public static int[] dy = new int[]{0,0,1,-1,0,0};
    public static int[] dh = new int[]{0,0,0,0,1,-1};

    public static class Point{
        int x;
        int y;
        int h;
        public Point(int h, int x, int y){
            this.x  = x;
            this.y = y;
            this.h = h;
        }
    }
    
    public static void main(String[] args) throws IOException{
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(bis.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        graph = new int[H][M][N];

        Deque<Point> queue = new ArrayDeque<>();

        for(int i=0; i< H; i++){
            for(int j=0; j< N; j++){
                st = new StringTokenizer(bis.readLine());
                for(int k=0; k<M; k++){
                    int now = Integer.parseInt(st.nextToken());
                    graph[i][k][j] = now;
                    if(now == 1){
                        Point p = new Point(i, k, j);
                        queue.add(p);
                    }
                }
            }
        }

        while(!queue.isEmpty()){
            Point cur = queue.poll();
            for(int i=0; i<6; i++){
                int nx = dx[i] + cur.x;
                int ny = dy[i] + cur.y;
                int nh = dh[i] + cur.h;
                if(nx < 0 || ny <0 || nh< 0 || nx >= M || ny >= N || nh >= H) continue;
                if(graph[nh][nx][ny] == 0){
                    graph[nh][nx][ny] = graph[cur.h][cur.x][cur.y] + 1;
                    Point next = new Point(nh, nx, ny);
                    queue.add(next);
                }
            }
        }

        int result = 0;

        for(int i=0; i< H; i++){
            for(int j= 0; j< N; j++){
                for(int k = 0; k< M; k++){
                    if(graph[i][k][j] == 0) {
                        System.out.print("-1");
                        return;
                    }
                    result = Math.max(result, graph[i][k][j]);
                }
            }
        }
        System.out.print(result-1);
    }
}