package Numbers;

public class SumEvenOddDigits {
  public static void main(String[] args) {
    int num = 1234;
    int evenSum = 0, oddSum = 0;

    while (num > 0) {
      int d = num % 10;
      if (d % 2 == 0)
        evenSum += d;
      else
        oddSum += d;
      num = num / 10;
    }

    System.out.println("Even sum = " + evenSum);
    System.out.println("Odd sum = " + oddSum);
  }
}
