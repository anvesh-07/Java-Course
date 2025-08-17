package Numbers;

// Strong number: sum of factorial of digits = number
// Example: 145 → 1!+4!+5! = 145

public class StrongNumber {
  public static void main(String[] args) {
    int num = 145;
    int temp = num, sum = 0;

    while (temp > 0) {
      int d = temp % 10;
      sum += factorial(d);
      temp = temp / 10;
    }

    if (sum == num)
      System.out.println(num + " is Strong");
    else
      System.out.println(num + " is Not Strong");
  }

  static int factorial(int n) {
    int f = 1;
    for (int i = 1; i <= n; i++)
      f *= i;
    return f;
  }
}
