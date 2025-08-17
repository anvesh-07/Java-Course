package Numbers;

public class SingleDigitSum {
  public static void main(String[] args) {
    int num = 1998;

    while (num > 9) {
      int sum = 0;
      while (num > 0) {
        sum += num % 10;
        num = num / 10;
      }
      num = sum;
    }

    System.out.println("Single digit sum = " + num);
  }
}
