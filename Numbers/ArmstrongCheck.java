package Numbers;

// Armstrong: sum of (digit^number_of_digits) = number
// Example: 153 → 1^3+5^3+3^3=153

public class ArmstrongCheck {
  public static void main(String[] args) {
    int num = 153;
    int temp = num;
    int sum = 0;
    int digits = 0;

    // count digits
    int t = num;
    while (t > 0) {
      digits++;
      t = t / 10;
    }

    // calculate power sum
    while (temp > 0) {
      int d = temp % 10;
      int p = 1;
      for (int i = 1; i <= digits; i++) {
        p = p * d;
      }
      sum += p;
      temp = temp / 10;
    }

    if (sum == num)
      System.out.println(num + " is Armstrong");
    else
      System.out.println(num + " is Not Armstrong");
  }
}
