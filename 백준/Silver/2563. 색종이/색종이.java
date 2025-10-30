import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bis.readLine());

        int count = Integer.parseInt(st.nextToken());
        int arr[][] = new int[101][101];

        for(int i=0; i<count; i++){
            st = new StringTokenizer(bis.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for(int j = x; j < x +10; j++){
                for(int k = y; k< y+ 10; k++){
                    arr[j][k] = 1;
                }
            }
        }
        int sum = 0;
        for(int i =0; i< 100; i++){
            for(int j=0; j< 100; j++){
                sum += arr[i][j];
            }
        }
        System.out.print(sum);
    }
}