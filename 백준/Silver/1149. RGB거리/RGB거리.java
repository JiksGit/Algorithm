import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bis.readLine());

        int[][] graph = new int[N][3];
        int[][] dp = new int[N][3];

        for(int i=0; i< N; i++){
            StringTokenizer st = new StringTokenizer(bis.readLine());
            for(int j=0; j<3; j++){
                int now = Integer.parseInt(st.nextToken());
                graph[i][j] = now;
            }
        }

        for(int[] row : dp){
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        for(int i=0; i<3; i++){
            dp[0][i] = graph[0][i];
        }

        for(int i=1; i< N; i++){
            for(int j=0; j<3; j++){
                for(int k=0; k<3; k++){
                    if(k != j && (dp[i-1][k] + graph[i][j] < dp[i][j])){
                        dp[i][j] = dp[i-1][k] + graph[i][j];
                    }
                }
            }
        }

        int answer = Integer.MAX_VALUE;

        for(int i=0; i<3; i++){
            answer = Math.min(answer, dp[N-1][i]);
        }
        System.out.print(answer);
    }
}