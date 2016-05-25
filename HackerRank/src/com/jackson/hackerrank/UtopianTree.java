package com.jackson.hackerrank;

import java.util.Scanner;

public class UtopianTree {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            utopianTree(n);
        }
        in.close();
    }

    public static void utopianTree (int cycles) {
        int mod = cycles % 2;
        int div = cycles / 2;
        int result = 1;
        for (int i = 0; i < div; i++) {
            result = (result*2) +1;
        }
        
        
        System.out.println(mod == 0 ? result : result*2);
    }
}
