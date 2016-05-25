package com.jackson.hackerrank;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangram {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line =in.nextLine();
        pangram(line);
        
        in.close();

    }
    
    public static void pangram (String input) {
        input = input.toLowerCase().replaceAll(" ", "").trim();
        
        char arr[] = input.toCharArray();
        
        Set<String> alphabet = new HashSet<String>();
        
        for (int i = 0; i < arr.length; i++) {
            alphabet.add(String.valueOf(arr[i]));
        }
        
        if (alphabet.size() == 26) {
            System.out.println("pangram");
        }
        else {
            System.out.println("not pangram");
        }
    }


}
