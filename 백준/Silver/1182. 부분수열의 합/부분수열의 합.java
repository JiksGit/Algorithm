import java.io.*;
import java.util.*;

class Main {

    static int N, S, arr[];
    static int count=0;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        
        arr = new int[N];
        
        st = new StringTokenizer(br.readLine());
        for(int i =0; i<N; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        
        back(0,0);
        
        if(S == 0){
            System.out.println(count-1);
        }
        else{
        System.out.println(count);
        }
    }
    
    public static void back(int start, int result){
        if(start == N){
            if(result == S)
                count++;
            return;
        }
        
        back(start+1, result+arr[start]);
        back(start+1, result);
    }
}