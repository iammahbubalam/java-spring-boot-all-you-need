package beginner;
/**
 * JavaFundamentals - A demonstration of Java syntax basics and structure
 * 
 * This class demonstrates:
 *  - Basic Java syntax and code structure
 *  - Comment types in Java
 *  - Keywords and identifiers
 *  - Java naming conventions
 * 
 * @author Your Name
 * @version 1.0
 */
public class JavaFundamentals {
    
    // Class-level constant (note the naming convention: all uppercase with underscores)
    public static final int MAX_USERS = 100;
    
    // Instance variables follow camelCase naming convention
    private String userName;
    private int userAge;
    
    /**
     * Constructor for the JavaFundamentals class
     * Note how this is a documentation comment (JavaDoc) which can be used to generate documentation
     * 
     * @param name The user's name (String parameter)
     * @param age The user's age (int parameter)
     */
    public JavaFundamentals(String name, int age) {
        // 'this' keyword refers to the current instance of the class
        this.userName = name;
        this.userAge = age;
    }
    
    /**
     * Main method - the entry point of a Java application
     * 'public', 'static', 'void', 'class', 'new' are all Java keywords
     * 
     * @param args Command line arguments passed to the program
     */
    public static void main(String[] args) {
        // Single-line comment: Creating an instance of our class
        
        /* 
         * Multi-line comment:
         * Below we create a new object using the 'new' keyword
         * Variable names follow camelCase convention
         */
        JavaFundamentals user = new JavaFundamentals("John Doe", 25);
        
        // Calling methods
        user.displayUserInfo();
        
        // Demonstrating various data types (keywords) and their variables (identifiers)
        int count = 10;            // Primitive type - integer
        double salary = 1250.50;   // Primitive type - double precision floating point
        boolean isActive = true;   // Primitive type - boolean
        char grade = 'A';          // Primitive type - character
        
        // String is a class, not a primitive type
        String message = "Learning Java fundamentals";
        
        System.out.println("\n--- Variable Examples ---");
        System.out.println("count: " + count);
        System.out.println("salary: $" + salary);
        System.out.println("isActive: " + isActive);
        System.out.println("grade: " + grade);
        System.out.println("message: " + message);
        
        // Demonstrating control structures and more keywords
        demonstrateControlStructures();
        
        // Final message
        System.out.println("\nJava Fundamentals demonstration completed!");
    }
    
    /**
     * Display information about the user
     * Method names also follow camelCase convention
     */
    public void displayUserInfo() {
        System.out.println("\n--- User Information ---");
        System.out.println("Name: " + userName);
        System.out.println("Age: " + userAge);
    }
    
    /**
     * Demonstrates basic control structures in Java
     * This is a static method - belongs to the class, not instances
     */
    private static void demonstrateControlStructures() {
        System.out.println("\n--- Control Structures ---");
        
        // For loop - using 'for', 'int' keywords
        System.out.println("For loop example:");
        for (int i = 1; i <= 3; i++) {
            System.out.println("  Loop iteration: " + i);
        }
        
        // If-else statement - using 'if', 'else' keywords
        System.out.println("\nIf-else example:");
        int value = 15;
        if (value > 10) {
            System.out.println("  Value is greater than 10");
        } else {
            System.out.println("  Value is not greater than 10");
        }
        
        // Switch statement - using 'switch', 'case', 'break', 'default' keywords
        System.out.println("\nSwitch example:");
        char option = 'B';
        switch (option) {
            case 'A':
                System.out.println("  Option A selected");
                break;
            case 'B':
                System.out.println("  Option B selected");
                break;
            default:
                System.out.println("  Unknown option");
        }
    }
    
    // Inner class - demonstrates class naming convention (PascalCase)
    public class UserSettings {
        // Inner class implementation would go here
    }
}
