package beginner.arrays;

import java.util.Arrays;


public class ArraysProblem {
    
    public static void main(String[] args) {
        // Test cases for each problem
        int[] arr1 = {5, 9, 2, 8, 1, 7, 3};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
        int[] arr3 = {3, 3, 5, 5, 5, 7, 9, 9};
        int[] arr4 = {1, 2, 4, 5, 6}; // Missing 3
        int[] arr5 = {2, 7, 11, 15};
        int[] arr6 = {1, 3, 5, 7};
        int[] arr7 = {2, 4, 6, 8, 10};
        
        System.out.println("1. Maximum Element: " + findMax(arr1));
        
        System.out.println("\n2. Reverse Array:");
        System.out.println("Before: " + Arrays.toString(arr2));
        reverseArray(arr2);
        System.out.println("After: " + Arrays.toString(arr2));
        
        System.out.println("\n3. Average of Array Elements: " + calculateAverage(arr1));
        
        System.out.println("\n4. Count Occurrences of 5: " + countOccurrences(arr3, 5));
        
        System.out.println("\n5. Missing Number in Sequence: " + findMissingNumber(arr4));
        
        System.out.println("\n6. Remove Duplicates from Sorted Array:");
        System.out.println("Before: " + Arrays.toString(arr3));
        int newLength = removeDuplicates(arr3);
        System.out.println("After: " + Arrays.toString(Arrays.copyOfRange(arr3, 0, newLength)));
        
        System.out.println("\n7. Rotate Array by 3 positions:");
        System.out.println("Before: " + Arrays.toString(arr1));
        rotateArray(arr1, 3);
        System.out.println("After: " + Arrays.toString(arr1));
        
        System.out.println("\n8. Two Sum (target = 9): ");
        int[] twoSumResult = twoSum(arr5, 9);
        System.out.println("Indices: " + Arrays.toString(twoSumResult));
        System.out.println("Values: " + arr5[twoSumResult[0]] + " + " + arr5[twoSumResult[1]] + " = 9");
        
        System.out.println("\n9. Merge Two Sorted Arrays:");
        System.out.println("Array 1: " + Arrays.toString(arr6));
        System.out.println("Array 2: " + Arrays.toString(arr7));
        int[] mergedArray = mergeSortedArrays(arr6, arr7);
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
        
        System.out.println("\n10. Second Largest Element: " + findSecondLargest(arr1));
    }
    
    /**
     * Problem 1: Find the maximum element in an array
     * Time Complexity: O(n)
     */
    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }
        
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    
    /**
     * Problem 2: Reverse an array in-place
     * Time Complexity: O(n/2) = O(n)
     */
    public static void reverseArray(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            // Swap elements at left and right indices
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            // Move indices towards center
            left++;
            right--;
        }
    }
    
    /**
     * Problem 3: Calculate the average of array elements
     * Time Complexity: O(n)
     */
    public static double calculateAverage(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }
        
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        
        return (double) sum / arr.length;
    }
    
    /**
     * Problem 4: Count occurrences of a specific value
     * Time Complexity: O(n)
     */
    public static int countOccurrences(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        
        int count = 0;
        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }
    
    /**
     * Problem 5: Find missing number in a sequence
     * Assumes array contains n distinct numbers from 1 to n+1 with one number missing
     * Time Complexity: O(n)
     */
    public static int findMissingNumber(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }
        
        int n = arr.length + 1; // Expected size including the missing number
        int expectedSum = (n * (n + 1)) / 2; // Sum of numbers from 1 to n
        
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        
        return expectedSum - actualSum;
    }
    
    /**
     * Problem 6: Remove duplicates from a sorted array
     * Returns the new length of the array after removing duplicates
     * Time Complexity: O(n)
     */
    public static int removeDuplicates(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        
        // Index to place the next non-duplicate element
        int insertIndex = 1;
        
        for (int i = 1; i < arr.length; i++) {
            // If current element is different from the previous one
            if (arr[i] != arr[i - 1]) {
                arr[insertIndex] = arr[i];
                insertIndex++;
            }
        }
        
        return insertIndex;
    }
    
    /**
     * Problem 7: Rotate array by K positions
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static void rotateArray(int[] arr, int k) {
        if (arr == null || arr.length <= 1 || k % arr.length == 0) {
            return; // No need to rotate
        }
        
        int n = arr.length;
        k = k % n; // Handle case when k > n
        
        // Reverse the entire array
        reverse(arr, 0, n - 1);
        
        // Reverse the first k elements
        reverse(arr, 0, k - 1);
        
        // Reverse the remaining elements
        reverse(arr, k, n - 1);
    }
    
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    /**
     * Problem 8: Find two numbers that add up to a target (Two Sum)
     * Returns indices of the two numbers
     * Time Complexity: O(n²) - brute force approach
     * Space Complexity: O(1)
     */
    public static int[] twoSum(int[] arr, int target) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array is too small");
        }
        
        // Brute force approach - try all possible pairs
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        
        throw new IllegalArgumentException("No solution found");
    }
    
    /**
     * Problem 9: Merge two sorted arrays
     * Time Complexity: O(n + m)
     * Space Complexity: O(n + m)
     */
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        if (arr1 == null) {
            return arr2;
        }
        if (arr2 == null) {
            return arr1;
        }
        
        int[] result = new int[arr1.length + arr2.length];
        
        int i = 0, j = 0, k = 0;
        
        // Compare elements from both arrays and add smaller one to result
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }
        
        // Add remaining elements from first array
        while (i < arr1.length) {
            result[k++] = arr1[i++];
        }
        
        // Add remaining elements from second array
        while (j < arr2.length) {
            result[k++] = arr2[j++];
        }
        
        return result;
    }
    
    /**
     * Problem 10: Find the second largest element in an array
     * Time Complexity: O(n)
     */
    public static int findSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array should have at least two elements");
        }
        
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        
        if (secondLargest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("No second largest element found");
        }
        
        return secondLargest;
    }
}
