package Numbers;

public class GcdLcm {
  public static void main(String[] args) {
    int a = 15, b = 20;
    int gcd = 1;

    for (int i = 1; i <= a && i <= b; i++) {
      if (a % i == 0 && b % i == 0)
        gcd = i;
    }

    int lcm = (a * b) / gcd;

    System.out.println("GCD = " + gcd);
    System.out.println("LCM = " + lcm);
  }
}
