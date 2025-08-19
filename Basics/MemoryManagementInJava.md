# 📘 Memory Management in Java

Java manages memory automatically using the **Java Virtual Machine (JVM)**. The JVM divides memory into two main categories:

1. **Stack Memory**
2. **Heap Memory**

This document explains how memory works in Java, where different types of variables are stored, and gives examples for clarity.

---

## 1. Memory Categories in Java

### a) **Stack Memory**

- Stack is a **data structure** that follows **LIFO (Last In First Out)** principle.
- Stores:

  - **Method calls (stack frames)**
  - **Local variables**
  - **Reference variables** (addresses of objects in heap)

- When a method is called → a **stack frame** is created.
- When the method finishes → its stack frame is removed automatically.

👉 Example: Think of a pile of books. The last book you put on top is the first one you remove.

---

### b) **Heap Memory**

- Heap memory is used for **dynamic allocation of objects**.
- Stores:

  - **Objects**
  - **Instance variables**

- Heap memory is managed by the **Garbage Collector**, which deletes unused objects automatically.
- Objects in heap can be accessed from multiple methods if a reference exists.

👉 Example: Think of a big storage room where objects live until you throw them away.

---

## 2. Example: Student Class

```java
class Student {
    int instVariable; // Instance variable

    public static void main(String[] args) {
        int localVariable = 0;   // Local variable
        Student st = new Student(); // Reference variable
    }

    public int add(int num1, int num2) {
        return num1 + num2;
    }
}
```

---

## 3. Where is Each Variable Stored?

1. **Instance Variable (`instVariable`)**

   - Belongs to the object.
   - Stored inside the **object in heap**.
   - Each new object has its own copy.

2. **Local Variable (`localVariable`)**

   - Declared inside a method.
   - Stored in the **stack frame** of that method.
   - Removed when the method ends.

3. **Reference Variable (`st`)**

   - Created in the **stack frame** of the current method.
   - Stores the **address of the object** created in heap.

4. **Object (`new Student()`)**

   - Created in the **heap memory**.
   - Contains all **instance variables**.

5. **Method Execution**

   - Each method call (e.g., `main`, `add`) creates a **stack frame**.
   - Parameters (`num1`, `num2`) and local variables exist in that frame.

---

## 4. Memory Diagram (Visualization)

For the code:

```java
int localVariable = 0;
Student st = new Student();
```

**Stack Area:**

```
main() Stack Frame
  localVariable = 0
  st = (address of Student object in heap)
```

**Heap Area:**

```
Student Object
  instVariable = 0 (default value)
```

---

## 5. Quick Summary

- **Stack:**

  - Stores local variables, reference variables, and method calls (stack frames).
  - Works with LIFO principle.
  - Memory is freed automatically when methods finish.

- **Heap:**

  - Stores objects and their instance variables.
  - Managed by Garbage Collector.
  - Objects can outlive the method that created them if references exist.

- **Instance variable → Heap**

- **Local variable → Stack**

- **Reference variable → Stack (but points to heap object)**
