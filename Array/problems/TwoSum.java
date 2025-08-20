package problems;

/*
 Problem Statement:
 -----------------
 Given an array of integers (nums) and an integer (target),
 return indices of the two numbers such that they add up to the target.

 Conditions:
 - You may assume that each input would have exactly one solution.
 - You may not use the same element twice.
 - Return the indices in any order.

 Example Test Cases:
 -------------------
 Input: nums = [2,7,11,15], target = 9
 Output: [0,1]
 Explanation: nums[0] + nums[1] = 2 + 7 = 9

 Input: nums = [3,2,4], target = 6
 Output: [1,2]
 Explanation: nums[1] + nums[2] = 2 + 4 = 6

 Input: nums = [3,3], target = 6
 Output: [0,1]
 Explanation: nums[0] + nums[1] = 3 + 3 = 6
*/

import java.util.Scanner;

class SumArray {
  int twoSum(int nums[], int target)[] {

    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {

        if (nums[i] + nums[j] == target) {
          int result[] = { i, j };
          return result;
        }
      }
    }
    return new int[] { -1, -1 };
  }
}

class TwoSum {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter size of array: ");
    int n = sc.nextInt();

    int nums[] = new int[n];

    System.out.println("Enter " + n + " elements:");
    for (int i = 0; i < n; i++) {
      System.out.println("Enter element " + (i + 1) + ": ");
      nums[i] = sc.nextInt();
    }

    System.out.print("Enter target value: ");
    int target = sc.nextInt();

    SumArray sa = new SumArray();

    int result[] = sa.twoSum(nums, target);

    if (result[0] == -1) {
      System.out.println("No solution found");
    } else {
      System.out.println("[" + result[0] + "," + result[1] + "]");
    }

    sc.close();
  }
}
