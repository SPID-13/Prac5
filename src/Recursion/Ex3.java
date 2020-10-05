package Recursion;

import java.util.Scanner;

public class Ex3 {
    public static void recursionAB(int A, int B) {
            if (B != A - 1) {
                recursionAB(A, B - 1);
                System.out.println(B);
            }
        }

    public static void recursionBA(int A, int B) {
        if (A != B - 1) {
            System.out.println(A);
            recursionBA(A - 1, B);
        }
    }

    public static void main (String[] args) {
        Scanner s = new Scanner (System.in);
        int A = s.nextInt ();
        int B = s.nextInt ();
        if (A < B)
            recursionAB (A, B);
        else
            recursionBA (A, B);
    }
}
