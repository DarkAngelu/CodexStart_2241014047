// Name - SHIBAM NATH
// Regd - 2241014047
// link - https://cses.fi/problemset/submit/1617/

import java.util.Scanner;

public class Q3_1617 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int mod = (int)(Math.pow(10, 9) + 7);
        // Program
        long result = powMod(2, n, mod);
        System.out.println(result);
    }

    public static long powMod(long base, long exp, int mod) {
        long result = 1;
        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp >>= 1;
        }
        return result;
    }
}

