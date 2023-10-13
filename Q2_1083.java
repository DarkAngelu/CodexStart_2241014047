// Name - SHIBAM NATH
// Regd - 2241014047
// link - https://cses.fi/problemset/task/1083

import java.util.Scanner;

public class Q2_1083{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a[] = new long[(int)(n - 1)];
        
        for (int i = 0 ; i < n - 1 ; i++) {
            a[i] = sc.nextLong();
        }

        //Program
        long sum = 0;
        for (long num : a) {
            sum += num;
        }
        System.out.println((n * (n + 1)) / 2 - sum);
    }
}
