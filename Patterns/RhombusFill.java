package Patterns;

public class RhombusFill {
  public static void main(String[] args) {
    int n = 5;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if ((i + j >= (n - 1) / 2) &&
            (i - j >= -((n - 1) / 2)) &&
            (i + j <= (3 * (n - 1)) / 2) &&
            (i - j <= (n - 1) / 2)) {
          System.out.print("* ");
        } else {
          System.out.print("_ ");
        }

      }
      System.out.println();
    }
  }
}
