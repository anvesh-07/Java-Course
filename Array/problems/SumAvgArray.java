package problems;

class SumAvgArray {
  public static void main(String[] args) {
    int nums[] = { 10, 20, 30, 40, 50 };
    int sum = 0;

    for (int n : nums) {
      sum += n;
    }

    double avg = (double) sum / nums.length;

    System.out.println("Sum = " + sum);
    System.out.println("Average = " + avg);
  }
}

/*
 * Explanation:
 * - Traverse each element and keep adding to sum
 * - Average = sum / total elements
 */
