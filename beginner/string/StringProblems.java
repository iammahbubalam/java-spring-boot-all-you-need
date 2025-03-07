package beginner.string;

/**
 * This class implements 10 classical string problems using brute force approaches
 * and raw Java without Collections Framework
 */
public class StringProblems {
    
    public static void main(String[] args) {
        System.out.println("===== 10 CLASSICAL STRING PROBLEMS =====");
        
        // 1. String Reversal
        String str = "Hello, World!";
        System.out.println("\n1. String Reversal:");
        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reverseString(str));
        
        // 2. Palindrome Check
        System.out.println("\n2. Palindrome Check:");
        String palindrome = "A man, a plan, a canal, Panama!";
        String notPalindrome = "Hello, World!";
        System.out.println("Is '" + palindrome + "' a palindrome? " + isPalindrome(palindrome));
        System.out.println("Is '" + notPalindrome + "' a palindrome? " + isPalindrome(notPalindrome));
        
        // 3. Anagram Detection
        System.out.println("\n3. Anagram Detection:");
        String str1 = "listen";
        String str2 = "silent";
        String str3 = "hello";
        System.out.println("Are '" + str1 + "' and '" + str2 + "' anagrams? " + areAnagrams(str1, str2));
        System.out.println("Are '" + str1 + "' and '" + str3 + "' anagrams? " + areAnagrams(str1, str3));
        
        // 4. String Compression
        System.out.println("\n4. String Compression:");
        String uncompressed1 = "aabbbccccaaa";
        String uncompressed2 = "abcde";
        System.out.println("Compression of '" + uncompressed1 + "': " + compressString(uncompressed1));
        System.out.println("Compression of '" + uncompressed2 + "': " + compressString(uncompressed2));
        
        // 5. Valid Parentheses
        System.out.println("\n5. Valid Parentheses:");
        String validParens = "({[]})";
        String invalidParens = "({[)]}";
        System.out.println("Is '" + validParens + "' balanced? " + hasValidParentheses(validParens));
        System.out.println("Is '" + invalidParens + "' balanced? " + hasValidParentheses(invalidParens));
        
        // 6. Longest Common Prefix
        System.out.println("\n6. Longest Common Prefix:");
        String[] strs1 = {"flower", "flow", "flight"};
        String[] strs2 = {"dog", "racecar", "car"};
        System.out.println("Longest common prefix in [flower, flow, flight]: " + 
                           longestCommonPrefix(strs1));
        System.out.println("Longest common prefix in [dog, racecar, car]: " + 
                           longestCommonPrefix(strs2));
        
        // 7. String Permutation Generation
        System.out.println("\n7. String Permutation Generation:");
        String permStr = "ABC";
        System.out.println("Permutations of '" + permStr + "':");
        generateAndPrintPermutations(permStr);
        
        // 8. Word Frequency Counter
        System.out.println("\n8. Word Frequency Counter:");
        String text = "the quick brown fox jumps over the lazy dog. the fox is quick.";
        System.out.println("Text: " + text);
        System.out.println("Word frequencies:");
        printWordFrequency(text);
        
        // 9. String Pattern Matching
        System.out.println("\n9. String Pattern Matching:");
        String haystack = "hello world";
        String needle1 = "world";
        String needle2 = "java";
        System.out.println("Is '" + needle1 + "' found in '" + haystack + "'? " + 
                          (findPattern(haystack, needle1) != -1));
        System.out.println("Is '" + needle2 + "' found in '" + haystack + "'? " + 
                          (findPattern(haystack, needle2) != -1));
        
