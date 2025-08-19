package OOPS.Methods.MethodOverloading;

// Shopping class demonstrates method overloading by changing data types
class Shopping {
  void totalPrice(int price, int quantity) {
    System.out.println("Total Price (int) = " + (price * quantity));
  }

  void totalPrice(double price, double quantity) {
    System.out.println("Total Price (double) = " + (price * quantity));
  }
}

public class ShoppingDemo {
  public static void main(String[] args) {
    Shopping shop = new Shopping();
    shop.totalPrice(100, 2); // Calls int version
    shop.totalPrice(99.99, 2.5); // Calls double version
  }
}

/*
 * Explanation:
 * - If integer values are given → totalPrice(int, int) executes.
 * - If double values are given → totalPrice(double, double) executes.
 * This shows method overloading with data types.
 */
