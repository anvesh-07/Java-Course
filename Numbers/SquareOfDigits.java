package Numbers;

public class SquareOfDigits {
  public static void main(String[] args) {
    int num = 1234;
    int sum = 0;

    while (num > 0) {
      int d = num % 10;
      sum += d * d;
      num = num / 10;
    }

    System.out.println("Sum of squares = " + sum);
  }
}
