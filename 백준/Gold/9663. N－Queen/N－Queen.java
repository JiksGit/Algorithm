import java.io.*;
import java.util.*;

class Main {

    public static int[] arr;
    public static int N, count;

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        
        N = Integer.parseInt(bis.readLine());

        arr = new int[N];
        count = 0;

        nQueen(0);
        System.out.print(count);

    }

    public static void nQueen(int depth){
        if(depth == N){
            count++;
            return;
        }
        for(int i=0; i< N; i++){
            arr[depth] = i;
            if(PossibleQueen(depth)){
                nQueen(depth+1);
            }
        }
    }

    public static boolean PossibleQueen(int col){
        for(int i=0; i< col; i++){
            if(arr[col] == arr[i]){
                return false;
            }
            if(Math.abs(arr[col]-arr[i]) == Math.abs(col - i)){
                return false;
            }
        }
        return true;
    }
}