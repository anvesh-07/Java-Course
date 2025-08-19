# Arrays

## 1) Ways to Create Arrays in Java

In Java, arrays can be created in **two main ways**:

### a) **Literal Notation**

This is the simplest way. You directly assign values when declaring the array.

```java
int[] arr = {1, 2, 3, 4, 5};
```

- Here, the compiler automatically knows the size of the array (5 in this case).
- Easy to use when you already know the values.

---

### b) **Object Notation (Array Constructor)**

#### (i) With Initialization

You can use the `new` keyword to create an array and assign values:

```java
int[] arr = new int[]{1, 2, 3, 4, 5};
```

#### (ii) With Size Only

You can define the size first, and then assign values later:

```java
int[] arr = new int[5];  // Creates an array of size 5
arr[0] = 10;
arr[1] = 20;
arr[2] = 30;
arr[3] = 40;
arr[4] = 50;
```

👉 If you do not assign values, Java automatically assigns **default values** (explained below).

---

## 2) Default Values in Arrays

When you create an array using **object notation with size only**, Java fills it with default values based on the data type:

- **int, byte, short, long** → `0`
- **float** → `0.0f`
- **double** → `0.0d`
- **boolean** → `false`
- **char** → `'\u0000'` (null character)
- **Objects (like String, custom classes)** → `null`

### Example: Default Values in `char` Array

```java
class CharArrayExample {
    public static void main(String[] args) {
        char[] ch = new char[3]; // size = 3

        for (int i = 0; i < ch.length; i++) {
            System.out.println("ch[" + i + "] = '" + ch[i] + "'");
        }
    }
}
```

**Output:**

```
ch[0] = ' '
ch[1] = ' '
ch[2] = ' '
```

(Actually it prints blank because `'\u0000'` is not visible.)

---

## 3) Fetching and Updating Array Elements

### Accessing Elements by Index

- Array index always starts at **0** and goes till `length - 1`.
- Example:

  - First element → `arr[0]`
  - Second element → `arr[1]`
  - nth element → `arr[n-1]`

```java
int[] nums = {2, 3, 4, 5};

System.out.println(nums[0]); // 2
System.out.println(nums[1]); // 3
System.out.println(nums[2]); // 4
System.out.println(nums[3]); // 5
```

---

### Traversing the Entire Array (Fetching All Elements)

```java
int[] nums = {2, 3, 4, 5};

for (int i = 0; i < nums.length; i++) {
    System.out.println("Element at index " + i + " = " + nums[i]);
}
```

---

### Updating Array Elements

You can directly change values at any index.

```java
int[] nums = {2, 3, 4, 5};

// Updating values
nums[0] = 10;
nums[1] = 11;
nums[2] = 22;
nums[3] = 33;

// Print updated values
for (int i = 0; i < nums.length; i++) {
    System.out.println("Updated element at index " + i + " = " + nums[i]);
}
```

**Output:**

```
Updated element at index 0 = 10
Updated element at index 1 = 11
Updated element at index 2 = 22
Updated element at index 3 = 33
```

---

## 4) Key Takeaways

1. Array = collection of similar type of data stored in **contiguous memory**.
2. You can create arrays in **literal** or **object notation**.
3. By default, arrays are filled with **default values** depending on the data type.
4. Arrays are accessed using **index**, starting from `0`.
5. You can **fetch, traverse, and update** array elements easily.
