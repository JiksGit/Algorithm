import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bis.readLine());

        int[] graph = new int[N + 1];
        int[] dp = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            graph[i] = Integer.parseInt(bis.readLine());
        }

        dp[1] = graph[1];
        if (N >= 2) dp[2] = graph[1] + graph[2];

        for (int i = 3; i <= N; i++) {
            dp[i] = Math.max(dp[i - 2], dp[i - 3] + graph[i - 1]) + graph[i];
        }

        System.out.println(dp[N]);
    }
}
