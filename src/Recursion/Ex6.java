package Recursion;

import java.util.Scanner;

public class Ex6 {

    public static int recursion (int n, int d) {
    if (d != 0) {
       if (n % d == 0)
           return recursion (n, d - 1) + 1;
       else
           return recursion (n, d - 1);
    }
    else
        return 0;
}

    public static void main (String[] args) {
        Scanner s = new Scanner (System.in);
        int n = s.nextInt ();
        if (recursion(n, n) == 2)
            System.out.println("YES");
        else
            System.out.println ("NO");
    }
}