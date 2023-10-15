// Name - SHIBAM NATH
// Regd - 2241014047
// link - https://cses.fi/problemset/task/1622

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Q6_1622 {
    static HashSet<String> set = new LinkedHashSet<>();
    public static void perm(String s, String r) {
        if (s.length() == 0) {
            set.add(r);
            return;
        }
        for (int i = 0 ; i < s.length() ; i++) {
            perm(s.substring(0, i) + s.substring(i + 1) , r + s.charAt(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c[] = s.toCharArray();
        Arrays.sort(c);
        s = "";
        for (char ch : c) {
            s += ch;
        }
        perm(s, "");
        System.out.println((set.size()));
        for (String str : set) {
            System.out.println(str);
        }
    }
}
