package com.jackson.hackerrank;

import java.util.HashMap;
import java.util.Scanner;

public class IndexOfArrayElement {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int v = in.nextInt();
        int n = in.nextInt();
        HashMap<Integer,Integer> map = new HashMap <Integer,Integer>();

        for(int i = 0; i < n; i++){
            int e = in.nextInt();
            map.put(e, i);
        }
        System.out.println(map.get(v));
        
        in.close();
    }
    

}
