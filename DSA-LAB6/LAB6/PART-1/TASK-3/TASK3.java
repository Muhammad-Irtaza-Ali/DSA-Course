
package com.mycompany.lab6sortingalgo1;

public class TASK3 {
     public static void Bubble_sort(String[] arr){
        boolean swapped=false;
        
for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j <arr.length-i-1; j++) {
                if (arr[j].length() > arr[j+1].length()) {
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped=true;
                }
            }
            if (!swapped) {
                break;
            }
        }

        System.out.print("\nSorted array: ");
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    
    
    
    public static void main(String[] args) {
      String[] arr={"apple", "pie", "banana", "cat","a"};
      // Calling Function
        System.out.print("Un-sorted Array:");
        for(String a:arr){
            System.out.print(a+" ");}
      
      Bubble_sort(arr);
        
        
    }
}
