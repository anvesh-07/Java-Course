package OOPS.Array;

class ArrayBasics {
  public static void main(String[] args) {
    int marks[] = { 24, 25, 26, 27 };

    for (int i = 0; i < marks.length; i++) {
      System.out.println("Student " + (i + 1) + " mark: " + marks[i]);
    }
  }
}

/*
 * Explanation:
 * - We declared an array marks[] which stores multiple values.
 * - Instead of creating separate variables (m1, m2, m3...),
 * we store all marks in a single array.
 * - We use marks.length to get the size of the array.
 * - We accessed each element by its index (starting from 0).
 */
