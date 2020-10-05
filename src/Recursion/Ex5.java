package Recursion;

import java.util.Scanner;

public class Ex5 {
    public static int recursion (int N) {
        if (N != 0) {
            return N%10+(recursion (N/10));
        }
        else {
            return 0;
        }
    }

    public static void main (String[] args) {
        Scanner s = new Scanner (System.in);
        int N = s.nextInt ();
        System.out.println (recursion(N));
    }
}
