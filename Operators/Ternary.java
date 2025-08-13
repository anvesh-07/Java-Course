package Operators;

public class Ternary {
  public static void main(String[] args) {
        int number = 10;

        // Simple even/odd check
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(number + " is " + result);

        // Multiple ternary usage
        int score = 85;
        String grade = (score >= 90) ? "A" :
                       (score >= 75) ? "B" :
                       (score >= 50) ? "C" : "F";
        System.out.println("Grade: " + grade);

        // Boolean example
        boolean isMember = true;
        int price = isMember ? 80 : 100; // Discount for members
        System.out.println("Price: " + price);
    }
}
