package Numbers;

public class FactorialDigits {
  public static void main(String[] args) {
    int num = 123456;
    int sum = 0;

    while (num > 0) {
      int digit = num % 10;
      sum += factorial(digit);
      num = num / 10;
    }

    System.out.println("Sum of factorials = " + sum);
  }

  static int factorial(int n) {
    int f = 1;
    for (int i = 1; i <= n; i++)
      f *= i;
    return f;
  }
}
