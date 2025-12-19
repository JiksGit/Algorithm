import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < T; t++) {
            String s = br.readLine();
            Stack<Character> stack = new Stack<>();
            boolean ok = true;

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '(') stack.push(c);
                else {
                    if (stack.isEmpty()) { ok = false; break; }
                    stack.pop();
                }
            }

            if (ok && stack.isEmpty()) sb.append("YES\n");
            else sb.append("NO\n");
        }

        System.out.print(sb.toString());
    }
}
