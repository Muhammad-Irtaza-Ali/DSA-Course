import java.util.ArrayList;
import java.util.Arrays;

public class PART2_Task2 {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int num : nums1) {
            list1.add(num);
        }
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int num : nums2) {
            if (list1.contains(num)) {
                list2.add(num);
                list1.remove(Integer.valueOf(num));
            }
        }
        int[] res = new int[list2.size()];
        for (int i = 0; i < list2.size(); i++) {
            res[i] = list2.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        PART2_Task2 solution = new PART2_Task2();

        // Example 1
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] result = solution.intersect(nums1, nums2);
        System.out.println("Output: " + Arrays.toString(result));  // Output: [2, 2]

        // Example 2
        nums1 = new int[]{4, 9, 5};
        nums2 = new int[]{9, 4, 9, 8, 4};
        result = solution.intersect(nums1, nums2);
        System.out.println("Output: " + Arrays.toString(result));  // Output: [4, 9] or [9, 4]
    }
}
