package OOPS.Array.problems;

class ReverseArray {
  public static void main(String[] args) {
    int nums[] = { 10, 20, 30, 40, 50 };

    System.out.print("Reversed array: ");
    for (int i = nums.length - 1; i >= 0; i--) {
      System.out.print(nums[i] + " ");
    }
  }
}

/*
 * Explanation:
 * - Start from the last index (nums.length - 1)
 * - Decrease index in each iteration
 * - This prints array in reverse order
 */
