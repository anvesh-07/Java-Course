package Basics;

public class VariableExamples {

    public static void main(String[] args) {

        // --- INTEGER TYPES ---
        // These types are used for whole numbers.

        // 'byte' is used for very small numbers to save memory.
        byte smallNumber = 100;
        System.out.println("Value of byte variable 'smallNumber': " + smallNumber);

        // 'short' is used for numbers that are larger than a byte but still relatively
        // small.
        short mediumNumber = 30000;
        System.out.println("Value of short variable 'mediumNumber': " + mediumNumber);

        // 'int' is the most commonly used integer type for general-purpose whole
        // numbers.
        int userAge = 25;
        System.out.println("Value of int variable 'userAge': " + userAge);

        // 'long' is used for very large whole numbers. Note the 'L' at the end.
        long worldPopulation = 7800000000L;
        System.out.println("Value of long variable 'worldPopulation': " + worldPopulation);

        System.out.println("------------------------------------");

        // --- FLOATING-POINT TYPES ---
        // These types are used for numbers with decimal points.

        // 'float' is a single-precision decimal number. Note the 'f' at the end.
        float price = 19.99f;
        System.out.println("Value of float variable 'price': " + price);

        // 'double' is a double-precision decimal number. It's more precise and the
        // default type for decimals.
        double piValue = 3.14159265359;
        System.out.println("Value of double variable 'piValue': " + piValue);

        System.out.println("------------------------------------");

        // --- OTHER PRIMITIVE TYPES ---

        // 'boolean' can only hold two values: true or false.
        boolean isLoggedIn = true;
        System.out.println("Value of boolean variable 'isLoggedIn': " + isLoggedIn);

        // 'char' holds a single character. It's defined with single quotes.
        char grade = 'A';
        System.out.println("Value of char variable 'grade': " + grade);

        System.out.println("------------------------------------");

        // --- REFERENCE TYPE: String ---
        // A String is not a primitive type; it's a class. It holds a sequence of
        // characters.
        // It's defined with double quotes.
        String greeting = "Hello, Java learners!";
        System.out.println("Value of String variable 'greeting': " + greeting);

    }

}
