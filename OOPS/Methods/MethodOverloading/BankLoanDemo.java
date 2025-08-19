package OOPS.Methods.MethodOverloading;

// BankLoan class demonstrates overloading using number, type, and order of parameters
class BankLoan {
  // Loan with only amount
  void loan(int amount) {
    System.out.println("Loan taken: " + amount);
  }

  // Loan with amount and years
  void loan(int amount, int years) {
    System.out.println("Loan: " + amount + " for " + years + " years");
  }

  // Loan with amount, years and interest
  void loan(int amount, int years, double rate) {
    System.out.println("Loan: " + amount + " for " + years + " years at " + rate + "% interest");
  }

  // Loan with decimal amount
  void loan(double amount, int years) {
    System.out.println("Loan (double): " + amount + " for " + years + " years");
  }
}

public class BankLoanDemo {
  public static void main(String[] args) {
    BankLoan loan = new BankLoan();
    loan.loan(50000);
    loan.loan(100000, 5);
    loan.loan(200000, 10, 7.5);
    loan.loan(75000.50, 3);
  }
}

/*
 * Explanation:
 * - loan(int) → if only amount is given.
 * - loan(int, int) → if amount and years are given.
 * - loan(int, int, double) → if amount, years and interest rate are given.
 * - loan(double, int) → if amount is decimal and years are given.
 * This covers all real-world method overloading possibilities.
 */
