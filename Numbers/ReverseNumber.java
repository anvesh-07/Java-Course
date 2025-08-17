package Numbers;

public class ReverseNumber {
  public static void main(String[] args) {
    int num = 2025;
    int rev = 0;

    while (num > 0) {
      int digit = num % 10; // get last digit
      rev = rev * 10 + digit; // build reverse
      num = num / 10; // remove last digit
    }

    System.out.println("Reverse = " + rev);
  }
}
