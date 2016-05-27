package com.jackson.hackerrank;

import java.util.Scanner;

public class InsertionSort1 {

    public static void insertIntoSorted(int[] ar) {
        int lastNumber = ar[ar.length-1];
        int i = ar.length-2;
        while (lastNumber <= ar[i]) {
            ar[i+1] = ar[i];
            i--;
            printArray(ar);
            if (i<0) {
                break;
            }
        }
        ar[i+1] = lastNumber;
        printArray(ar);
    }
    
    
/* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
        }
        insertIntoSorted(ar);
        in.close();
    }
    
    
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
