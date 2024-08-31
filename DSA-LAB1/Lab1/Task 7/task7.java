/* Given two strings, determine if they are anagrams of each other. Two strings are considered
anagrams if they contain the same characters in the same frequencies but possibly in a different
order.
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa.lab1;

/**
 *
 * @author Irtaza Ali
 */
public class task7 {
    static boolean anagram(String word1, String word2) {
        // If lengths are not the same, they can't be anagrams
        if (word1.length() != word2.length()) {
            return false;
        }
        // Create frequency counters for both words
        int[] charCount1 = new int[256]; // Assumes ASCII characters
        int[] charCount2 = new int[256];
// Count the frequency of each character in both strings
        for (int i = 0; i < word1.length(); i++) {
            charCount1[word1.charAt(i)]=charCount1[word1.charAt(i)]+1;
            charCount2[word2.charAt(i)]=charCount2[word2.charAt(i)]+1;
        }
        for (int i = 0; i < 256; i++) {
            if (charCount1[i] != charCount2[i]) {
                return false;
            }
        }
        
        return true; // If all frequencies match, they are anagrams
    }

    public static void main(String[] args) {
        String word1 = "hello";
        String word2 = "world";
        
        if (anagram(word1, word2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not anagram");
        }        
    }
}


