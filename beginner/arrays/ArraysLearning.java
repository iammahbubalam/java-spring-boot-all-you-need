package beginner.arrays;

public class ArraysLearning {
    public static void main(String[] args) {
        // 1. SINGLE-DIMENSIONAL ARRAYS
        System.out.println("===== SINGLE-DIMENSIONAL ARRAYS =====");
        
        // Declaration of an array
        int[] numbers; // preferred syntax
        int scores[]; // alternative syntax
        
        // Initialization of an array
        numbers = new int[5]; // creates array with 5 elements initialized to 0
        scores = new int[3]; // initialize scores array
        scores[0] = 85;
        scores[1] = 90;
        scores[2] = 95;
        System.out.println("First score: " + scores[0]); // Using the scores array
        
        // Array initialization with values
        int[] primes = {2, 3, 5, 7, 11}; // Array literal initialization
        
        // Accessing array elements (zero-indexed)
        System.out.println("First prime number: " + primes[0]); // Output: 2
        System.out.println("Third prime number: " + primes[2]); // Output: 5
        
        // Modifying array elements
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        
        // Iterating through an array
        System.out.println("Numbers array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
        
        // Enhanced for loop (for-each)
        System.out.println("Prime numbers using for-each loop:");
        for (int prime : primes) {
            System.out.println(prime);
        }
        
        // 2. MULTI-DIMENSIONAL ARRAYS
        System.out.println("\n===== MULTI-DIMENSIONAL ARRAYS =====");
        
        // 2D array declaration and initialization
        int[][] matrix = new int[3][3]; // 3x3 matrix
        
        // Assigning values to a 2D array
        matrix[0][0] = 1; matrix[0][1] = 2; matrix[0][2] = 3;
        matrix[1][0] = 4; matrix[1][1] = 5; matrix[1][2] = 6;
        matrix[2][0] = 7; matrix[2][1] = 8; matrix[2][2] = 9;
        
        // 2D array literal initialization
        int[][] anotherMatrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        // Printing a 2D array
        System.out.println("Matrix contents:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        // Printing another matrix using the previously unused variable
        System.out.println("Another matrix contents:");
        for (int i = 0; i < anotherMatrix.length; i++) {
            for (int j = 0; j < anotherMatrix[i].length; j++) {
                System.out.print(anotherMatrix[i][j] + " ");
            }
            System.out.println();
        }
        
        // Jagged arrays (arrays with different lengths)
        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[3];
        jaggedArray[1] = new int[5];
        jaggedArray[2] = new int[2];
        
        jaggedArray[0][0] = 1; jaggedArray[0][1] = 2; jaggedArray[0][2] = 3;
        jaggedArray[1][0] = 4; jaggedArray[1][1] = 5; jaggedArray[1][2] = 6; 
        jaggedArray[1][3] = 7; jaggedArray[1][4] = 8;
        jaggedArray[2][0] = 9; jaggedArray[2][1] = 10;
        
        System.out.println("Jagged array contents:");
        for (int i = 0; i < jaggedArray.length; i++) {
            System.out.print("Row " + i + " length: " + jaggedArray[i].length + " | Values: ");
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
        
        // 3. ARRAY INITIALIZATION
        System.out.println("\n===== ARRAY INITIALIZATION =====");
        
        // Different ways to initialize arrays
        String[] fruits1 = new String[3]; // Default initialization with null values
        fruits1[0] = "Apple";
        fruits1[1] = "Banana";
        fruits1[2] = "Cherry";
        
        String[] fruits2 = new String[] {"Apple", "Banana", "Cherry"}; // Array with values
        
        String[] fruits3 = {"Apple", "Banana", "Cherry"}; // Shortcut syntax
        
        // Anonymous array (without assigning to a variable)
        System.out.println("First element of anonymous array: " + 
                          new String[] {"First", "Second", "Third"}[0]);
        
        // 4. ARRAY MANIPULATION
        System.out.println("\n===== ARRAY MANIPULATION =====");
        
        // Copying arrays
        int[] source = {1, 2, 3, 4, 5};
        int[] destination = new int[5];
        
        // Manual copy
        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i];
        }
        
        // Printing the copied array
        System.out.println("Manually copied array:");
        for (int num : destination) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // System.arraycopy method
        int[] dest2 = new int[5];
        System.arraycopy(source, 0, dest2, 0, source.length);
        
        // 5. java.util.Arrays CLASS METHODS
        System.out.println("\n===== java.util.Arrays CLASS METHODS =====");
        
        int[] randomNumbers = {43, 32, 53, 23, 12, 34, 3};
        
        // Sorting an array
        java.util.Arrays.sort(randomNumbers);
        System.out.println("Sorted array:");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Binary search (only works on sorted arrays)
        int index = java.util.Arrays.binarySearch(randomNumbers, 32);
        System.out.println("32 found at index: " + index);
        
        // Fill array with a specific value
        int[] filledArray = new int[5];
        java.util.Arrays.fill(filledArray, 7);
        System.out.println("Filled array (all 7s):");
        for (int num : filledArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Compare arrays for equality
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        int[] array3 = {1, 2, 4};
        
        System.out.println("array1 equals array2: " + java.util.Arrays.equals(array1, array2));
        System.out.println("array1 equals array3: " + java.util.Arrays.equals(array1, array3));
        
        // Convert array to String for printing
        System.out.println("Array as string: " + java.util.Arrays.toString(array1));
        
        // For 2D arrays, use deepToString
        System.out.println("2D array as string: " + java.util.Arrays.deepToString(matrix));
        
        // Copying array using Arrays.copyOf
        int[] copiedArray = java.util.Arrays.copyOf(source, source.length);
        System.out.println("Copied with Arrays.copyOf: " + java.util.Arrays.toString(copiedArray));
        
        // Copying a range with Arrays.copyOfRange
        int[] partialArray = java.util.Arrays.copyOfRange(source, 1, 4); // elements at index 1,2,3
        System.out.println("Partial array: " + java.util.Arrays.toString(partialArray));
    }
}
