// Name - SHIBAM NATH
// Regd - 2241014047
// link - https://cses.fi/problemset/task/1068/
import java.util.Scanner;
public class Main {
    public static void weird(Long n) {
        System.out.print(n + " ");
        if (n == 1) {
            return;
        }
        if (n % 2 == 0) {
            weird(n / 2);
        }
        else {
            weird(n * 3 + 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
        //Program
        weird(n);
    }
}