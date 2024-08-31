/*Exercise 2: Insert an element in the middle of the array.
 Start with the array {100, 200, 300, 400, 500}.
 Insert the value 250 at the 2nd index.
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa.lab1;

/**
 *
 * @author Irtaza Ali
 */
public class task2Exercise2 {
        public static void main(String args[]){
       int[] arr ={100, 200, 300, 400, 500,0};
     int insertIndex=2;
       int insertElement=250;
   for(int i=arr.length-1;i>insertIndex;i--){
   arr[i]=arr[i-1];    
     }  
arr[insertIndex]=insertElement;
for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");    
     }}  
}
