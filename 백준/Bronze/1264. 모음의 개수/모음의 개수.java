import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        while(true) {
            int count = 0;
            String s = sc.nextLine();
            if(s.equals("#")){
                break;
            }
            for(int i=0; i< s.length(); i++){
                if(s.charAt(i)=='a' || s.charAt(i)=='e'|| s.charAt(i)=='i'|| s.charAt(i)=='o'|| s.charAt(i)=='u' || 
                s.charAt(i)=='A' || s.charAt(i)=='E'|| s.charAt(i)=='I'|| s.charAt(i)=='O'|| s.charAt(i)=='U'){
                    count++;
                }
            }
            System.out.println(count);
        }

        sc.close();
    }
}