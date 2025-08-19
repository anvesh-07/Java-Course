package OOPS.Methods.MethodOverloading;

// UserDetails class demonstrates method overloading by changing parameter order

class UserDetails {
  void printDetails(String name, int age) {
    System.out.println("Name: " + name + ", Age: " + age);
  }

  void printDetails(int age, String name) {
    System.out.println("Age: " + age + ", Name: " + name);
  }
}

public class UserDetailsDemo {
  public static void main(String[] args) {
    UserDetails user = new UserDetails();
    user.printDetails("Anvesh", 25);
    user.printDetails(30, "Reddy");
  }
}

/*
 * Explanation:
 * Both methods have the same name but parameters are in different order.
 * - printDetails(String, int) is called if (String, int) is passed.
 * - printDetails(int, String) is called if (int, String) is passed.
 */
