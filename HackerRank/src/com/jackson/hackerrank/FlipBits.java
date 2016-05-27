package com.jackson.hackerrank;

import java.util.Scanner;

public class FlipBits {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            flipBits(n);
        }
        in.close();
    }

    public static void flipBits(long n) {
        String bin = Long.toBinaryString(n);
        int len = bin.length();
        for (int i = 0; i < 32-len; i++) {
            bin = "0"+bin;
        }
        
        bin = bin.replaceAll("0", "z").replaceAll("1", "0").replaceAll("z", "1");
        
        
        
        System.out.println(Long.parseLong(bin, 2));
    }

}
