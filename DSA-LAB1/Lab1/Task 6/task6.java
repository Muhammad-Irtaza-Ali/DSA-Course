/* A palindrome is a sequence of characters that reads the same forward and backward. In the
context of strings, a palindrome is a word, phrase, or sequence that remains unchanged when its
characters are reversed. For example, &quot;madam&quot; and &quot;racecar&quot; are palindromes, while &quot;hello&quot; is
not.
Task: Given a string, check if it is a palindrome or not. A string is considered a palindrome if it
reads the same forward and backward.
Hint: The string str is converted to a array of characters using the .toCharArray() method.
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa.lab1;

/**
 *
 * @author Irtaza Ali
 */
public class task6{
    static boolean palindrome(String word){
int left=0;
int right=word.length()-1;
while(left<=right){
    if(word.charAt(right)!= word.charAt(left)){
    return false;}
left++;
right--;
}return true;
}
             public static void main(String[] args){
           String str="radar";
                if(palindrome(str)){
                    System.out.println("Palindorme");}
                else{
                    System.out.println("Not Palindrome");}
                 
                 }}
