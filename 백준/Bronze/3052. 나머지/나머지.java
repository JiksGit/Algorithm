import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<10; i++){
            int num = Integer.parseInt(bis.readLine());
            int m = num % 42;

            if(!set.contains(m)){
                set.add(m);
            }
        }

        System.out.print(set.size());

    }
}