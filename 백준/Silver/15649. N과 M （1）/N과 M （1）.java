import java.io.*;
import java.util.*;

class Main {

    public static int N, M;
    public static int[] arr;
    public static boolean[] visited;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bis.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];
        visited = new boolean[N];

        dfs(0);
        System.out.print(sb);
    }

    public static void dfs(int depth){
        if(depth == M){
            for(int i=0; i< M; i++){
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i=0; i< N; i++){
            if(!visited[i]){
                visited[i] = true;
                arr[depth] = i+1;
                dfs(depth + 1);
                visited[i] = false;
            }
        }
        
    }
}