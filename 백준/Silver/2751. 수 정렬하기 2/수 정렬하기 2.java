import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bis.readLine());
        PriorityQueue queue = new PriorityQueue();
        StringBuilder sb = new StringBuilder();

        for(int i=1; i<= N; i++){
            int next = Integer.parseInt(bis.readLine());
            queue.add(next);
        }

        while(queue.size() > 0){
            sb.append(queue.poll()+"\n");
        }

        System.out.print(sb.toString());
    }
}