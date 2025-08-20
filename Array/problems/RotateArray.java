package problems;

class RotateArray {
  public static void main(String[] args) {
    int nums[] = { 1, 2, 3, 4, 5 };
    int first = nums[0];

    for (int i = 0; i < nums.length - 1; i++) {
      nums[i] = nums[i + 1];
    }
    nums[nums.length - 1] = first;

    System.out.print("Rotated Array: ");
    for (int n : nums) {
      System.out.print(n + " ");
    }
  }
}

/*
 * Explanation:
 * - Store first element
 * - Shift all elements left
 * - Put first element at last index
 */
