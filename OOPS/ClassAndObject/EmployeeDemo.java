package OOPS.ClassAndObject;

class Employee {
  String name;
  double salary;

  void raiseSalary(double amount) {
    salary += amount;
  }

  void displayEmployee() {
    System.out.println("Name: " + name + ", Salary: " + salary);
  }
}

public class EmployeeDemo {
  public static void main(String[] args) {
    Employee e1 = new Employee();
    e1.name = "John";
    e1.salary = 50000;

    e1.displayEmployee();
    e1.raiseSalary(5000);
    e1.displayEmployee();
  }
}

/*
 * Explanation:
 * 1) "Employee" class has variables and methods to work with salary.
 * 2) "raiseSalary()" method changes the salary of the employee object.
 * 3) We created one object (e1) and updated its salary using the method.
 */
