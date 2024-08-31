/*Objective: Practice inserting elements at different positions in an array.
Exercise 1: Insert an element at the start of the array.
 Start with the array {12, 24, 36, 48, 60}.
 Insert the value 6 at the beginning.
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa.lab1;

/**
 *
 * @author Irtaza Ali
 */
public class task2Exercise1 {
        public static void main(String args[]){
       int[] arr ={12, 24, 36, 48, 60,0};
   int insertElement=6;
   for(int i=arr.length-1;i>0;i--){
   arr[i]=arr[i-1];    
     }  
arr[0]=insertElement;
for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");    
     }
}}
