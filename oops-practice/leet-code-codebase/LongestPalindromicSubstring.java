import java.util.Scanner;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input string from user
        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        // Create object of Solution class
        Solution sol = new Solution();

        // Call the method
        String result = sol.longestPalindrome(s);

        // Print output
        System.out.println("Longest Palindromic Substring: " + result);

        sc.close();
    }
}

// Your given Solution class
class Solution {

    public String longestPalindrome(String s) {
        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = checkpal(s, i, i);     // odd length
            int len2 = checkpal(s, i, i + 1); // even length
            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    static int checkpal(String s, int left, int right) {
        while (left >= 0 && right < s.length()
                && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}

