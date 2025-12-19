import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bis.readLine());

        String N = st.nextToken();
        String M = st.nextToken();

        StringBuilder sb = new StringBuilder();

        for(int i = 1; i<= 3; i++){
            sb.append(N.charAt(3-i));
        }
        N = sb.toString();

        sb = new StringBuilder();

        for(int i = 1; i<= 3; i++){
            sb.append(M.charAt(3-i));
        }
        M = sb.toString();

        int max = Math.max(Integer.parseInt(N), Integer.parseInt(M));
        System.out.print(max);
    }
}