package Numbers;

public class PrimeCheck {
  public static void main(String[] args) {
    int num = 29;
    boolean prime = true;

    if (num <= 1)
      prime = false;
    else {
      for (int i = 2; i <= num / 2; i++) {
        if (num % i == 0) {
          prime = false;
          break;
        }
      }
    }

    if (prime)
      System.out.println(num + " is Prime");
    else
      System.out.println(num + " is Not Prime");
  }
}
