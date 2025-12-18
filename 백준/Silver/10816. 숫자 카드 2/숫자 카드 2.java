import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bis.readLine());

        StringTokenizer st = new StringTokenizer(bis.readLine(), " ");
        
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<N; i++){
            int n1 = Integer.parseInt(st.nextToken());
            map.put(n1, map.getOrDefault(n1, 0) + 1);
        }

        int M = Integer.parseInt(bis.readLine());
        st = new StringTokenizer(bis.readLine());
        int[] array = new int[M];

        for(int i=0; i<M; i++){
            int n2 = Integer.parseInt(st.nextToken());
            if(map.containsKey(n2)){
                array[i] = map.get(n2);
            } else {
                array[i] = 0;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i =0; i< array.length; i++){
            sb.append(array[i] + " ");
        }

        System.out.print(sb.toString());
    }
}