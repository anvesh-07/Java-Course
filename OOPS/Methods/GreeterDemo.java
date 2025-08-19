package OOPS.Methods;

class Greeter {
  public void sayHello() {
    System.out.println("Hello from Greeter!");
  }
}

public class GreeterDemo {
  public static void main(String[] args) {
    Greeter g = new Greeter();
    g.sayHello();
  }
}

/*
 * Explanation:
 * 1. Greeter class defines behavior: sayHello()
 * 2. sayHello() method prints a fixed message. It's void, so it returns
 * nothing.
 * 3. In GreeterDemo.main(), we:
 * - create an instance (g) of Greeter on the heap,
 * - and call g.sayHello(), which executes the method and prints the message.
 */
