import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bis.readLine());
        StringBuilder sb = new StringBuilder();

        Stack stack = new Stack();

        for(int i=0; i< count; i++){
            String[] str = bis.readLine().split(" ");
            switch (str[0]){
                case "push":
                    stack.push(str[1]);
                    break;
                case "pop":
                    if(stack.size() == 0) {
                        sb.append("-1\n");
                    } else {
                        sb.append(stack.pop()+"\n");
                    }
                    break;
                case "size":
                    sb.append(stack.size()+"\n");
                    break;
                case "empty":
                    if(stack.size() == 0){
                        sb.append("1\n");
                    } else {
                        sb.append("0\n");
                    }
                    break;
                case "top":
                    if(stack.size() == 0){
                        sb.append("-1\n");
                    } else {
                        sb.append(stack.peek()+"\n");
                    }
                    break;
            }
        }
        System.out.print(sb);
    }
}