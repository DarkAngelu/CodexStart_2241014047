// Name - SHIBAM NATH
// Regd - 2241014047
// link - https://cses.fi/problemset/task/1072/

import java.util.Scanner;
public class Q9_1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        for(long i = 1 ; i <= n ; i++) {
			if(i == 1) {
				System.out.println(0);
				continue;
			}
			else if(i == 2) {
				System.out.println(6);
				continue;
			}
			System.out.println(i * i * (i * i - 1) / 2 - (4 * (i-1) * (i-2)));
		}
    }
}

