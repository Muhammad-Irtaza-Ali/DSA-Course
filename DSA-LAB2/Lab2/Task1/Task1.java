/* Concatenation of Array:
   - **Problem Statement**: Given an integer array `nums`, create an array `ans` such that `ans[i] == nums[i]` and `ans[i + n] == nums[i]`, where `n` is the length of `nums`.
   - **Example**:
     - Input: `nums = [1, 2, 1]`
     - Output: `[1, 2, 1, 1, 2, 1]`
   - **Solution Approach**: Using a loop to construct a new array that concatenates two copies of the original array.
      

*/

import java.util.Arrays;
public class Task1{
   public static int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] ans=new int[2*n];
        for(int i=0;i<n;i++){
            ans[i]=nums[i];
            ans[i+n]=nums[i] ;}
        return ans;
  }
   public static void main(String[] args){
        int[] nums1 ={1, 2, 1};
        int[] result1 =getConcatenation(nums1);
        System.out.println("Output: " + Arrays.toString(result1));

        int[] nums2={1, 3, 2, 1};
        int[] result2 =getConcatenation(nums2);
        System.out.println("Output: " + Arrays.toString(result2));
    }}
 

