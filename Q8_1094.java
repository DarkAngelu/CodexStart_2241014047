// Name - SHIBAM NATH
// Regd - 2241014047
// link - https://cses.fi/problemset/task/1094/

import java.util.Scanner;

public class Q8_1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a[] = new int[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
        }

        long moves = 0;
        for (int i = 0 ; i < n - 1 ; i++) {
            if (a[i + 1] < a[i]) {
                moves += a[i] - a[ i + 1];
                a[i + 1] = a[i];
            }
        }
        System.out.println(moves);
    }
}
