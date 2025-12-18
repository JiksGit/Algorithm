import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        int index = 0;
        int max = 0;
        for(int i=1; i<=9; i++){
            int now = Integer.parseInt(bis.readLine());
            if(now > max){
                max = now;
                index = i;
            }
        }

        System.out.println(max);
        System.out.print(index);
    }
}