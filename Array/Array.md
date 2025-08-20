# 📘 Arrays

## 🔹 1) What is an Array?

- In Java, an **array** is like a **box with many compartments**, where each compartment can store one value of the **same type** (like all integers, or all strings).
- These compartments are placed **side by side in memory** (this is called _contiguous memory_).

👉 Think of an array as a row of lockers in a school. Each locker has an **index number** (0, 1, 2, 3, …), and inside each locker, you can store a value.

### Example:

Suppose we want to store marks of 4 students:

```java
int marks[] = {24, 25, 26, 27};
```

Here:

- `marks[0] = 24` → marks of 1st student
- `marks[1] = 25` → marks of 2nd student
- `marks[2] = 26` → marks of 3rd student
- `marks[3] = 27` → marks of 4th student

⚡ Remember: In Java, **array indexing starts from 0**, not 1.

---

## 🔹 2) Why Do We Need Arrays?

### Without Arrays:

If you have 5 students and you want to store their marks, you would need 5 different variables:

```java
int m1 = 24;
int m2 = 25;
int m3 = 26;
int m4 = 27;
int m5 = 28;
```

Problems:

1. You must create **many variables** (hard to manage).
2. What if there are 100 students? You’d need 100 variables!

---

### With Arrays:

Instead of creating many variables, we can create **just one array**:

```java
int marks[] = {24, 25, 26, 27, 28};
```

- Now all marks are stored in **one place**.
- You can access them using **indexes**:

```java
System.out.println(marks[0]); // prints 24
System.out.println(marks[4]); // prints 28
```

✅ Much simpler, cleaner, and easier to use.

---

## 🔹 3) Simple Variable vs Array Variable

### Normal (Single) Variable:

- Stores **only one value** at a time.

```java
int num = 10;          // can store only one integer
boolean result = true; // can store only one true/false value
```

---

### Array Variable:

- Stores **multiple values of the same type** together.
- We declare arrays in two common ways:

```java
int nums[];    // declaring array (style 1)
int[] numbers; // declaring array (style 2)
```

👉 Both are correct. It’s up to you which style you prefer.

---

### Example with Initialization:

```java
int nums[] = {10, 20, 30, 40};  // array with 4 integers
```

Here:

- `nums[0] = 10`
- `nums[1] = 20`
- `nums[2] = 30`
- `nums[3] = 40`

⚡ The array automatically knows its size (`4` in this case).

---

# ✅ Quick Recap

1. An **array** is like a container that holds multiple values of the same type.
2. Arrays are useful because they replace the need for creating many separate variables.
3. A normal variable stores **one value**, but an array stores **many values** together.
4. Array elements are accessed using **indexes (starting at 0)**.

---
