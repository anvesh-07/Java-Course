package OOPS.Methods;

class NumberChecker {
  public String checkEvenOdd(int number) {
    if (number % 2 == 0) {
      return number + " is even";
    } else {
      return number + " is odd";
    }
  }
}

public class NumberCheckDemo {
  public static void main(String[] args) {
    NumberChecker nc = new NumberChecker();
    String result1 = nc.checkEvenOdd(4);
    System.out.println(result1);
    String result2 = nc.checkEvenOdd(7);
    System.out.println(result2);
  }
}

/*
 * Explanation:
 * 1. NumberChecker class defines method checkEvenOdd(int).
 * 2. Inside, if number % 2 == 0, it returns "even" message; otherwise "odd"
 * message.
 * 3. In main(), we call checkEvenOdd(4) and checkEvenOdd(7).
 * 4. Each call returns a String, which we print immediately.
 */
