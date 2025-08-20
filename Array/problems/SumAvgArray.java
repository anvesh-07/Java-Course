package problems;

import java.util.Scanner;

class SumAvgArray {
  public static void main(String[] args) {
    int len;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter length of array: ");
    len = sc.nextInt();
    int nums[] = new int[len];

    for (int i = 0; i < len; i++) {
      System.out.print("Enter element " + (i + 1) + ": ");
      nums[i] = sc.nextInt();
    }
    sc.close();

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
