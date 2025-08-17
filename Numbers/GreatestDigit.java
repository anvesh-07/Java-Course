package Numbers;

public class GreatestDigit {
  public static void main(String[] args) {
    int num = 10072002;
    int max = 0;

    while (num > 0) {
      int d = num % 10;
      if (d > max)
        max = d;
      num = num / 10;
    }

    System.out.println("Greatest digit = " + max);
  }
}
