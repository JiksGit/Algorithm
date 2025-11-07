import java.io.*;
import java.util.*;

class Main {

    public static int N, M, result;
    public static List<Integer>[] graph;
    public static boolean[] visited;

    public static void main(String[] args) throws IOException {
        
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bis.readLine());
        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(bis.readLine());
        int M = Integer.parseInt(st.nextToken());

        graph = new ArrayList[N+1];
        for(int i=1; i<=N; i++){
            graph[i] = new ArrayList<Integer>();
        }

        for(int i=1; i<=M; i++){
            st = new StringTokenizer(bis.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            graph[s].add(e);
            graph[e].add(s);
        }

        visited = new boolean[N+1];

        dfs(1);
        System.out.println(result);
    }

    public static void dfs(int node){
        visited[node] = true;
        for(int next : graph[node]){
            if(!visited[next]){
                visited[next]=true;
                result++;
                dfs(next);
            }
        }
    }
}