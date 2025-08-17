package Basics;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        // --- 1. 'for' Loop Problem ---
        System.out.println("--- 1. Problem: Calculate the factorial of a number (e.g., 5!) ---");
        int numberForFactorial = 5;
        long factorialResult = calculateFactorial(numberForFactorial);
        System.out.println("Solution: The factorial of " + numberForFactorial + " is " + factorialResult + ".");
        System.out.println("------------------------------------------------------------------\n");

        // --- 2. 'while' Loop Problem ---
        System.out.println("--- 2. Problem: Reverse the digits of an integer (e.g., 12345) ---");
        int numberToReverse = 12345;
        int reversedNumber = reverseInteger(numberToReverse);
        System.out.println("Solution: The reverse of " + numberToReverse + " is " + reversedNumber + ".");
        System.out.println("------------------------------------------------------------------\n");

        // --- 3. 'do-while' Loop Problem ---
        System.out.println("--- 3. Problem: Simple number guessing game ---");
        // To run this interactive part, you would typically uncomment it.
        // guessTheNumberGame();
        System.out.println(
                "Solution: A 'do-while' loop ensures the user gets at least one guess. (Code is commented out).");
        System.out.println("------------------------------------------------------------------\n");

        // --- 4. Enhanced 'for' Loop Problem ---
        System.out.println("--- 4. Problem: Find the sum of all elements in an array ---");
        int[] numbers = { 10, 20, 30, 40, 50 };
        int sum = sumArrayElements(numbers);
        System.out.println("Solution: The sum of the array elements is " + sum + ".");
        System.out.println("------------------------------------------------------------------\n");

        // --- 5. Nested Loops Problem ---
        System.out.println("--- 5. Problem: Print a simple pyramid pattern of stars ---");
        printStarPyramid(5);
        System.out.println("------------------------------------------------------------------\n");

        // --- 6. Loop Control (break and continue) Problem ---
        System.out.println("--- 6. Problem: Find the first multiple of 7 in an array, skipping odd numbers ---");
        int[] searchArray = { 3, 10, 21, 15, 14, 28, 40 };
        findSpecialNumber(searchArray);
        System.out.println("------------------------------------------------------------------");
    }

    /**
     * Solves factorial using a 'for' loop.
     * A 'for' loop is ideal here because we know exactly how many times we need to
     * multiply
     * (from 1 up to the number itself).
     */
    public static long calculateFactorial(int n) {
        if (n < 0)
            return -1; // Factorial is not defined for negative numbers
        long result = 1;
        // Loop from 1 to n, multiplying each number into the result.
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    /**
     * Solves integer reversal using a 'while' loop.
     * A 'while' loop is perfect because we don't know the number of digits
     * beforehand.
     * The loop continues as long as there are digits left to process.
     */
    public static int reverseInteger(int number) {
        int reversed = 0;
        int original = number;

        while (original != 0) {
            int lastDigit = original % 10; // Get the last digit
            reversed = reversed * 10 + lastDigit; // Append it to the reversed number
            original = original / 10; // Remove the last digit from the original number
        }
        return reversed;
    }

    /**
     * Solves a guessing game using a 'do-while' loop.
     * A 'do-while' loop is essential here because the user must be prompted to
     * enter a guess
     * at least once before we can check if it's correct.
     */
    public static void guessTheNumberGame() {
        int secretNumber = 7;
        int userGuess;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Guess the number (between 1 and 10): ");
            userGuess = scanner.nextInt();
        } while (userGuess != secretNumber);

        System.out.println("Congratulations! You guessed the correct number.");
        scanner.close();
    }

    /**
     * Solves array summation using an enhanced 'for' loop (for-each).
     * The for-each loop is the cleanest and most readable way to process every
     * element
     * of a collection or array when you don't need the index.
     */
    public static int sumArrayElements(int[] array) {
        int total = 0;
        // For each 'element' in the 'array', add it to the total.
        for (int element : array) {
            total += element;
        }
        return total;
    }

    /**
     * Uses nested 'for' loops to print a pattern.
     * The outer loop controls the number of rows.
     * The inner loop controls the number of stars printed in each row.
     */
    public static void printStarPyramid(int rows) {
        // Outer loop for each row
        for (int i = 1; i <= rows; i++) {
            // Inner loop to print the stars for the current row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after the row is printed
        }
    }

    /**
     * Demonstrates 'break' and 'continue' within a loop.
     * The goal is to find the first number in an array that is a multiple of 7,
     * but we only want to check even numbers.
     */
    public static void findSpecialNumber(int[] numbers) {
        System.out.println("Searching for the first even number that is a multiple of 7...");
        for (int num : numbers) {
            // Use 'continue' to skip the rest of the loop for odd numbers
            if (num % 2 != 0) {
                System.out.println("  Skipping odd number: " + num);
                continue;
            }

            System.out.println("  Checking even number: " + num);
            // Check if the even number is a multiple of 7
            if (num % 7 == 0) {
                System.out.println("Solution: Found it! The number is " + num + ".");
                // Use 'break' to exit the loop entirely since we found what we wanted.
                break;
            }
        }
    }
}
