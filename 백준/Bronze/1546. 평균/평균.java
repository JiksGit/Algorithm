import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int count = sc.nextInt();
        int max = 0;
        int sum = 0;
        
        for (int i = 0; i < count; i++) {
            int next = sc.nextInt();
            if (max < next) max = next;
            sum += next;
        }
        
        double avg = (double) sum / count;
        double result = avg / max * 100;
        
        System.out.println(result);
    }
}
