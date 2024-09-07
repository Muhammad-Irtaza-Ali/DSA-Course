/* Find Words Containing a Specific Character:
   - **Problem Statement**: Given an array of strings and a character, return an array of indices representing the words that contain the character.
   - **Example**:
     - Input: `words = ["leet", "code"]`, `x = 'e'`
     - Output: `[0, 1]`
   - **Solution Approach**: Check each word for the character and store its index if the character is found.


*/
 import java.util.ArrayList;
import java.util.List;
public class Task2 {
    public static List<Integer> findIndices(String[] words,char x){
        List<Integer> indices =new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(words[i].indexOf(x) != -1){
                indices.add(i);
            }}
        return indices;
 }
  public static void main(String[] args){
      String[] words1={"leet","code"};
        char x1='e';
        System.out.println("Output: " + findIndices(words1,x1)); //Output: [0, 1]

        String[] words2={"abc","bcd","aaaa","cbc"};
        char x2 = 'a';
        System.out.println("Output: " + findIndices(words2,x2)); //Output: [0, 2]

        String[] words3 = {"abc","bcd","aaaa","cbc"};
        char x3 = 'z';
        System.out.println("Output: "+findIndices(words3, x3)); //Output: []
    }
}

