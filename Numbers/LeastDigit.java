package Numbers;

public class LeastDigit {
  public static void main(String[] args) {
    int num = 10072002;
    int min = 9;

    while (num > 0) {
      int d = num % 10;
      if (d < min)
        min = d;
      num = num / 10;
    }

    System.out.println("Least digit = " + min);
  }
}
