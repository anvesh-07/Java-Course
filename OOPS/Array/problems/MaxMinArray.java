package OOPS.Array.problems;

class MaxMinArray {
  public static void main(String[] args) {
    int nums[] = { 10, 25, 3, 99, 45 };
    int max = nums[0];
    int min = nums[0];

    for (int n : nums) {
      if (n > max)
        max = n;
      if (n < min)
        min = n;
    }

    System.out.println("Maximum = " + max);
    System.out.println("Minimum = " + min);
  }
}

/*
 * Explanation:
 * - Assume first element as max and min
 * - Compare each element and update values accordingly
 */
