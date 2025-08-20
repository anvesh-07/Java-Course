package problems;

class LinearSearch {
  public static void main(String[] args) {
    int nums[] = { 10, 20, 30, 40, 50 };
    int target = 30;
    boolean found = false;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == target) {
        System.out.println("Element found at index: " + i);
        found = true;
        break;
      }
    }

    if (!found) {
      System.out.println("Element not found");
    }
  }
}

/*
 * Explanation:
 * - Check each element one by one
 * - If matches with target → print index
 * - Time complexity: O(n)
 */
