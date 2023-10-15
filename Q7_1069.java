// Name - SHIBAM NATH
// Regd - 2241014047
// link - https://cses.fi/problemset/task/1069/

import java.util.Scanner;

public class Q7_1069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int curr = 1, max = 1;
        for (int i = 0 ; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                curr++;
                max = Math.max(max, curr);
            }
            else {
                curr = 1;
            }
        }
        System.out.println(max);
    }
}
