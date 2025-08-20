
class EnhancedForLoop {
  public static void main(String[] args) {

    int nums[] = { 10, 20, 30, 40 };
    System.out.println("Using Enhanced For Loop on Integer Array:");
    for (int n : nums) {
      System.out.println(n);
    }

    String languages[] = { "Java", "Python", "C++", "JavaScript" };
    System.out.println("\nUsing Enhanced For Loop on String Array:");
    for (String lang : languages) {
      System.out.println(lang);
    }
  }
}

/*
 * Explanation:
 * - Enhanced for loop (for-each loop) is used to easily go through elements in
 * an array.
 * - Syntax: for(datatype variable : array) { }
 * - It automatically goes from first element to last element.
 * - We don’t need to write index, condition, or increment.
 * 
 * Example:
 * int nums[] = {10, 20, 30};
 * for(int n : nums) {
 * System.out.println(n); // prints 10, 20, 30
 * }
 */
