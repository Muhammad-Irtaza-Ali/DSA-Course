
package com.mycompany.lab6sortingalgo1;


public class Task2 {
    public static void Bubble_sort(int[] arr){
        boolean swapped=false;
     //   int count=1;
for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j <arr.length-i-1; j++) {
               // System.out.print("Step:"+count++);
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
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
      int[] arr={1,3,2,4,5};
       // Calling Function
    System.out.print("Un-sorted Array:");
        for(int a:arr){
            System.out.print(a+" ");}
      Bubble_sort(arr);
    }}
    
    
    
    
    
    
    
    
