package Numbers;

public class SumOfDigits {
  public static void main(String[] args) {
    int num = 2002;
    int sum = 0;

    while (num > 0) {
      sum += num % 10;
      num = num / 10;
    }

    System.out.println("Sum = " + sum);
  }
}
