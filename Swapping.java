public class Swapping {
  public static void main(String[] args) {


    int a = 10;     // Declares an integer variable 'a' and initializes it with the value 10.
    int b = 20;     // Declares an integer variable 'b' and initializes it with the value 20.
    System.out.println("Before swapping: a = " + a + ", b = " + b);     // Prints the initial values of 'a' and 'b' to the console.


    // --- Method 1: Using a temporary variable ---

    int temp = a;     // Declares an integer variable 'temp' and copies the value of 'a' into it.
    a = b;     // Assigns the value of 'b' to 'a'. Now 'a' holds 20.
    b = temp;     // Assigns the value stored in 'temp' (the original value of 'a') to 'b'. Now 'b' holds 10.
    System.out.println("After swapping: a = " + a + ", b = " + b);     // Prints the values of 'a' and 'b' after the first swap.


    // --- Method 2: Using addition and subtraction (without a temp variable) ---
    // Note: At this point, a = 20 and b = 10. We will swap them back.

    a = a + b;     // 'a' becomes the sum of 'a' and 'b' (a = 20 + 10 = 30).
    b = a - b;     // 'b' becomes the new 'a' minus the original 'b' (b = 30 - 10 = 20).
    a = a - b;     // 'a' becomes the new 'a' minus the new 'b' (a = 30 - 20 = 10).
    System.out.println("After swapping without temp: a = " + a + ", b = " + b);
    
    
    // --- Method 3: Using multiplication and division (without a temp variable) ---
    // Note: At this point, a = 10 and b = 20. We will swap them again.

    a = a * b;     // 'a' becomes the product of 'a' and 'b' (a = 10 * 20 = 200).
    b = a / b;     // 'b' becomes the new 'a' divided by the original 'b' (b = 200 / 20 = 10).
    a = a / b;     // 'a' becomes the new 'a' divided by the new 'b' (a = 200 / 10 = 20).
    System.out.println("After swapping without temp: a = " + a + ", b = " + b);


    // --- Method 4: Using bitwise XOR operator (without a temp variable) ---
    // This is a clever and efficient trick to swap two integer variables.

    // Note: At the beginning of this block, a = 20 and b = 10.
    // Our goal is to swap them so that a = 10 and b = 20.

    // Let's look at their 8-bit binary representations:
    // a = 20 which is 0001 0100
    // b = 10 which is 0000 1010

    // Step 1: a = a ^ b;
    // This line performs a bitwise XOR operation between 'a' and 'b' and stores the result back into 'a'.
    // The new value of 'a' now holds the combined, unique bit information from both original numbers.
    //
    //   0001 0100  (a = 20)
    // ^ 0000 1010  (b = 10)
    // ------------
    //   0001 1110  (This binary value is 16 + 8 + 4 + 2 = 30. So, 'a' is now 30)


    a = a ^ b;

    // Current state: a = 30 (0001 1110), b = 10 (0000 1010)

    // Step 2: b = b ^ a;
    // Now, we XOR the original value of 'b' with the new value of 'a' (which is a ^ b).
    // The logic is: b = original_b ^ (original_a ^ original_b).
    // Because of XOR's properties, the two 'original_b' terms cancel out, leaving 'original_a'.
    //
    //   0000 1010  (b = 10)
    // ^ 0001 1110  (a = 30)
    // ------------
    //   0001 0100  (This binary value is 16 + 4 = 20. So, 'b' is now 20)
    // As you can see, 'b' now holds the original value of 'a'.


    b = b ^ a;

    // Current state: a = 30 (0001 1110), b = 20 (0001 0100)

    // Step 3: a = a ^ b;
    // Finally, we XOR the current 'a' (which is still a ^ b) with the new 'b' (which is the original 'a').
    // The logic is: a = (original_a ^ original_b) ^ new_b.
    // Since new_b is original_a, this becomes: a = (original_a ^ original_b) ^ original_a.
    // The two 'original_a' terms cancel out, leaving 'original_b'.
    //
    //   0001 1110  (a = 30)
    // ^ 0001 0100  (b = 20)
    // ------------
    //   0000 1010  (This binary value is 8 + 2 = 10. So, 'a' is now 10)
    // 'a' now holds the original value of 'b'. The swap is complete.


    a = a ^ b;

    // Final state: a = 10, b = 20.
    System.out.println("After swapping without temp: a = " + a + ", b = " + b);
  }
}