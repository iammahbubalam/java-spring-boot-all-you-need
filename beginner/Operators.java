package beginner;

/**
 * This class demonstrates the various operators in Java with examples
 */
public class Operators {
    
    public static void main(String[] args) {
        // 1. ARITHMETIC OPERATORS
        System.out.println("===== ARITHMETIC OPERATORS =====");
        int a = 10;
        int b = 3;
        
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Addition (a + b): " + (a + b));           // 13
        System.out.println("Subtraction (a - b): " + (a - b));        // 7
        System.out.println("Multiplication (a * b): " + (a * b));     // 30
        System.out.println("Division (a / b): " + (a / b));           // 3 (integer division)
        System.out.println("Modulus (a % b): " + (a % b));            // 1 (remainder)
        
        // Increment and decrement
        int c = 5;
        System.out.println("\nInitial c = " + c);
        
        // Pre-increment: increment first, then use the value
        System.out.println("Pre-increment (++c): " + (++c));          // 6
        
        // Post-increment: use the value first, then increment
        System.out.println("Post-increment (c++): " + (c++));         // 6 (prints 6, then c becomes 7)
        System.out.println("After post-increment, c = " + c);         // 7
        
        // Pre-decrement: decrement first, then use the value
        System.out.println("Pre-decrement (--c): " + (--c));          // 6
        
        // Post-decrement: use the value first, then decrement
        System.out.println("Post-decrement (c--): " + (c--));         // 6 (prints 6, then c becomes 5)
        System.out.println("After post-decrement, c = " + c);         // 5
        
        // 2. ASSIGNMENT OPERATORS
        System.out.println("\n===== ASSIGNMENT OPERATORS =====");
        
        int x = 10;  // Simple assignment
        System.out.println("Initial x = " + x);
        
        x += 5;      // Equivalent to x = x + 5
        System.out.println("After x += 5: " + x);                     // 15
        
        x -= 3;      // Equivalent to x = x - 3
        System.out.println("After x -= 3: " + x);                     // 12
        
        x *= 2;      // Equivalent to x = x * 2
        System.out.println("After x *= 2: " + x);                     // 24
        
        x /= 4;      // Equivalent to x = x / 4
        System.out.println("After x /= 4: " + x);                     // 6
        
        x %= 4;      // Equivalent to x = x % 4
        System.out.println("After x %= 4: " + x);                     // 2
        
        // 3. COMPARISON OPERATORS
        System.out.println("\n===== COMPARISON OPERATORS =====");
        
        int p = 10;
        int q = 20;
        
        System.out.println("p = " + p + ", q = " + q);
        System.out.println("Equal to (p == q): " + (p == q));                  // false
        System.out.println("Not equal to (p != q): " + (p != q));              // true
        System.out.println("Greater than (p > q): " + (p > q));                // false
        System.out.println("Less than (p < q): " + (p < q));                   // true
        System.out.println("Greater than or equal to (p >= q): " + (p >= q));  // false
        System.out.println("Less than or equal to (p <= q): " + (p <= q));     // true
        
        // 4. LOGICAL OPERATORS
        System.out.println("\n===== LOGICAL OPERATORS =====");
        
        boolean condition1 = true;
        boolean condition2 = false;
        
        System.out.println("condition1 = " + condition1 + ", condition2 = " + condition2);
        
        // Logical AND (&&): returns true if both conditions are true
        System.out.println("Logical AND (condition1 && condition2): " + (condition1 && condition2));   // false
        
        // Logical OR (||): returns true if at least one condition is true
        System.out.println("Logical OR (condition1 || condition2): " + (condition1 || condition2));    // true
        
        // Logical NOT (!): reverses the boolean value
        System.out.println("Logical NOT (!condition1): " + (!condition1));     // false
        System.out.println("Logical NOT (!condition2): " + (!condition2));     // true
        
        // Short-circuit evaluation example
        System.out.println("\nShort-circuit evaluation examples:");
        int n = 10;
        
        // Second condition is not evaluated because first is false (short-circuit AND)
        boolean result = (n > 20) && (n++ > 5);  // n++ is not executed
        System.out.println(result);           // 10 (unchanged)
        System.out.println("After (n > 20) && (n++ > 5), n = " + n);           // 10 (unchanged)
        
        // Second condition is not evaluated because first is true (short-circuit OR)
        result = (n == 10) || (n++ < 20);  // n++ is not executed
        System.out.println("After (n == 10) || (n++ < 20), n = " + n);         // 10 (unchanged)
        
        // 5. BITWISE OPERATORS
        System.out.println("\n===== BITWISE OPERATORS =====");
        
        int num1 = 5;  // binary: 0101
        int num2 = 3;  // binary: 0011
        
        System.out.println("num1 = " + num1 + " (binary: " + Integer.toBinaryString(num1) + ")");
        System.out.println("num2 = " + num2 + " (binary: " + Integer.toBinaryString(num2) + ")");
        
        // Bitwise AND (&): sets each bit to 1 if both bits are 1
        System.out.println("Bitwise AND (num1 & num2): " + (num1 & num2) + 
                   " (binary: " + Integer.toBinaryString(num1 & num2) + ")");    // 1 (binary 0001)
        
        // Bitwise OR (|): sets each bit to 1 if at least one bit is 1
        System.out.println("Bitwise OR (num1 | num2): " + (num1 | num2) + 
                   " (binary: " + Integer.toBinaryString(num1 | num2) + ")");    // 7 (binary 0111)
        
        // Bitwise XOR (^): sets each bit to 1 if only one bit is 1
        System.out.println("Bitwise XOR (num1 ^ num2): " + (num1 ^ num2) + 
                   " (binary: " + Integer.toBinaryString(num1 ^ num2) + ")");    // 6 (binary 0110)
        
        // Bitwise NOT (~): inverts all the bits (0 becomes 1, 1 becomes 0)
        System.out.println("Bitwise NOT (~num1): " + (~num1) + 
                   " (binary: " + Integer.toBinaryString(~num1) + ")");          // -6 (binary representation is complex due to two's complement)
        
        // Bitwise shift operators
        int num3 = 8;  // binary: 1000
        
        // Left shift (<<): shifts bits to the left by specified number (multiplies by 2^n)
        System.out.println("\nnum3 = " + num3 + " (binary: " + Integer.toBinaryString(num3) + ")");
        System.out.println("Left shift (num3 << 2): " + (num3 << 2) + 
                   " (binary: " + Integer.toBinaryString(num3 << 2) + ")");      // 32 (binary 100000)
        
        // Right shift (>>): shifts bits to the right by specified number (divides by 2^n)
        System.out.println("Right shift (num3 >> 1): " + (num3 >> 1) + 
                   " (binary: " + Integer.toBinaryString(num3 >> 1) + ")");      // 4 (binary 100)
        
        // Unsigned right shift (>>>): shifts bits to the right, filling with zeros
        int negativeNum = -8;
        System.out.println("\nnegativeNum = " + negativeNum + " (binary representation in two's complement)");
        System.out.println("Right shift with sign (negativeNum >> 1): " + (negativeNum >> 1));   // -4
        System.out.println("Unsigned right shift (negativeNum >>> 1): " + (negativeNum >>> 1));  // Large positive number
        
        // 6. OPERATOR PRECEDENCE
        System.out.println("\n===== OPERATOR PRECEDENCE =====");
        
        // Precedence examples
        int result1 = 10 + 5 * 2;                // Multiplication has higher precedence than addition
        System.out.println("10 + 5 * 2 = " + result1);  // 20, not 30
        
        int result2 = (10 + 5) * 2;              // Parentheses have highest precedence
        System.out.println("(10 + 5) * 2 = " + result2);  // 30
        
        // Multiple operators with different precedence
        int result3 = 10 + 20 / 5 - 3 * 2;       // Division and multiplication before addition and subtraction
        System.out.println("10 + 20 / 5 - 3 * 2 = " + result3);  // 10 + 4 - 6 = 8
        
        // Combining arithmetic, comparison, and logical operators
        boolean complexResult = (5 > 3) && (8 + 2 < 15 - 2);
        System.out.println("(5 > 3) && (8 + 2 < 15 - 2) = " + complexResult);  // true && true = true
        
        // Assignment has lower precedence
        int y = 5;
        y += y++ + ++y;  // First evaluated as: y += (y++ + ++y), then assignment happens
        System.out.println("After y += y++ + ++y with initial y = 5, y = " + y);  // y = 5 + (5 + 7) = 17
        
        System.out.println("\nGeneral operator precedence order (highest to lowest):");
        System.out.println("1. Postfix operators (expr++, expr--)");
        System.out.println("2. Prefix operators (++expr, --expr, +expr, -expr, ~, !)");
        System.out.println("3. Multiplicative (*, /, %)");
        System.out.println("4. Additive (+, -)");
        System.out.println("5. Shift (<<, >>, >>>)");
        System.out.println("6. Relational (<, >, <=, >=, instanceof)");
        System.out.println("7. Equality (==, !=)");
        System.out.println("8. Bitwise AND (&)");
        System.out.println("9. Bitwise XOR (^)");
        System.out.println("10. Bitwise OR (|)");
        System.out.println("11. Logical AND (&&)");
        System.out.println("12. Logical OR (||)");
        System.out.println("13. Conditional (?:)");
        System.out.println("14. Assignment (=, +=, -=, etc.)");
    }
}
