import java.io.*;
import java.util.*;

class Main {

    static boolean visited[][];
    static int N, K;
    static int[][] A;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        A = new int[N][N];
        int max = 0;
        int result = 0;
        int resultMax = 0;

        for(int i=0; i<N; i++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                A[i][j] = Integer.parseInt(st.nextToken());
                max = Math.max(max, A[i][j]);
            }
        }

        for(K=1; K<= max; K++){
            visited = new boolean[N][N];
            result = 0;

            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    if(!visited[i][j] && A[i][j] >= K){
                        DFS(i, j);
                        result++;
                    }
                }
            }
            resultMax = Math.max(resultMax, result);
        }
        System.out.println(resultMax);
    }
    public static void DFS(int i, int j){
        visited[i][j] = true;
        for(int p=0; p<4; p++){
            int cdx = j + dx[p];
            int cdy = i + dy[p];
            if(cdx >= 0 && cdy >= 0 && cdx < N && cdy < N){
                if(!visited[cdy][cdx] && A[cdy][cdx] >= K){
                    DFS(cdy, cdx);
                }
            }
        }
    }
}