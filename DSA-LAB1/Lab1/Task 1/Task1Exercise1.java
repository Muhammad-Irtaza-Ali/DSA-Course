/*Exercise 1: Declare an integer array of size 6 and initialize it with the values {5, 15, 25, 35, 45,55}. 
            Write a program to print all elements of the array.


 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa.lab1;

/**
 *
 * @author Irtaza Ali
 */
public class Task1Exercise1 {
    public static void main(String args[]){
  int[] arr = new int[6];
  arr[0]=5;
  arr[1]=15;  
  arr[2]=25;
  arr[3]=35;
  arr[4]=45;
  arr[5]=55;
   for(int i=0;i<arr.length;i++){
       System.out.print(arr[i]+" ");}  
    
    
    
    }  
}
