package OOPS.Methods;

class Calculator {
  public int add(int a, int b) {
    return a + b;
  }
}

public class CalculatorDemo {
  public static void main(String[] args) {
    Calculator calc = new Calculator();
    int sum = calc.add(5, 7);
    System.out.println("Sum: " + sum);
  }
}

/*
 * Explanation:
 * 1. Calculator class has a method add(int a, int b).
 * 2. add() returns the result of adding its two parameters.
 * 3. In main(), we create Calculator object, call add(5, 7), and store result
 * in sum.
 * 4. Then we print the result. The method returns an int, so we can assign and
 * use it.
 */
