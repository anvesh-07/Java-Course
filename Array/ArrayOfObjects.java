
class Student {
  String name;
  int age;

  Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  void display() {
    System.out.println("Name: " + name + ", Age: " + age);
  }
}

class ArrayOfObjects {
  public static void main(String[] args) {
    // Creating an array of Student references
    Student students[] = new Student[3];

    // Assigning objects to array
    students[0] = new Student("Alice", 20);
    students[1] = new Student("Bob", 21);
    students[2] = new Student("Charlie", 22);

    // Iterating using normal for loop
    for (int i = 0; i < students.length; i++) {
      students[i].display();
    }
  }
}

/*
 * Explanation:
 * - We created an array "students" that can hold Student objects.
 * - Each index stores a reference to a Student object.
 * - This is useful when we need to manage multiple objects together.
 */
