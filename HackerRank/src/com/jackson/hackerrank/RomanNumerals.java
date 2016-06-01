package com.jackson.hackerrank;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class RomanNumerals {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //input int number representing the number of test cases to be run. Which is the number of roman numerals to be converted to decimal
        int r = in.nextInt();
        int d = in.nextInt();
        for (int i = 0; i < r; i++) {
            String romanNumeral = in.next();
            System.out.println(romanToDecimal(romanNumeral));
        }
        for (int i = 0; i < d; i++) {
            int decimalNumber = in.nextInt();
            System.out.println(decimalToRoman(decimalNumber));
        }
        
        in.close();
    }
    
    public static int romanToDecimal (String romanNumeral) {
        HashMap<String, Integer> romanMap = new HashMap<String, Integer>();
        romanMap.put("M", 1000);
        romanMap.put("D", 500);
        romanMap.put("C", 100);
        romanMap.put("L", 50);
        romanMap.put("X", 10);
        romanMap.put("V", 5);
        romanMap.put("I", 1);
        int maxNumber = 0;
        int finalNumber = 0;
        char[] romanChars = romanNumeral.toCharArray();
        
        for (int i = romanChars.length -1 ; i >=0; i--) {
            if (romanMap.get(String.valueOf(romanChars[i])).intValue() >= maxNumber) {
                maxNumber = romanMap.get(String.valueOf(romanChars[i]));
                finalNumber += maxNumber;
            }
            else {
                finalNumber -= romanMap.get(String.valueOf(romanChars[i]));
            }
        }
        
        return finalNumber;
        
    }

    
    public static String decimalToRoman (int decimal) {
        HashMap<Integer, String> romanMap = new HashMap<Integer, String>();
        romanMap.put(1000,"M");
        romanMap.put(900,"CM");
        romanMap.put(500,"D");
        romanMap.put(400,"CD");
        romanMap.put(100,"C");
        romanMap.put(90,"XC");
        romanMap.put(50,"L");
        romanMap.put(10,"X");
        romanMap.put(9,"IX");
        romanMap.put(5,"V");
        romanMap.put(4,"IV");
        romanMap.put(1,"I");
        
        
        LinkedList<Integer> decimalRep = new LinkedList<Integer>();
        
        String romanNumeral = "";
        decimalRep.push(1);
        decimalRep.push(4);
        decimalRep.push(9);
        decimalRep.push(10);
        decimalRep.push(40);
        decimalRep.push(50);
        decimalRep.push(90);
        decimalRep.push(100);
        decimalRep.push(400);
        decimalRep.push(500);
        decimalRep.push(900);
        decimalRep.push(1000);
        
        int numberToConvert = decimal;
        
        while (numberToConvert > 0) {
            int divider = decimalRep.pop();
            int mod = numberToConvert % divider;
            int div = numberToConvert / divider;
            for (int i = 0; i < div; i++) {
                romanNumeral += romanMap.get(divider);
            }
            numberToConvert = mod;
        }
        
        
        return romanNumeral;
    }
}
