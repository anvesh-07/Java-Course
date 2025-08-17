package Numbers;

public class OddNumbers {
  public static void main(String[] args) {
    long num = 998866554455L;
    long result = 0;
    long place = 1;

    while (num > 0) {
      int digit = (int) (num % 10);
      if (digit % 2 != 0) {
        result = digit * place + result;
        place *= 10;
      }
      num = num / 10;
    }

    System.out.println("Odd digits = " + result);
  }
}
