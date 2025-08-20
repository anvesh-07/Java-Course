package problems;

class CopyArray {
  public static void main(String[] args) {
    int nums1[] = { 1, 2, 3, 4, 5 };
    int nums2[] = new int[nums1.length];

    for (int i = 0; i < nums1.length; i++) {
      nums2[i] = nums1[i];
    }

    System.out.print("Copied Array: ");
    for (int n : nums2) {
      System.out.print(n + " ");
    }
  }
}

/*
 * Explanation:
 * - Create new array with same size
 * - Copy elements one by one
 */
