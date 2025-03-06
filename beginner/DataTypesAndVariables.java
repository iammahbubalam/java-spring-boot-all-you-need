package beginner;

/**
 * This class demonstrates Java data types, variables, type casting, constants, and variable scopes
 */
public class DataTypesAndVariables {
    
    // Class-level variable (accessible throughout the class)
    static int classLevelVariable = 100;
    
    // Class constant using 'final' keyword
    final static double PI = 3.14159;
    
    public static void main(String[] args) {
        // 1. PRIMITIVE DATA TYPES
        System.out.println("===== PRIMITIVE DATA TYPES =====");
        
        // Integer types
        byte byteVar = 127;                // 8-bit, range: -128 to 127
        short shortVar = 32000;            // 16-bit, range: -32,768 to 32,767
        int intVar = 2000000000;           // 32-bit, range: -2^31 to 2^31 - 1
        long longVar = 9000000000000000000L; // 64-bit, range: -2^63 to 2^63 - 1 (note the L suffix)
        
        // Floating-point types
        float floatVar = 3.14f;            // 32-bit floating point (note the f suffix)
        double doubleVar = 3.14159265359;  // 64-bit floating point (more precise)
        
        // Character type
        char charVar = 'A';                // 16-bit Unicode character
        
        // Boolean type
        boolean booleanVar = true;         // true or false
        
        // Printing primitive types
        System.out.println("byte value: " + byteVar);
        System.out.println("short value: " + shortVar);
        System.out.println("int value: " + intVar);
        System.out.println("long value: " + longVar);
        System.out.println("float value: " + floatVar);
        System.out.println("double value: " + doubleVar);
        System.out.println("char value: " + charVar);
        System.out.println("boolean value: " + booleanVar);
        
        // 2. NON-PRIMITIVE DATA TYPES
        System.out.println("\n===== NON-PRIMITIVE DATA TYPES =====");
        
        // String - a sequence of characters
        String stringVar = "Hello, Java!";
        System.out.println("String: " + stringVar);
        
        // Arrays - collection of similar data types
        int[] intArray = {1, 2, 3, 4, 5};
        System.out.print("Int Array: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
        
        // Multi-dimensional array
        int[][] twoDArray = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("2D Array first element: " + twoDArray[0][0]);
        
        // Class objects
        Person person = new Person("John", 25);
        System.out.println("Person object: " + person.name + ", " + person.age);
        
        // 3. VARIABLES DECLARATION AND INITIALIZATION
        System.out.println("\n===== VARIABLE DECLARATION AND INITIALIZATION =====");
        
        // Declaration only
        int declaredOnly;
        
        // Initialization after declaration
        declaredOnly = 100;
        System.out.println("Initialized after declaration: " + declaredOnly);
        
        // Declaration and initialization together
        int declaredAndInitialized = 200;
        System.out.println("Declared and initialized: " + declaredAndInitialized);
        
        // Multiple variables of the same type
        int x = 10, y = 20, z = 30;
        System.out.println("Multiple variables: x=" + x + ", y=" + y + ", z=" + z);
        
        // 4. TYPE CASTING
        System.out.println("\n===== TYPE CASTING =====");
        
        // Implicit casting (widening conversion) - automatically done
        // smaller type to larger type
        byte smallByte = 10;
        int largeInt = smallByte;  // byte to int (no explicit cast needed)
        System.out.println("Implicit casting byte to int: " + largeInt);
        
        // double can hold an int
        int intNumber = 100;
        double doubleNumber = intNumber;  // int to double
        System.out.println("Implicit casting int to double: " + doubleNumber);
        
        // Explicit casting (narrowing conversion) - manually done
        // larger type to smaller type - may result in data loss
        double largeDouble = 123.456;
        int smallerInt = (int) largeDouble;  // Explicit cast - loses the decimal part
        System.out.println("Explicit casting double to int: " + smallerInt);
        
        // Possible data loss example
        int bigNumber = 130;
        byte smallByteCast = (byte) bigNumber;  // Overflow (byte range is -128 to 127)
        System.out.println("Explicit casting with data loss (130 as byte): " + smallByteCast);
        
        // 5. CONSTANTS
        System.out.println("\n===== CONSTANTS =====");
        
        // Using final keyword to create constants
        final int DAYS_IN_WEEK = 7;
        final String COMPANY_NAME = "ABC Corp";
        
        System.out.println("Constant values: " + DAYS_IN_WEEK + ", " + COMPANY_NAME);
        System.out.println("Class constant PI: " + PI);
        
        // Trying to reassign a constant would cause a compilation error
        // DAYS_IN_WEEK = 8;  // This would cause an error!
        
        // 6. VARIABLE SCOPE
        System.out.println("\n===== VARIABLE SCOPE =====");
        
        // Accessing class-level variable
        System.out.println("Class level variable: " + classLevelVariable);
        
        // Method-level variable - only accessible within this method
        int methodLevelVariable = 50;
        System.out.println("Method level variable: " + methodLevelVariable);
        
        // Block scope demo
        {
            // This variable is only accessible within this block
            int blockVariable = 30;
            System.out.println("Block variable (inside block): " + blockVariable);
            
            // We can access method-level variables from inside a block
            System.out.println("Method variable (from inside block): " + methodLevelVariable);
        }
        
        // blockVariable is not accessible here
        // System.out.println(blockVariable); // This would cause a compilation error
        
        // Demonstrating scope with a for loop
        for (int i = 0; i < 3; i++) {
            // i is only accessible within this loop
            System.out.println("Loop variable i: " + i);
        }
        
        // i is not accessible here
        // System.out.println(i); // This would cause a compilation error
        
        // Calling a method to demonstrate method-level scope
        demonstrateMethodScope();
    }
    
    public static void demonstrateMethodScope() {
        // This is a separate method with its own scope
        int methodScopeVar = 999;
        System.out.println("\nInside different method: " + methodScopeVar);
        
        // We can access class-level variables
        System.out.println("Accessing class variable from method: " + classLevelVariable);
        
        // We cannot access variables from main method
        // System.out.println(methodLevelVariable); // This would cause a compilation error
    }
    
    // A simple class to demonstrate object creation
    static class Person {
        String name;
        int age;
        
        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
