package Numbers;

public class SpecificDigit {
  public static void main(String[] args) {
    int num = 54821;
    int position = 3;
    int digit = 0;

    for (int i = 1; i <= position; i++) {
      digit = num % 10;
      num = num / 10;
    }

    System.out.println("Digit at position " + position + " is: " + digit);
  }
}
