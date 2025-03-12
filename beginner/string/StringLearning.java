package beginner.string;

import java.util.Arrays;

// Note: This class should ideally be renamed to StringConcepts or StringExamples 
// since String is a built-in Java class name
public class StringLearning {
    
    public static void main(java.lang.String[] args) {
        // =================== 1. STRING CLASS AND ITS METHODS =====================
        System.out.println("========== STRING CLASS AND ITS METHODS ==========");
        
        // String Creation - different ways to create strings
        java.lang.String str1 = "Hello World";                   // Using string literal
        java.lang.String str2 = new java.lang.String("Hello World");  // Using new keyword
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        java.lang.String str3 = new java.lang.String(charArray);      // From char array
        
        System.out.println("Original string: " + str1);
        
        // Common String methods
        System.out.println("\nCommon String Methods:");
        System.out.println("Length: " + str1.length());                    // Returns string length
        System.out.println("Character at index 4: " + str1.charAt(4));     // Returns character at index
        System.out.println("Index of 'W': " + str1.indexOf('W'));          // Returns index of character
        System.out.println("Substring(6): " + str1.substring(6));          // Returns substring from index
        System.out.println("Substring(0,5): " + str1.substring(0, 5));     // Returns substring in range
        
        // Checking string content
        System.out.println("\nString Content Checking:");
        System.out.println("Contains 'World': " + str1.contains("World"));
        System.out.println("Starts with 'Hello': " + str1.startsWith("Hello"));
        System.out.println("Ends with 'World': " + str1.endsWith("World"));
        System.out.println("Is empty: " + str1.isEmpty());
        
        // Modifying strings (these return new strings)
        System.out.println("\nString Modification (returns new strings):");
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str1.toLowerCase());
        System.out.println("Replace 'l' with 'L': " + str1.replace('l', 'L'));
        System.out.println("Trim: " + "  spaces  ".trim());
        
        // Splitting strings
        System.out.println("\nSplitting Strings:");
        java.lang.String sentence = "Java is a programming language";
        java.lang.String[] words = sentence.split(" ");
        System.out.println("Split result: " + Arrays.toString(words));
        
        // =================== 2. STRING IMMUTABILITY =====================
        System.out.println("\n========== STRING IMMUTABILITY ==========");
        
        /*
         * Strings in Java are immutable, meaning once created, their values cannot be changed.
         * When you perform operations on a string, a new string object is created.
         */
        
        java.lang.String immutableStr = "Hello";
        System.out.println("Original string: " + immutableStr);
        
        // This doesn't modify the original string, but creates a new one
        immutableStr.concat(" World");
        System.out.println("After concat() without assignment: " + immutableStr); // Still "Hello"
        
        // To capture the new string, we need to assign it to a variable
        immutableStr = immutableStr.concat(" World");
        System.out.println("After concat() with assignment: " + immutableStr); // Now "Hello World"
        
        // Memory demonstration - both refer to the same string object in string pool
        java.lang.String s1 = "Java";
        java.lang.String s2 = "Java";
        System.out.println("\nString Pool Demonstration:");
        System.out.println("s1 = " + s1 + ", s2 = " + s2);
        System.out.println("s1 == s2: " + (s1 == s2)); // true, both reference same object in string pool
        
        // Using new operator forces creation of a new object even with same content
        java.lang.String s3 = new java.lang.String("Java");
        System.out.println("s1 == s3: " + (s1 == s3)); // false, different objects
        System.out.println("s1.equals(s3): " + s1.equals(s3)); // true, same content
        
        // =================== 3. STRINGBUFFER AND STRINGBUILDER =====================
        System.out.println("\n========== STRINGBUFFER AND STRINGBUILDER ==========");
        
        /*
         * Unlike String, StringBuffer and StringBuilder are mutable string classes.
         * StringBuffer is thread-safe (synchronized), StringBuilder is not.
         * Use StringBuilder for better performance in single-threaded scenarios.
         */
        
        // StringBuilder example - more efficient for string manipulation
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Original StringBuilder: " + sb);
        
        // Methods of StringBuilder - these modify the original object
        sb.append(" World");           // Appends text
        System.out.println("After append(): " + sb);
        
        sb.insert(5, " Java");         // Inserts text at specified position
        System.out.println("After insert(): " + sb);
        
        sb.replace(6, 10, "Python");   // Replaces text in specified range
        System.out.println("After replace(): " + sb);
        
        sb.delete(6, 13);              // Deletes text in specified range
        System.out.println("After delete(): " + sb);
        
        sb.reverse();                  // Reverses the characters
        System.out.println("After reverse(): " + sb);
        
        // Converting StringBuilder to String
        java.lang.String sbToString = sb.toString();
        System.out.println("StringBuilder to String: " + sbToString);
        
