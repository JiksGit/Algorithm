import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(bis.readLine());
        StringTokenizer st;

        List<String[]> list = new ArrayList<>();

        for(int i=1; i<=N; i++){
            st = new StringTokenizer(bis.readLine());
            String[] arr = new String[2];
            arr[0] = st.nextToken();
            arr[1] = st.nextToken();
            list.add(arr);
        };

        Collections.sort(list, new Comparator<String[]>(){
            @Override
            public int compare(String[] a, String[] b){
                return Integer.parseInt(a[0]) - Integer.parseInt(b[0]);
            }
        });

        for(String[] str : list){
            sb.append(str[0]).append(" ").append(str[1]).append("\n");
        }

        System.out.print(sb.toString());
    }
}