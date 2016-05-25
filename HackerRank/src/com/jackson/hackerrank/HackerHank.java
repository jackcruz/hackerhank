package com.jackson.hackerrank;
import java.util.HashSet;
import java.util.Set;

public class HackerHank {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String line =sc.nextLine();
        
//        int t = in.nextInt();
//        for(int a0 = 0; a0 < t; a0++){
//            int n = in.nextInt();
//        }
        
        String s = "We promptly judged antique ivory buckles for the prize";
        utopianTree(0);
        pangram(s);
        
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
