package com.example.mavendemo;

public class PMDTest {

    public static void main(String[] args) {
        int x = 5;
        int y = 0;

        // Division by zero
        int result = x / y;

        // Unreachable code
        System.out.println("This code will never be reached.");

        // Unused variable
        int unusedVariable = 10;

        // Empty catch block
        try {
            // Some code that may throw an exception
        } catch (Exception e) {
        }

        // Inefficient loop
        for (int i = 0; i < 100; i++) {
            new Object(); // Creating objects in a loop is inefficient
        }

        // Incorrect comparison with floating-point values
        double value1 = 0.1;
        double value2 = 0.2;
        if (value1 + value2 == 0.3) {
            System.out.println("This comparison is incorrect!");
        }

        // Use of System.out.println in production code
        System.out.println("This should be avoided in production code.");

        // Avoid using magic numbers
        int length = 5;
        for (int i = 0; i < length; i++) {
            // Some code here
        }
        
        // Unnecessary semicolon
        int a = 10;;
        
        // Unnecessary parentheses
        if ((x > 0)) {
            // Some code here
        }

        // String concatenation in a loop
        String resultString = "";
        for (int i = 0; i < 10; i++) {
            resultString += " " + i;
        }

        // Unnecessary instanceof check
        Object obj = new String("Hello");
        if (obj instanceof String) {
            String str = (String) obj;
            // Some code here
        }
    }

    // Method with a long parameter list
    public void longParameterList(int a, int b, int c, int d, int e, int f, int g) {
        // Some code here
    }

    // Method with too many return statements
    public int tooManyReturns(int x) {
        if (x < 0) {
            return -1;
        } else if (x == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    // Method with nested loops
    public void nestedLoops() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                // Some code here
            }
        }
    }

    // Method with deep nesting
    public void deepNesting() {
        if (condition1) {
            if (condition2) {
                if (condition3) {
                    // Some code here
                }
            }
        }
    }

    // Method with long method body
    public void longMethodBody() {
        // Several lines of code here
    }

    // Method with a high cyclomatic complexity
    public void highCyclomaticComplexity(int x) {
        if (x == 1) {
            // Some code here
        } else if (x == 2) {
            // Some code here
        } else if (x == 3) {
            // Some code here
        } else if (x == 4) {
            // Some code here
        } else {
            // Some code here
        }
    }

}