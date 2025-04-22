import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] s_array = new String[n];

        for (int i = 0; i< n; i++){
            s_array[i] = br.readLine();
        }

        Arrays.sort(s_array, (s1,s2) ->{
            if(s1.length() == s2.length()){
                return s1.compareTo(s2);
            } else {
                return s1.length() - s2.length();
            }
        });

        System.out.println(s_array[0]);
        for(int i=1; i< n; i++){
            if(!s_array[i].equals(s_array[i-1])){
                System.out.println(s_array[i]);
            }
        }

        br.close();
    }
}
