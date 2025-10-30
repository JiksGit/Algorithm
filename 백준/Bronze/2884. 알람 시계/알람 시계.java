import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bis.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int nexta = 0;
        int nextb = 0;
        if(b - 45 < 0){
            nextb = b-45+60;
            if(a == 0) nexta = 23;
            else {
                nexta = a-1;
            }
        } else {
            nextb = b-45;
            nexta = a;
        }
        System.out.println(nexta+ " " + nextb);
    }
}