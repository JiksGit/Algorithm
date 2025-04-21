import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();

        int count = 0;
        int mod = 64;

        while(X > 0){
            if( X >= mod ){
                X -= mod;
                count ++;
            }
            mod /= 2;
        }
        System.out.println(count);

        sc.close();
    }
}
