package com.jackson.hackerrank;


import java.util.Scanner;

public class TaumAndBday {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long b = in.nextLong();
            long w = in.nextLong();
            long x = in.nextLong();
            long y = in.nextLong();
            long z = in.nextLong();
            
            if (z >= x && z >= y) {
                System.out.println((b*x) + (w*y));
            }
            else {
                if ( (x+z) < y ) {
                    System.out.println((b*x) + (w*(x+z)));
                }
                else {
                    if ((y+z) < x ) {
                        System.out.println((b*(y+z)) + (w*y));
                    }
                    else {
                        System.out.println((b*x) + (w*y));
                    }
                }
            }
        }
    }
}
