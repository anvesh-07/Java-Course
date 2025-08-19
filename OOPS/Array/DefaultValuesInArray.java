package OOPS.Array;

class DefaultValuesInArray {
  public static void main(String[] args) {
    int nums[] = new int[3]; // default value: 0
    String names[] = new String[3]; // default value: null
    boolean flags[] = new boolean[3]; // default value: false

    System.out.println("Default values in int array:");
    for (int n : nums) {
      System.out.println(n);
    }

    System.out.println("Default values in String array:");
    for (String s : names) {
      System.out.println(s);
    }

    System.out.println("Default values in boolean array:");
    for (boolean b : flags) {
      System.out.println(b);
    }
  }
}

/*
 * Explanation:
 * - When an array is created using 'new', its elements are initialized
 * with default values:
 * int → 0
 * float → 0.0
 * boolean → false
 * Object → null
 * - This happens automatically in Java.
 */
