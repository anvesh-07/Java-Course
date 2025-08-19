package OOPS.Array;

class ArrayDrawbacks {
  public static void main(String[] args) {
    int nums[] = new int[3];
    nums[0] = 10;
    nums[1] = 20;
    nums[2] = 30;

    // nums[3] = 40; // ❌ This will cause ArrayIndexOutOfBoundsException

    for (int n : nums) {
      System.out.println(n);
    }
  }
}

/*
 * Explanation:
 * - Arrays have fixed size. Once created, you cannot add more elements.
 * - If you try to access nums[3] (4th element) when array size is 3,
 * Java throws ArrayIndexOutOfBoundsException.
 * - This shows one drawback of arrays.
 */
