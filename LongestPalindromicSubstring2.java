//code is to find the longest palindromic substring in a string with all the explanation needed

public class LongestPalindromicSubstring2 {

    /**
     * Finds the longest palindromic substring in a given string.
     *
     * This implementation uses the "expand around center" strategy, which is one
     * of the most intuitive approaches to this problem. It has a time complexity
     * of O(n^2), where n is the length of the string.
     *
     * @param s The input string.
     * @return The longest palindromic substring.
     */
    public String longestPalindrome(String s) {
        // If the string is empty or null, there is no palindrome.
        if (s == null || s.length() < 1) {
            return "";
        }

        // Initialize variables to keep track of the longest palindrome found so far.
        // We'll store the start and end indices.
        int start = 0;
        int end = 0;

        // Iterate through each character of the string, considering it as a potential center.
        for (int i = 0; i < s.length(); i++) {
            // 1. Check for odd-length palindromes (center is a single character)
            int len1 = expandAroundCenter(s, i, i);

            // 2. Check for even-length palindromes (center is between two characters)
            int len2 = expandAroundCenter(s, i, i + 1);

            // Find the maximum length between the two possibilities
            int len = Math.max(len1, len2);

            // If the newly found palindrome is longer than our current max
            if (len > end - start) {
                // The new start index is calculated based on the center and the new length.
                // The formula for the start index is:
                // i - (len - 1) / 2
                start = i - (len - 1) / 2;
                // The new end index is:
                // i + len / 2
                end = i + len / 2;
            }
        }

        // Return the substring from the calculated start and end indices.
        return s.substring(start, end + 1);
    }

    /**
     * Helper method to expand outwards from a given center (or two-character center)
     * to find the length of the palindrome.
     *
     * @param s The input string.
     * @param left The left index of the center.
     * @param right The right index of the center.
     * @return The length of the palindrome centered at the given indices.
     */
    private int expandAroundCenter(String s, int left, int right) {
        // While the indices are valid and the characters match, expand.
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // The length is the difference between the final right and left indices, minus 1.
        // This is because the loop stops when the characters don't match, so we
        // need to subtract the extra expansion.
        return right - left - 1;
    }

    public static void main(String[] args) {
        LongestPalindromicSubstring2 solution = new LongestPalindromicSubstring2();
        
        // Test cases to demonstrate the function
        System.out.println("Longest palindrome in 'babad' is: '" + solution.longestPalindrome("babad") + "'");
        System.out.println("Longest palindrome in 'cbbd' is: '" + solution.longestPalindrome("cbbd") + "'");
        System.out.println("Longest palindrome in 'a' is: '" + solution.longestPalindrome("a") + "'");
        System.out.println("Longest palindrome in 'racecar' is: '" + solution.longestPalindrome("racecar") + "'");
        System.out.println("Longest palindrome in 'abacaba' is: '" + solution.longestPalindrome("abacaba") + "'");
        System.out.println("Longest palindrome in 'banana' is: '" + solution.longestPalindrome("banana") + "'");
    }
}

