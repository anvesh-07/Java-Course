package Numbers;

public class LengthOfNumber {
  public static void main(String[] args) {
    int num = 100;
    int count = 0;

    while (num > 0) {
      num = num / 10; // remove last digit
      count++; // increase digit count
    }

    System.out.println("Length = " + count);
  }
}
