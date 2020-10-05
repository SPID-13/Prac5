package Recursion;

import java.util.Scanner;

public class Ex4 {
    public static int recursion (int k, int s, int len, int sum) {
        if (len == k) {
            if (sum == s) {
                return 1;
            }
            else {
                return 0;
            }
        }
        int c = (len == 0 ? 1 : 0);
        int res = 0;
        for (int i = c; i < 10; i++) {
            res += recursion( k, s, len + 1, sum + i);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int s = sc.nextInt();
        System.out.println ( recursion(k, s, 0, 0) );
    }
}
