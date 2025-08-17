package Basics;

public class DataTypes {
    public static void main(String[] args) {

        // Integer types
        byte byteValue = 120; // 1 byte
        short shortValue = 30000; // 2 bytes
        int intValue = 500000; // 4 bytes
        long longValue = 9000000000L; // 8 bytes

        // Floating-point types
        float floatValue = 5.75f; // 4 bytes
        double doubleValue = 19.99d; // 8 bytes

        // Character type
        char charValue = 'A'; // 2 bytes

        // Boolean type
        boolean booleanValue = true; // 1 bit

        // Reference types
        String stringValue = "Hello, Java!"; // String is an object
        int[] numbersArray = { 1, 2, 3, 4, 5 }; // Array is a reference type

        // Printing all values
        System.out.println("=== Primitive Data Types ===");
        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        System.out.println("char: " + charValue);
        System.out.println("boolean: " + booleanValue);

        System.out.println("\n=== Reference Data Types ===");
        System.out.println("String: " + stringValue);
        System.out.print("Array: ");
        for (int num : numbersArray) {
            System.out.print(num + " ");
        }

        // Type casting examples
        System.out.println("\n\n=== Type Casting ===");

        // Widening casting (automatic)
        int myInt = 9;
        double myDouble = myInt; // int -> double
        System.out.println("Widening: int " + myInt + " -> double " + myDouble);

        // Narrowing casting (manual)
        double anotherDouble = 9.78d;
        int anotherInt = (int) anotherDouble; // double -> int
        System.out.println("Narrowing: double " + anotherDouble + " -> int " + anotherInt);
    }
}
