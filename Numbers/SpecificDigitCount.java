package Numbers;

public class SpecificDigitCount {
  public static void main(String[] args) {
    int num = 5432887;
    int digitToFind = 5;
    int count = 0;

    while (num > 0) {
      if (num % 10 == digitToFind)
        count++;
      num = num / 10;
    }

    System.out.println("Digit " + digitToFind + " appears " + count + " times");
  }
}
