import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bis.readLine());
        StringBuilder sb = new StringBuilder();

        Deque queue = new ArrayDeque();

        for(int i=0; i< count; i++){
            String[] str = bis.readLine().split(" ");
            switch (str[0]){
                case "push":
                    queue.add(str[1]);
                    break;
                case "pop":
                    if(queue.size() == 0) {
                        sb.append("-1\n");
                    } else {
                        sb.append(queue.poll()+"\n");
                    }
                    break;
                case "size":
                    sb.append(queue.size()+"\n");
                    break;
                case "empty":
                    if(queue.size() == 0){
                        sb.append("1\n");
                    } else {
                        sb.append("0\n");
                    }
                    break;
                case "front":
                    if(queue.size() == 0){
                        sb.append("-1\n");
                    } else {
                        sb.append(queue.peek()+"\n");
                    }
                    break;
                case "back":
                    if(queue.size() == 0){
                        sb.append("-1\n");
                    } else {
                        sb.append(queue.peekLast()+"\n");
                    }
                    break;
            }
        }
        System.out.print(sb);
    }
}