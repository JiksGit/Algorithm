import java.io.*;
import java.util.*;

class Main {

    static int[][] array;
    static int N, M, V;
    static boolean[] visited;
    static StringBuilder sb;
    static Deque<Integer> queue = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {

        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bis.readLine(), " ");
        sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        array = new int[N+1][N+1];

        for(int i=1; i<= M; i++){
            st = new StringTokenizer(bis.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            array[x][y] = array[y][x] = 1;
        }
        visited = new boolean[N+1];
        dfs(V);
        sb.append("\n");

        visited = new boolean[N+1];
        bfs(V);

        System.out.print(sb.toString());
    }

    public static void dfs(int node){
        sb.append(node + " ");
        visited[node] = true;
        for(int i=1; i<=N; i++){
            if(array[node][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    }

    public static void bfs(int node){
        queue.add(node);
        while(!queue.isEmpty()){
            int now = queue.poll();
            if(!visited[now]) sb.append(now+" ");
            visited[now] = true;
            for(int i=1; i<=N; i++){
                if(array[now][i] == 1 && !visited[i]) {
                    queue.add(i);
                }
            }
        }
    }
}