/*  **Count Pairs with Absolute Difference k:
   - **Problem Statement**: Given an array of integers `nums` and an integer `k`, return the number of pairs `(i, j)` such that `|nums[i] - nums[j]| == k`.
   - **Example**:
     - Input: `nums = [1, 2, 2, 1]`, `k = 1`
     - Output: `4`
   - **Solution Approach**: Use a hash map to efficiently count pairs.
  

*/
public class Task4 {
    public static int countKDifference(int[] nums, int k) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(Math.abs(nums[i]-nums[j]) ==k){
                    count++;
                }}}

        return count;
    }
public static void main(String[] args){
        int[] nums1={1,2,2,1};
        int k1 = 1;
        System.out.println("Output: " + countKDifference(nums1,k1)); // Output: 4

        int[] nums2={1,3};
        int k2=3;
        System.out.println("Output: " +countKDifference(nums2,k2)); // Output: 0

        int[] nums3={3, 2, 1, 5, 4};
        int k3 = 2;
        System.out.println("Output: "+countKDifference(nums3,k3)); // Output: 3
    }}


