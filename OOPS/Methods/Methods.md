# Methods in Java

## 1. What is a Method in Java?
- A **method** in Java is a collection of statements that perform a specific task and may return a result to the caller.
- Methods allow **code reusability** – instead of writing the same logic multiple times, we can define it once inside a method and call it whenever needed.
- In Java, methods are always defined inside a **class**.
- A class represents a real-world entity, and its **behavior** is represented through methods.
- Every method is defined with a **name** and followed by **round brackets `()`**.
- We can also specify the **access modifier** (e.g., `public`, `private`) for a method to control its visibility.
- A method can:
  - Perform a task (with or without returning a result).
  - Accept inputs (parameters).
  - Return an output using the `return` keyword.

👉 **Key Point:** Once the `return` keyword executes, no further statements in that method are executed.

---

## 2. Types of Return Values in Methods
- `void` → Used when the method does not return any value.
- `int` → Used when the method returns an integer.
- `String` → Used when the method returns a string.
- (Similarly, we can use other data types like `double`, `boolean`, or even custom objects.)

Example:
```java
class Calculator {
    // Method without return value
    public void displayMessage() {
        System.out.println("Hello, welcome to Calculator!");
    }

    // Method returning an integer
    public int add(int a, int b) {
        return a + b;
    }

    // Method returning a string
    public String greet(String name) {
        return "Hello, " + name;
    }
}
```

---

## 3. The Main Method in Java
- The **main method** is the **entry point** of a Java program.
- Execution always starts from the main method.
- Syntax:
```java
public static void main(String[] args) {
    // program execution starts here
}
```

- **Breakdown:**
  - `public` → Accessible everywhere.
  - `static` → Can be called without creating an object.
  - `void` → It does not return anything.
  - `main` → The name recognized by JVM to start execution.
  - `String[] args` → Used to pass command-line arguments.

---

## 4. Syntax of Method in Java
```java
class Computer {
    // Method without return type (void)
    public void playMusic() {
        System.out.println("Music Playing...");
    }

    // Method with return type (int)
    public int getNumber() {
        return 10;
    }
}

class Test {
    public static void main(String[] args) {
        // Creating an object of Computer class
        Computer comp = new Computer();

        // Calling method
        comp.playMusic();  // Output: Music Playing...

        int num = comp.getNumber();
        System.out.println("Number is: " + num);  // Output: Number is: 10
    }
}
```

---

## 5. Summary
- A **method** is a block of code inside a class that performs a task.
- Methods help in **code reusability, organization, and readability**.
- Methods can have **return types** (int, String, etc.) or be `void` if nothing is returned.
- The **main method** is the starting point of execution in every Java program.
- Syntax of a method includes:
  - Access modifier (`public`, `private`)
  - Return type (`void`, `int`, `String`...)
  - Method name
  - Parameters (optional)
  - Body (code inside `{ }`).

