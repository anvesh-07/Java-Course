# Method Overloading

## What is Method Overloading?

- Method Overloading means having **two or more methods with the same name** in a class but with **different parameters**.
- It is used when we want to perform a similar kind of task in different ways.

👉 Important: The **method name must be the same**, but the **parameters must be different**.
👉 Return type (like `int`, `void`, `String`) does **not matter** in overloading.

---

## Why do we need Method Overloading?

- To **reuse the same method name** for related tasks.
- It makes code **clean and readable**.
- Instead of remembering multiple method names, we can use **one name** with different parameter lists.

Example: A calculator can have `add(int, int)` and `add(double, double)`.

---

## Rules of Method Overloading

1. Methods must have the **same name**.
2. Methods must have **different parameters**.

   - Different **number of parameters**
   - OR different **types of parameters**
   - OR different **order of parameters**

3. Only changing the **return type** will not work.

---

## Types of Method Overloading

### 1. By Changing the Number of Parameters

```java
class Calculator {
    // Method with 2 parameters
    void add(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    // Method with 3 parameters
    void add(int a, int b, int c) {
        System.out.println("Sum = " + (a + b + c));
    }
}
```

### 2. By Changing the Data Types of Parameters

```java
class Calculator {
    void add(int a, int b) {
        System.out.println("Integer Sum = " + (a + b));
    }

    void add(double a, double b) {
        System.out.println("Double Sum = " + (a + b));
    }
}
```

### 3. By Changing the Order of Parameters

```java
class Printer {
    void printData(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    void printData(int age, String name) {
        System.out.println("Age: " + age + ", Name: " + name);
    }
}
```

---

## Key Points to Remember

- Overloading happens at **compile-time**, so it is also called:

  - Compile-time Polymorphism
  - Static Polymorphism
  - Early Binding

- Return type does not decide overloading. Only parameters matter.
- Overloading makes programs **flexible and easier to read**.

---
