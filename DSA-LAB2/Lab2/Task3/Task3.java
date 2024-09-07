/* **Maximum Number of Words in Sentences:
   - **Problem Statement**: Given an array of sentences, return the maximum number of words in any single sentence.
   - **Example**:
     - Input: `sentences = ["this is great", "I love coding"]`
     - Output: `3`
   - **Solution Approach**: Split each sentence by spaces and count the number of words.

*/
public class Task3{
    public static int mostWordsFound(String[] sentences){
        int maxWords=0;
 for (String sentence:sentences){
      String[] words=sentence.split(" ");
          if (words.length>maxWords){
                maxWords=words.length;
            }  }
return maxWords;
    }
    public static void main(String[] args){
        String[] sentences1 ={"alice and bob love leetcode","i think so too","this is great thanks very much"};
        System.out.println("Output: "+mostWordsFound(sentences1)); // Output: 6
     
        String[] sentences2 = {"please wait","continue to fight","continue to win"};
        System.out.println("Output: "+mostWordsFound(sentences2)); // Output: 3
    }}
   

