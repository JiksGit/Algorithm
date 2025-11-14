import java.io.*;
import java.util.*;

class Main {

    public static int[] arr;
    public static int N;

    public static void main(String[] args) throws IOException {
        
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(bis.readLine());

        arr = new int[N+2];

        arr[0]= 0;
        arr[1]= 1;
        arr[2] = 2;

        if(N == 1) {
            System.out.println(1);
            return;
        }
        for(int i=2; i<= N+1; i++){
            arr[i] = (arr[i-2] % 15746 + arr[i-1] % 15746) % 15746;
        }

        System.out.println(arr[N+1]);
    }
}