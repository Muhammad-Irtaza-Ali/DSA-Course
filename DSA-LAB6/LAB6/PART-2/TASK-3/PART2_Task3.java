public class PART2_Task3 {
    public char findTheDifference(String s, String t) {
        String a = t + s;
        char res = 0;
        for (int i = 0; i < a.length(); i++) {
            char c1 = a.charAt(i);
            res = (char) (res ^ c1);  // XOR operation
        }
        return res;
    }

    public static void main(String[] args) {
        PART2_Task3 solution = new PART2_Task3();

        // Example 1
        String s1 = "abcd";
        String t1 = "abcde";
        System.out.println("Output: " + solution.findTheDifference(s1, t1));  // Output: 'e'

        // Example 2
        String s2 = "";
        String t2 = "y";
        System.out.println("Output: " + solution.findTheDifference(s2, t2));  // Output: 'y'
    }
}
