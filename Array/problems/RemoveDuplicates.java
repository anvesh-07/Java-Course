package problems;

class RemoveDuplicates {
  public static void main(String[] args) {
    int nums[] = { 10, 20, 20, 30, 40, 40, 50 };
    int n = nums.length;

    int[] unique = new int[n];
    int j = 0;

    for (int i = 0; i < n; i++) {
      boolean isDuplicate = false;

      for (int k = 0; k < j; k++) {
        if (nums[i] == unique[k]) {
          isDuplicate = true;
          break;
        }
      }

      if (!isDuplicate) {
        unique[j++] = nums[i];
      }
    }

    // print result
    System.out.print("Array without duplicates: ");
    for (int i = 0; i < j; i++) {
      System.out.print(unique[i] + " ");
    }
  }
}

/*
 * Explanation:
 * - For each element in nums[]
 * - Check in unique[] if it already exists
 * - If not, insert into unique[]
 * - Finally, print only unique values
 * - Works for both sorted and unsorted arrays
 */
