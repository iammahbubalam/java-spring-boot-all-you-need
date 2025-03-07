package beginner;

/**
 * This class demonstrates various control flow mechanisms in Java including:
 * - Conditional statements (if, if-else, nested if, switch)
 * - Loops (for, while, do-while)
 * - Jump statements (break, continue, return)
 * - Enhanced for loop (for-each)
 */
public class ControlFlow {
    
    public static void main(String[] args) {
        // Calling methods to demonstrate different control flow concepts
        demonstrateConditionalStatements();
        demonstrateLoops();
        demonstrateJumpStatements();
        demonstrateEnhancedForLoop();
    }
    
    /**
     * Demonstrates various conditional statements in Java
     */
    public static void demonstrateConditionalStatements() {
        System.out.println("\n===== CONDITIONAL STATEMENTS =====");
        
        // 1. if statement - executes a block of code if a specified condition is true
        System.out.println("\n--- if statement ---");
        int number = 10;
        
        if (number > 0) {
            System.out.println("The number " + number + " is positive");
        }
        
        // 2. if-else statement - executes one block if condition is true, another if false
        System.out.println("\n--- if-else statement ---");
        int temperature = 25;
        
        if (temperature > 30) {
            System.out.println("It's hot outside!");
        } else {
            System.out.println("It's not too hot today. Temperature: " + temperature + "°C");
        }
        
        // 3. if-else-if ladder - checks multiple conditions in sequence
        System.out.println("\n--- if-else-if ladder ---");
        int score = 85;
        
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
        
        // 4. Nested if - if statement inside another if statement
        System.out.println("\n--- Nested if statement ---");
        int age = 25;
        boolean hasLicense = true;
        
        if (age >= 18) {
            System.out.println("Age check: You are eligible to drive");
            
            if (hasLicense) {
                System.out.println("License check: You are legally allowed to drive");
            } else {
                System.out.println("License check: You need to get a license first");
            }
        } else {
            System.out.println("Age check: You are too young to drive");
        }
        
        // 5. switch statement - selects one of many code blocks to be executed
        System.out.println("\n--- switch statement ---");
        char grade = 'B';
        
        switch (grade) {
            case 'A':
                System.out.println("Excellent performance!");
                break;
            case 'B':
                System.out.println("Good performance!");
                break;
            case 'C':
                System.out.println("Average performance");
                break;
            case 'D':
                System.out.println("Below average performance");
                break;
            case 'F':
                System.out.println("Failed");
                break;
            default:
                System.out.println("Invalid grade");
                break;
        }
        
        // Enhanced switch statement (Java 12+)
        // System.out.println("\n--- Enhanced switch statement (Java 12+) ---");
        // String day = "Monday";
        
        // Note: This is a modern switch expression - might not compile in older Java versions
        // String typeOfDay = switch (day) {
        //     case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Weekday";
        //     case "Saturday", "Sunday" -> "Weekend";
        //     default -> "Invalid day";
        // };
        
        // System.out.println(day + " is a " + typeOfDay);
    }
    
    /**
     * Demonstrates various loop constructs in Java
     */
    public static void demonstrateLoops() {
        System.out.println("\n===== LOOPS =====");
        
        // 1. for loop - runs a block of code a specific number of times
        System.out.println("\n--- for loop ---");
        System.out.println("Counting from 1 to 5:");
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }
        
        // Example: Creating a simple pattern
        System.out.println("\nCreating a pattern with for loop:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        // 2. while loop - runs a block of code while a condition is true
        System.out.println("\n--- while loop ---");
        System.out.println("Countdown from 5 to 1:");
        
        int countdown = 5;
        while (countdown > 0) {
            System.out.println("Countdown: " + countdown);
            countdown--;
        }
        
        // 3. do-while loop - always executes once, then checks condition
        System.out.println("\n--- do-while loop ---");
        System.out.println("Guaranteed to run at least once:");
        
        int number = 1;
        do {
            System.out.println("Number: " + number);
            number++;
        } while (number <= 3);
        
        // Example where the condition is initially false
        System.out.println("\nEven when condition is initially false:");
        number = 10;
        do {
            System.out.println("This will print once even though number > 5: " + number);
            number++;
        } while (number <= 5);
    }
    
