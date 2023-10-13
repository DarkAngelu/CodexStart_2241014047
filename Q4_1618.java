// Name - SHIBAM NATH
// Regd - 2241014047
// link - https://cses.fi/problemset/submit/1618/

import java.util.Scanner;

public class Q4_1618 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        int count = 0;
        while (n >= 5) {
            n /= 5;
            count += n;
        }

        System.out.println(count);
    }
}
