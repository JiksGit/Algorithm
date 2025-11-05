import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bis.readLine());

        HashSet<String> set = new HashSet<>();

        for(int i=1; i<=N; i++){
            set.add(bis.readLine());
        }

        List<String> list = new ArrayList<>(set);

        Collections.sort(list, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                if(s1.length() == s2.length()){
                    return s1.compareTo(s2);
                } else {
                    return s1.length() - s2.length();
                }
            }
        });

        StringBuilder sb = new StringBuilder();

        for(String str : list){
            sb.append(str).append("\n");
        }

        System.out.println(sb.toString());
    }
}