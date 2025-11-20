import java.io.*;
import java.util.*;

class Main {

    public static class Node{
        int s;
        int e;
        public Node(int s, int e){
            this.s = s;
            this.e = e;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bis.readLine());

        ArrayList<Node> list = new ArrayList<>();


        int endTime = 0;

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(bis.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            Node node = new Node(s,e);
            list.add(node);

            endTime = Math.max(endTime, e);
        }

        list.sort((n1, n2)->{
            if(n1.e == n2.e) return n1.s - n2.s;
            return n1.e - n2.e;
        });

        int LastEnd = 0;
        int count = 0;
        for(Node node : list){
            if(node.s >= LastEnd){
                count++;
                LastEnd = node.e;
            }
        }

        System.out.print(count);
    }
}