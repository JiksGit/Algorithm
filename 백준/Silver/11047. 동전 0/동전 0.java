import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bis.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] array = new int[N];

        for(int i=0; i<N; i++){
            st = new StringTokenizer(bis.readLine());
            array[i] = Integer.parseInt(st.nextToken());
        }

        int now = N-1;
        int result = 0;

        while(K > 0){
            if(K < array[now]){
                now--;
                continue;
            }
            result += K / array[now];
            K %= array[now];
        }

        System.out.print(result);
    }
}