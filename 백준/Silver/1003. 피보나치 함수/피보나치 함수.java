import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        int[] fib0;
        int[] fib1;
      
        for(int i=0; i< count; i++){
            int n = sc.nextInt();
            fib0 = new int[n+1];
            fib1 = new int[n+1];

            fib0[0] = 1;
            fib1[0] = 0;
            if( n >= 1){
                fib0[1] = 0;
                fib1[1] = 1;
                if(n >=2) {
                    for(int j=2; j<=n; j++){
                        fib0[j] = fib0[j-2] + fib0[j-1];
                        fib1[j] = fib1[j-2] + fib1[j-1];
                    }
                }
            }

            System.out.println(fib0[n] + " " + fib1[n]);
        }

        sc.close();
    }
}
