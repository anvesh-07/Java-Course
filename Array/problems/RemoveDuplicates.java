package problems;

class RemoveDuplicates {
  public static void main(String[] args) {
    int nums[] = { 10, 20, 20, 30, 40, 40, 50 };
    int n = nums.length;

    int temp[] = new int[n];
    int j = 0;

    for (int i = 0; i < n - 1; i++) {
      if (nums[i] != nums[i + 1]) {
        temp[j++] = nums[i];
      }
    }
    temp[j++] = nums[n - 1];

    System.out.print("Array without duplicates: ");
    for (int i = 0; i < j; i++) {
      System.out.print(temp[i] + " ");
    }
  }
}

/*
 * Explanation:
 * - Works if array is sorted
 * - Compare current element with next
 * - If different → copy to temp array
 * - At end, copy last element
 */
