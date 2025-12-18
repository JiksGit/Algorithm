import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bis.readLine());

        int sum = 0;

        while(st.hasMoreTokens()){
            st.nextToken();
            sum++;
        }

        System.out.print(sum);
    }
}