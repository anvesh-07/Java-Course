package OOPS.ClassAndObject;

// Class representing a Student
class Student {
  // Instance variables (properties)
  String name;
  int age;

  // Method (behavior of Student)
  void displayInfo() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
  }
}

// Main class to run program
public class StudentDemo {
  public static void main(String[] args) {
    Student s1 = new Student();
    s1.name = "Anvesh";
    s1.age = 22;
    s1.displayInfo();

    Student s2 = new Student();
    s2.name = "Ravi";
    s2.age = 20;
    s2.displayInfo();
  }
}

/*
 * Explanation:
 * 1) "Student" class is a blueprint having variables name & age, and a method
 * displayInfo().
 * 2) "s1" and "s2" are two objects of Student created in heap.
 * 3) Each object has its own copy of "name" and "age".
 * 4) Methods are called using the object reference.
 */
