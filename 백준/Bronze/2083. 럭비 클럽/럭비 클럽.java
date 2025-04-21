import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        while(true) {
            String s = sc.nextLine();
            if(s.equals("# 0 0")){
                break;
            }
            String[] str = s.split(" ");
            String name = str[0];
            int age = Integer.valueOf(str[1]);
            int weight = Integer.valueOf(str[2]);
            String value;
            if(age > 17 || weight >= 80){
                value = "Senior";
            } else {
                value = "Junior";
            }

            System.out.println(name + " " + value);
        }

        sc.close();
    }
}