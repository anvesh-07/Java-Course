package OOPS.Methods.MethodOverloading;

// Calculator class demonstrates method overloading by changing number of parameters
class Calculator {
  // Add two numbers
  void add(int a, int b) {
    System.out.println("Sum of 2 numbers = " + (a + b));
  }

  // Add three numbers
  void add(int a, int b, int c) {
    System.out.println("Sum of 3 numbers = " + (a + b + c));
  }

  // Add four numbers
  void add(int a, int b, int c, int d) {
    System.out.println("Sum of 4 numbers = " + (a + b + c + d));
  }
}

public class CalculatorDemo {
  public static void main(String[] args) {
    Calculator calc = new Calculator();
    calc.add(10, 20);
    calc.add(10, 20, 30);
    calc.add(1, 2, 3, 4);
  }
}

/*
 * Explanation:
 * Here, the 'add' method is overloaded 3 times.
 * - If 2 arguments are passed → add(int, int) is called.
 * - If 3 arguments are passed → add(int, int, int) is called.
 * - If 4 arguments are passed → add(int, int, int, int) is called.
 */