        // StringBuffer example - thread-safe alternative to StringBuilder
        System.out.println("\nStringBuffer Demonstration (thread-safe):");
        StringBuffer buffer = new StringBuffer("Thread");
        buffer.append("-Safe");
        System.out.println("StringBuffer: " + buffer);
        
        // Performance comparison
        System.out.println("\nPerformance comparison:");
        long startTime, endTime;
        
        startTime = System.nanoTime();
        java.lang.String concatString = "";
        for (int i = 0; i < 1000; i++) {
            concatString += "a"; // Very inefficient! Creates 1000 string objects
        }
        endTime = System.nanoTime();
        System.out.println("String concatenation time: " + (endTime - startTime) + " ns");
        
        startTime = System.nanoTime();
        StringBuilder efficientSb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            efficientSb.append("a"); // Much more efficient, modifies same object
        }
        endTime = System.nanoTime();
        System.out.println("StringBuilder append time: " + (endTime - startTime) + " ns");
        
        // =================== 4. STRING COMPARISON AND CONCATENATION =====================
        System.out.println("\n========== STRING COMPARISON AND CONCATENATION ==========");
        
        // String comparison
        java.lang.String str4 = "Apple";
        java.lang.String str5 = "apple";
        java.lang.String str6 = "Apple";
        java.lang.String str7 = new java.lang.String("Apple");
        
        System.out.println("\nString Comparison:");
        
        // == compares references (memory addresses)
        System.out.println("str4 == str6: " + (str4 == str6));       // true - same object in string pool
        System.out.println("str4 == str7: " + (str4 == str7));       // false - different objects
        
        // equals() compares content
        System.out.println("str4.equals(str6): " + str4.equals(str6)); // true - same content
        System.out.println("str4.equals(str5): " + str4.equals(str5)); // false - different content
        
        // Case-insensitive comparison
        System.out.println("str4.equalsIgnoreCase(str5): " + str4.equalsIgnoreCase(str5)); // true
        
        // compareTo() for lexicographical comparison (returns int)
        System.out.println("\nLexicographical comparison:");
        System.out.println("str4.compareTo(str6): " + str4.compareTo(str6)); // 0 (equal)
        System.out.println("str4.compareTo(str5): " + str4.compareTo(str5)); // -32 (A comes before a)
        System.out.println("str5.compareTo(str4): " + str5.compareTo(str4)); // 32 (a comes after A)
        
        // String concatenation
        System.out.println("\nString Concatenation:");
        
        // Using + operator
        java.lang.String firstName = "John";
        java.lang.String lastName = "Doe";
        java.lang.String fullName = firstName + " " + lastName;
        System.out.println("Using + operator: " + fullName);
        
        // Using concat() method
        java.lang.String fullNameConcat = firstName.concat(" ").concat(lastName);
        System.out.println("Using concat(): " + fullNameConcat);
        
        // Using StringBuilder (most efficient for multiple concatenations)
        StringBuilder nameBuilder = new StringBuilder();
        nameBuilder.append(firstName).append(" ").append(lastName);
        System.out.println("Using StringBuilder: " + nameBuilder.toString());
        
        // Using join() method (Java 8+)
        java.lang.String joined = java.lang.String.join(" ", firstName, lastName);
        System.out.println("Using join(): " + joined);
        
        // =================== 5. STRING FORMATTING =====================
        System.out.println("\n========== STRING FORMATTING ==========");
        
        // Basic string formatting with printf and format
        System.out.printf("Formatted string: %s has %d apples%n", "John", 5);
        
        java.lang.String formatted = java.lang.String.format("Pi value: %.2f", Math.PI);
        System.out.println(formatted);
        
        // Common format specifiers
        System.out.println("\nCommon Format Specifiers:");
        System.out.printf("%s - String%n", "Hello");
        System.out.printf("%d - Integer%n", 42);
        System.out.printf("%f - Float/Double%n", 3.14159);
        System.out.printf("%.2f - Float with precision%n", 3.14159);
        System.out.printf("%b - Boolean%n", true);
        System.out.printf("%c - Character%n", 'A');
        
        // Width and alignment
        System.out.println("\nWidth and Alignment:");
        System.out.printf("'%10s' - Right aligned with width 10%n", "Hello");
        System.out.printf("'%-10s' - Left aligned with width 10%n", "Hello");
        
        // Dates and times (requires a date object)
        System.out.println("\nDate Formatting:");
        System.out.printf("Date: %tD%n", System.currentTimeMillis());
        
        // Java 15+ Text blocks (if using Java 15 or higher)
        /*
        java.lang.String textBlock = """
                This is a text block.
                It can span multiple lines
                with preserved indentation.
                """;
        System.out.println("\nText Block Example (Java 15+):");
        System.out.println(textBlock);
        */
    }
}
