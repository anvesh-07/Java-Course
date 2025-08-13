package Operators;

public class Relational {
   public static void main(String[] args) {
        int a = 10, b = 20;

        System.out.println("a == b: " + (a == b)); // false
        System.out.println("a != b: " + (a != b)); // true
        System.out.println("a > b: " + (a > b));   // false
        System.out.println("a < b: " + (a < b));   // true
        System.out.println("a >= b: " + (a >= b)); // false
        System.out.println("a <= b: " + (a <= b)); // true

        // Equality check for strings
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");

        System.out.println("s1 == s2: " + (s1 == s2)); // true (same reference in string pool)
        System.out.println("s1 == s3: " + (s1 == s3)); // false (different object)
        System.out.println("s1.equals(s3): " + s1.equals(s3)); // true (content is same)
    }
}
