// Name - SHIBAM NATH
// Regd - 2241014047
// link - https://cses.fi/problemset/task/1070/

import java.util.Scanner;

public class Q10_1070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        StringBuilder ans = new StringBuilder();
        if(n == 1) {
			System.out.println(1);
			System.exit(0);
		}
		if(n <= 3) {
			System.out.println("NO SOLUTION");
			System.exit(0);
		}
		
		int temp = 2;
		while(temp <= n) {
			ans.append(temp);
			ans.append(" ");
			temp += 2;
		}
		
		temp = 1;
		while(temp <= n) {
			ans.append(temp);
			ans.append(" ");
			temp += 2;
		}
		
		System.out.println(ans);
    }
}
