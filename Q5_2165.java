// Name - SHIBAM NATH
// Regd - 2241014047
// link - https://cses.fi/problemset/task/2165

import java.util.Scanner;

public class Q5_2165 {
    public static void hanoi(long n, long from, long to, long aux) {
        if (n == 1) {
            System.out.println(from + " " + to);
            return;
        }
        hanoi(n - 1, from, aux, to);
        System.out.println(from + " " + to);
        hanoi(n - 1, aux, to, from);
    }

    public static long hanoiCalls(long n) {
        if (n == 1) {
            return 1;
        } 
        else {
            return 2 * hanoiCalls(n - 1) + 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(hanoiCalls(n));
        hanoi(n, 1, 3, 2);
    }
}
