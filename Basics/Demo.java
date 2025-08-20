package Basics;

import java.util.Arrays;

class Students {
  int role;
  String name;
  int marks;
}

public class Demo {
  public static void main(String[] args) {

    int[] a = { 50, 10, 30, 20, 40 };

    System.out.println("Before sorting: " + Arrays.toString(a));

    Arrays.sort(a, 4, 5);

    // int b = Arrays.copyOf(a,100 0)

    System.out.println("After sorting: " + Arrays.toString(a));

    // int[] a = { 1, 2, 3 };
    // int[] b = { 1, 2, 3, 4 };

    // // System.out.println(a.equals(a));
    // // System.out.println(a.getClass());
    // // // System.out.println(Arrays.equals(a, b));
    // // // System.out.println(Arrays.binarySearch(a, 0));
    // System.out.println(Arrays.toString(a));
    // System.out.println(Arrays.toString(b));
    // System.out.println();

    // int nums[] = new int[3];

    // // nums.clone();
    // // nums.toString();
    // // nums.equals(nums);
    // // nums.getClass();
    // // nums.hashCode();
    // // nums.notify();
    // // nums.notifyAll();
    // // int length = nums.length;

    // for (int i = 0; i < nums.length; i++) {
    // nums[i] = (int) (Math.random() * 100);
    // System.out.println(nums[i]);
    // }

    // int copy[] = nums.clone();

    // for (int i : nums) {
    // System.out.print(i + " ");
    // }
    // System.out.println();

    // for (int i : copy) {
    // System.out.print(i + " ");
    // }

    //

    // Students s1 = new Students();
    // Students s2 = new Students();
    // Students s3 = new Students();

    // s1.role = 1;
    // s1.name = "Anvesh";
    // s1.marks = 80;

    // s2.role = 2;
    // s2.name = "Narasimha";
    // s2.marks = 90;

    // s3.role = 3;
    // s3.name = "Susheela";
    // s3.marks = 100;

    // Students students[] = new Students[3];
    // students[0] = s1;
    // students[1] = s2;
    // students[2] = s3;

    // for (Students stu : students) {
    // System.out.println(stu.role + ": " + stu.name + ": " + stu.marks);
    // }

    // int nums[][] = new int[3][];
    // nums[0] = new int[2];
    // nums[1] = new int[3];
    // nums[2] = new int[4];

    // for (int[] row : nums) {
    // for (int col = 0; col < row.length; col++) {
    // row[col] = (int) (Math.random() * 100);
    // }
    // }

    // for (int[] row : nums) {
    // for (int val : row) {
    // System.out.print(val + " ");
    // }
    // System.out.println();
    // }
  }
}
