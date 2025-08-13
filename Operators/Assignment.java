package Operators;

public class Assignment {
  public static void main(String[] args) {
        int a = 10;

        System.out.println("Initial a = " + a);

        a += 5; // Add and assign
        System.out.println("a += 5 → " + a);

        a -= 3; // Subtract and assign
        System.out.println("a -= 3 → " + a);

        a *= 2; // Multiply and assign
        System.out.println("a *= 2 → " + a);

        a /= 4; // Divide and assign
        System.out.println("a /= 4 → " + a);

        a %= 3; // Modulus and assign
        System.out.println("a %= 3 → " + a);
    }
}
