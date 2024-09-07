/* **Find Common Elements Between Two Arrays:
   - **Problem Statement**: Given two integer arrays, count the number of elements in the first array that exist in the second, and vice versa.
   - **Example**:
     - Input: `nums1 = [4, 3, 2]`, `nums2 = [2, 2, 3]`
     - Output: `[3, 2]`
   - **Solution Approach**: Use an array to count occurrences and compare the arrays.

*/



  import java.util.HashSet;
public class Task5 {
    public static int[] countCommonIndices(int[] nums1, int[] nums2) {
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();

        // Add all elements of nums1 to set1
        for(int num:nums1){
            set1.add(num);}

        // Add all elements of nums2 to set2
        for(int num:nums2){
            set2.add(num);}

        // Calculate answer1: count how many elements in nums1 exist in nums2
        int answer1=0;
        for(int num:nums1) {
            if(set2.contains(num)){
                answer1++;
            }}
// Calculate answer2: count how many elements in nums2 exist in nums1
        int answer2=0;
        for(int num:nums2){
            if(set1.contains(num)){
                answer2++;
            }}
return new int[] {answer1,answer2}; }
 public static void main(String[] args) {
        int[] nums1_1 ={2,3,2};
        int[] nums2_1 ={1,2};
        System.out.println("Output: [" +countCommonIndices(nums1_1,nums2_1)[0] + "," + countCommonIndices(nums1_1, nums2_1)[1] + "]"); // Output: [2, 1]

        int[] nums1_2 ={4,3,2,3,1};
        int[] nums2_2 ={2,2,5,2,3,6};
        System.out.println("Output: ["+countCommonIndices(nums1_2,nums2_2)[0] + "," + countCommonIndices(nums1_2, nums2_2)[1] + "]"); // Output: [3, 4]

        int[] nums1_3 ={3,4,2,3};
        int[] nums2_3 ={1,5};
        System.out.println("Output: ["+countCommonIndices(nums1_3, nums2_3)[0] + "," + countCommonIndices(nums1_3, nums2_3)[1] + "]"); // Output: [0, 0]
    }  
}
