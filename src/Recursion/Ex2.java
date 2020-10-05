package Recursion;

import java.util.Scanner;

public class Ex2 {
    public static void recursion (int n) {
        if (n != 0) {
            recursion(n - 1);
            System.out.println (n);
        }
    }

    public static void main (String[] args) {
        Scanner s = new Scanner (System.in);
        int n = s.nextInt ();
        recursion (n);
    }
}
