package problems;

class EvenOddCount {
  public static void main(String[] args) {
    int nums[] = { 10, 21, 30, 45, 50, 77 };
    int even = 0, odd = 0;

    for (int n : nums) {
      if (n % 2 == 0)
        even++;
      else
        odd++;
    }

    System.out.println("Even count = " + even);
    System.out.println("Odd count = " + odd);
  }
}

/*
 * Explanation:
 * - If element % 2 == 0 → even
 * - Else odd
 * - Keep separate counters
 */
