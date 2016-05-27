package com.jackson.hackerrank;

import java.util.Scanner;

public class InsertionSort2 {
    public static void insertionSortPart2(int[] ar)
    {       
        int len = ar.length;
        int i = 1;
        while (i < len){
            int j = i;
            while (ar[j-1] > ar[j]){
                int temp = ar[j];
                ar[j] = ar[j-1];
                ar[j-1] = temp;
                j--;
                if (j<=0) {
                    break;
                }
            }
            printArray(ar);
            i++;
        }
    }  
    
    
      
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
       }
       insertionSortPart2(ar);    
                    
    }    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
}
