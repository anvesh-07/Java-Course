# 📘 Class and Object in Java

## 1. What is a Class?

- A **class** is a **blueprint/template** for creating objects.
- It defines **properties (variables/fields)** and **behaviors (methods)**.
- A class does not occupy memory until we create an object from it.

👉 Example:
Think of a **class as a blueprint of a house**.

- The blueprint defines what the house will look like (rooms, doors, windows).
- But no actual house exists until we build it.

### Syntax of a Class:

```java
class ClassName {
    // Fields (variables)
    // Methods (behaviors)
}
```

---

## 2. What is an Object?

- An **object** is a **real-world entity** created from a class.
- When we create an object, memory is allocated in the **heap**.
- Each object has its own copy of **instance variables**, but can use the methods defined in the class.

👉 Example:
If **class = Car blueprint**, then objects are **actual cars** like Maruti, Tesla, BMW, etc.

### Syntax of Creating Object:

```java
ClassName objectName = new ClassName();
```

---

## 3. Example of Class and Object

```java
class Student {
    // Instance variables (properties)
    String name;
    int age;

    // Method (behavior)
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating object of Student class
        Student s1 = new Student();

        // Assigning values to instance variables
        s1.name = "Anvesh";
        s1.age = 22;

        // Calling method using object
        s1.displayInfo();
    }
}
```

### Output:

```
Name: Anvesh
Age: 22
```

---

## 4. Key Points

1. **Class**

   - Blueprint/template
   - Defines variables and methods
   - Does not occupy memory until object creation

2. **Object**

   - Instance of a class
   - Occupies memory in heap
   - Has its own values for instance variables

3. **Reference Variable**

   - Object is accessed using a reference variable stored in stack
   - Example: `Student s1 = new Student();`

     - `s1` → reference variable (stack)
     - `new Student()` → object (heap)

---

## 5. Memory Allocation for Class & Object

When `Student s1 = new Student();` executes:

**Stack:**

```
main() Stack Frame
   s1 → (address of Student object in heap)
```

**Heap:**

```
Student Object
   name = null
   age = 0
```

---

## 6. Real-World Analogy

- **Class** = Recipe of a cake (blueprint)
- **Object** = Actual cake made from the recipe

---

## 7. Quick Summary

- **Class** = Blueprint / Template
- **Object** = Instance of a class
- **Reference Variable** = Handle to access object in heap
- **Instance Variables** → Stored in heap (inside object)
- **Methods** → Called using objects
