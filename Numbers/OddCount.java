package Numbers;

public class OddCount {
  public static void main(String[] args) {
    int num = 200219198;
    int count = 0;

    while (num > 0) {
      int digit = num % 10;
      if (digit % 2 != 0)
        count++;
      num = num / 10;
    }

    System.out.println("Odd digits count = " + count);
  }
}
