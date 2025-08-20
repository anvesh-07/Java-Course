package problems;

class CheckSorted {
  public static void main(String[] args) {
    int nums[] = { 10, 20, 30, 40, 50 };
    boolean sorted = true;

    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] > nums[i + 1]) {
        sorted = false;
        break;
      }
    }

    if (sorted)
      System.out.println("Array is sorted");
    else
      System.out.println("Array is not sorted");
  }
}

/*
 * Explanation:
 * - Compare each element with next element
 * - If any element is greater than next → not sorted
 */