    /**
     * Demonstrates jump statements in Java
     */
    public static void demonstrateJumpStatements() {
        System.out.println("\n===== JUMP STATEMENTS =====");
        
        // 1. break statement - terminates the loop or switch statement
        System.out.println("\n--- break statement ---");
        System.out.println("Breaking out of a loop when i equals 3:");
        
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Found 3! Breaking out of the loop.");
                break; // Exits the loop when i is 3
            }
            System.out.println("Current value of i: " + i);
        }
        
        // break with labeled statements
        System.out.println("\nBreak with labeled statements:");
        
        outerLoop:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    System.out.println("Breaking out of both loops at i=" + i + ", j=" + j);
                    break outerLoop; // Breaks out of the outer loop
                }
                System.out.println("i=" + i + ", j=" + j);
            }
        }
        
        // 2. continue statement - skips the current iteration and continues with the next
        System.out.println("\n--- continue statement ---");
        System.out.println("Printing only odd numbers from 1 to 5:");
        
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                continue; // Skip even numbers
            }
            System.out.println("Odd number: " + i);
        }
        
        // continue with labeled statements
        System.out.println("\nContinue with labeled statements:");
        
        outerLoop:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    System.out.println("Skipping iteration at i=" + i + ", j=" + j);
                    continue outerLoop; // Continues with the next iteration of the outer loop
                }
                System.out.println("i=" + i + ", j=" + j);
            }
        }
        
        // 3. return statement - exits from the current method
        System.out.println("\n--- return statement ---");
        
        System.out.println("Result from sumIfPositive(5, 10): " + sumIfPositive(5, 10));
        System.out.println("Result from sumIfPositive(5, -10): " + sumIfPositive(5, -10));
        
        // Early return example
        System.out.println("\nEarly return example:");
        checkEligibility(21, true);
        checkEligibility(17, true);
    }
    
    /**
     * Helper method for demonstrating return statement
     */
    private static int sumIfPositive(int a, int b) {
        System.out.println("Checking if both numbers are positive: " + a + ", " + b);
        
        // Early return if any number is negative
        if (a < 0 || b < 0) {
            System.out.println("Found a negative number, returning 0");
            return 0; // Early return
        }
        
        // This code only executes if both numbers are positive
        int sum = a + b;
        return sum;
    }
    
    /**
     * Helper method for demonstrating early return
     */
    private static void checkEligibility(int age, boolean hasID) {
        System.out.println("Checking eligibility for person aged " + age + " with ID: " + hasID);
        
        if (age < 18) {
            System.out.println("Too young, not eligible");
            return; // Early return, no further checks needed
        }
        
        if (!hasID) {
            System.out.println("No ID provided, not eligible");
            return; // Early return
        }
        
        System.out.println("Person is eligible!");
    }
    
    /**
     * Demonstrates enhanced for loop in Java
     */
    public static void demonstrateEnhancedForLoop() {
        System.out.println("\n===== ENHANCED FOR LOOP (FOR-EACH) =====");
        
        // 1. Enhanced for loop with arrays
        System.out.println("\n--- Enhanced for loop with arrays ---");
        
        int[] numbers = {10, 20, 30, 40, 50};
        
        System.out.println("Iterating through an array:");
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }
        
        // 2. Enhanced for loop with a collection
        System.out.println("\n--- Enhanced for loop with a collection ---");
        
        java.util.List<String> fruits = java.util.Arrays.asList("Apple", "Banana", "Cherry", "Date");
        
        System.out.println("Iterating through a list of fruits:");
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
        
        // 3. Comparison with traditional for loop
        System.out.println("\n--- Comparison with traditional for loop ---");
        
        // Traditional for loop
        System.out.println("Traditional for loop:");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println("Fruit at index " + i + ": " + fruits.get(i));
        }
        
        // Enhanced for loop - simpler, less error-prone, but no index access
        System.out.println("\nEnhanced for loop (no index):");
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
        
        // 4. Limitations of enhanced for loop
        System.out.println("\n--- Limitations of enhanced for loop ---");
        System.out.println("Cannot modify the collection during iteration");
        System.out.println("Cannot track the index of the current element");
        System.out.println("Cannot iterate backwards or skip elements");
        
        // Multi-dimensional array with enhanced for loop
        System.out.println("\n--- Multi-dimensional array with enhanced for loop ---");
        
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("Iterating through a 2D array:");
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
