/*Exercise 3: Insert an element at the end of the array.
 Start with the array {3, 6, 9, 12, 15}.
 Insert the value 18 at the end.
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa.lab1;

/**
 *
 * @author Irtaza Ali
 */
public class task2Exercise3 {
     public static void main(String args[]){
       int[] arr ={3, 6, 9, 12, 15,0};
    int insertElement=18;
   arr[arr.length-1]=insertElement;
    for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");    
     } 
}}
