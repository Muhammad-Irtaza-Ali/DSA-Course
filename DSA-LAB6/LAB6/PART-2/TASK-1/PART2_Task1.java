import java.util.Arrays;

public class PART2_Task1 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = m, j = 0; i < m + n; i++, j++) {
            nums1[i] = nums2[j];
        }
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        PART2_Task1 solution = new PART2_Task1();
        solution.merge(nums1, m, nums2, n);
        System.out.println("Output: " + Arrays.toString(nums1));  // Output: [1, 2, 2, 3, 5, 6]

        // Example 2
        nums1 = new int[]{1};
        m = 1;
        nums2 = new int[]{};
        n = 0;

        solution.merge(nums1, m, nums2, n);
        System.out.println("Output: " + Arrays.toString(nums1));  // Output: [1]

        // Example 3
        nums1 = new int[]{0};
        m = 0;
        nums2 = new int[]{1};
        n = 1;

        solution.merge(nums1, m, nums2, n);
        System.out.println("Output: " + Arrays.toString(nums1));  // Output: [1]
    }
}
