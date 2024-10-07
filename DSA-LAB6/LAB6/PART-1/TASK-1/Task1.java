
package com.mycompany.lab6sortingalgo1;

/**
 *
 * @author Irtaza Ali
 */
public class Task1 {
    //Function of Bubble Sort
   public static void Bubble_sort(int[] arr){
for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j <arr.length-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];// SWAPPING
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.print("\nSorted array: ");
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    
    
    
    public static void main(String[] args) {
      int[] arr={5,1,3,4,6,2};
    // Calling Function
        System.out.print("Un-sorted Array:");
        for(int a:arr){
            System.out.print(a+" ");}
      
        Bubble_sort(arr);
    }}
    
    
    
    
    
    
    
    
