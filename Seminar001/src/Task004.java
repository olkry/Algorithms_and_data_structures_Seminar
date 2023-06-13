import java.util.Date;

import javax.xml.crypto.Data;

public class Task004 {
    
    public static long fib1(int N) {
        if (N <= 2) {
            return 1;
        }
        return fib1(N-1)+fib1(N-2);
    }

    public static long fib2(int N) {
        if (N <= 2) {
            return 1;
        }
        long[] F = new long[N+1];
        F[1] = 1;
        F[2] = 1;
        for (int i = 3; i <= N; i++) {
            F[i]= F[i-1] + F[i-2];            
        }
        return F[N];
    }

    public static void test(){
        for(int N = 10; N <= 50; N++){
            Date start = new Date();
            fib1(N);
            Date end = new Date();
            long time1 = end.getTime() - start.getTime();

            start = new Date();
            fib2(N);
            end = new Date();
            long time2 = end.getTime() - start.getTime();

            System.out.printf("N = %d, time1 = %d, time2 = %d%n", N, time1, time2);
        }        

    }

    public static void main(String[] args) {
        // System.out.println(fib2(10));
        test();
    }

}
