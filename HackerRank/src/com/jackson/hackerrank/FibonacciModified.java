package com.jackson.hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciModified {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();
        fibonacci(a,b,n);
        in.close();
    }
    
    public static void fibonacci(int a, int b, int n) {
        int start = n-3;
        BigInteger oldDigit = BigInteger.valueOf(a);
        BigInteger lastDigit = BigInteger.valueOf(b);
        for (int i = 0; i <= start; i++) {
            BigInteger temp = lastDigit;
            lastDigit = oldDigit.add(lastDigit.pow(2));
            oldDigit = temp;
        }
        System.out.println(lastDigit);
    }

}