        // 10. Longest Substring Without Repeating Characters
        System.out.println("\n10. Longest Substring Without Repeating Characters:");
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";
        System.out.println("Longest substring length in '" + s1 + "': " + 
                          lengthOfLongestSubstring(s1));
        System.out.println("Longest substring length in '" + s2 + "': " + 
                          lengthOfLongestSubstring(s2));
        System.out.println("Longest substring length in '" + s3 + "': " + 
                          lengthOfLongestSubstring(s3));
    }
    
    /**
     * Problem 1: String Reversal
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public static String reverseString(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        
        // Swap characters from both ends moving inward
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        
        return new String(chars);
    }
    
    /**
     * Problem 2: Palindrome Check
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static boolean isPalindrome(String s) {
        if (s == null || s.length() <= 1) {
            return true;
        }
        
        // Convert to lowercase
        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            // Skip non-alphanumeric characters from left
            while (left < right && !isAlphaNumeric(s.charAt(left))) {
                left++;
            }
            
            // Skip non-alphanumeric characters from right
            while (left < right && !isAlphaNumeric(s.charAt(right))) {
                right--;
            }
            
            // Compare characters
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            
            left++;
            right--;
        }
        
        return true;
    }
    
    // Helper method to check if character is alphanumeric
    private static boolean isAlphaNumeric(char c) {
        return (c >= 'a' && c <= 'z') || 
               (c >= 'A' && c <= 'Z') || 
               (c >= '0' && c <= '9');
    }
    
    /**
     * Problem 3: Anagram Detection
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static boolean areAnagrams(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() != s2.length()) {
            return false;
        }
        
        // Use frequency counter approach with arrays
        int[] charCount = new int[26]; // Assuming lowercase English letters
        
        // Count frequency of each character in s1
        for (int i = 0; i < s1.length(); i++) {
            charCount[s1.charAt(i) - 'a']++;
        }
        
        // Decrement frequency for each character in s2
        for (int i = 0; i < s2.length(); i++) {
            charCount[s2.charAt(i) - 'a']--;
            // If at any point the count is negative, strings are not anagrams
            if (charCount[s2.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        
        return true;
    }
    
    /**
     * Problem 4: String Compression
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public static String compressString(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        
        StringBuilder compressed = new StringBuilder();
        int count = 1;
        
        for (int i = 1; i <= s.length(); i++) {
            // If we're still within the same character, increment count
            if (i < s.length() && s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                // Append character and its count
                compressed.append(s.charAt(i - 1));
                compressed.append(count);
                count = 1; // Reset counter for the next character
            }
        }
        
        // Return original string if compression doesn't save space
        return compressed.length() < s.length() ? compressed.toString() : s;
    }
    
    /**
     * Problem 5: Valid Parentheses
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * Implements a stack using arrays instead of java.util.Stack
     */
    public static boolean hasValidParentheses(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }
        
        // Create a simple stack using an array
        char[] stack = new char[s.length()];
        int top = -1; // Stack pointer
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == '(' || c == '{' || c == '[') {
                // Push opening brackets to stack
                stack[++top] = c;
            } else if (c == ')' || c == '}' || c == ']') {
                // For closing brackets, check if stack is empty
                if (top == -1) {
                    return false;
                }
                
                // Check if brackets match
                char openBracket = stack[top--];
                if (!areBracketsMatching(openBracket, c)) {
                    return false;
                }
            }
        }
        
        // Stack should be empty if all brackets are matched
        return top == -1;
    }
    
    private static boolean areBracketsMatching(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }
    
    /**
     * Problem 6: Longest Common Prefix
     * Time Complexity: O(S) where S is the sum of all characters in all strings
     * Space Complexity: O(1)
     */
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        // Take first string as reference
        String prefix = strs[0];
        
        for (int i = 1; i < strs.length; i++) {
            // While current string doesn't start with the prefix, reduce prefix length
            while (!startsWith(strs[i], prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        
        return prefix;
    }
    
    // Helper method to check if str starts with prefix
    private static boolean startsWith(String str, String prefix) {
        if (str.length() < prefix.length()) {
            return false;
        }
        
        for (int i = 0; i < prefix.length(); i++) {
            if (str.charAt(i) != prefix.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * Problem 7: String Permutation Generation
     * Time Complexity: O(n*n!)
     * Space Complexity: O(n)
     * Prints permutations instead of returning them to avoid using collections
     */
    public static void generateAndPrintPermutations(String s) {
        if (s == null || s.isEmpty()) {
            return;
        }
        
        generatePermutationsHelper(s.toCharArray(), 0);
    }
    
    private static void generatePermutationsHelper(char[] chars, int index) {
        if (index == chars.length - 1) {
            // We've fixed all positions, print the permutation
            System.out.println(new String(chars));
            return;
        }
        
        // Try each character at current position
        for (int i = index; i < chars.length; i++) {
            // Swap current position with i
            swap(chars, index, i);
            
            // Recursively generate permutations for next position
            generatePermutationsHelper(chars, index + 1);
            
            // Backtrack - restore the array
            swap(chars, index, i);
        }
    }
    
    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
    
    /**
     * Problem 8: Word Frequency Counter
     * Time Complexity: O(n²)
     * Space Complexity: O(n)
     * Brute force implementation without using HashMap
     */
    public static void printWordFrequency(String text) {
        if (text == null || text.isEmpty()) {
            return;
        }
        
        // Split text into words
        String[] words = text.toLowerCase().split("[^a-zA-Z0-9]+");
        
        // Array to keep track of which words we've counted already
        boolean[] counted = new boolean[words.length];
        
        // Count frequencies with brute force approach
        for (int i = 0; i < words.length; i++) {
            // Skip empty strings and already counted words
            if (words[i].isEmpty() || counted[i]) {
                continue;
            }
            
            int count = 1; // This word appears at least once
            
            // Count additional occurrences
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    counted[j] = true; // Mark as counted
                }
            }
            
            // Print the word and its frequency
            System.out.println(words[i] + ": " + count);
        }
    }
    
    /**
     * Problem 9: String Pattern Matching (Naive implementation)
     * Time Complexity: O(n*m) where n is length of text and m is length of pattern
     * Space Complexity: O(1)
     */
    public static int findPattern(String text, String pattern) {
        if (text == null || pattern == null || pattern.length() > text.length()) {
            return -1;
        }
        
        int n = text.length();
        int m = pattern.length();
        
        // Check each potential starting position
        for (int i = 0; i <= n - m; i++) {
            int j;
            
            // Check if pattern matches at current position
            for (j = 0; j < m; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }
            
            // If entire pattern matched, return starting index
            if (j == m) {
                return i;
            }
        }
        
        return -1; // Pattern not found
    }
    
    /**
     * Problem 10: Longest Substring Without Repeating Characters
     * Time Complexity: O(n²) - brute force approach
     * Space Complexity: O(1)
     */
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        
        int n = s.length();
        int maxLength = 0;
        
        // Try all possible substrings
        for (int i = 0; i < n; i++) {
            // Use a boolean array to track which characters are in current substring
            boolean[] seen = new boolean[128]; // Assuming ASCII character set
            int currentLength = 0;
            
            // Extend current substring as long as there are no repeating characters
            for (int j = i; j < n; j++) {
                char c = s.charAt(j);
                
                // If we've seen this character before, stop extending
                if (seen[c]) {
                    break;
                }
                
                // Mark character as seen and increase length
                seen[c] = true;
                currentLength++;
            }
            
            // Update max length if current substring is longer
            maxLength = Math.max(maxLength, currentLength);
        }
        
        return maxLength;
    }
}
