# Jagged Arrays in Java\*\*

In this lecture, we are discussing:

1. What is an array of arrays with different sizes?
2. Jagged array concept
3. What if I don’t know the column size of the array?
4. Traversing a jagged array using `for loop` and `enhanced for loop`

---

## 1. What if Array of Arrays Have Different Sizes?

In Java, normally when we create a 2D array, all rows must have the same number of columns.
Example:

```java
int nums[][] = new int[3][4]; // 3 rows and 4 columns
```

Here, every row will always have 4 elements.

But sometimes we want a **2D array where each row has a different number of elements.**
Example:

```
Row 1 → 3 elements  → {1, 2, 3}
Row 2 → 5 elements  → {4, 5, 6, 7, 8}
Row 3 → 6 elements  → {1, 5, 9, 2, 4, 7}
```

Diagrammatically:

```
-------------
| 1 | 2 | 3 |
---------------------
| 4 | 5 | 6 | 7 | 8 |
-----------------------------
| 1 | 5 | 9 | 2 | 4 | 7 |
```

This is called a **Jagged Array.**

---

## **2. Jagged Array Concept**

A **Jagged Array** is a **multidimensional array where each row can have a different number of columns.**

- In normal 2D arrays → all rows have equal columns.
- In jagged arrays → rows can have different sizes.

### **Syntax for Creating Jagged Array**

```java
int nums[][] = new int[3][]; // 3 rows, but column sizes are not fixed yet

// Assign different column sizes for each row
nums[0] = new int[3]; // 1st row → 3 elements
nums[1] = new int[5]; // 2nd row → 5 elements
nums[2] = new int[6]; // 3rd row → 6 elements
```

---

## **3. Initializing Jagged Array**

We can assign values using loops.
Here we use `Math.random()` to insert random numbers:

```java
for (int i = 0; i < nums.length; i++) {
    for (int j = 0; j < nums[i].length; j++) {
        nums[i][j] = (int)(Math.random() * 10); // random numbers from 0–9
    }
}
```

---

## **4. Traversing a Jagged Array**

### **Using Normal For Loop**

```java
for (int i = 0; i < nums.length; i++) {
    for (int j = 0; j < nums[i].length; j++) {
        System.out.print(nums[i][j] + " ");
    }
    System.out.println(); // move to next row
}
```

### **Using Enhanced For Loop**

```java
for (int[] row : nums) {      // each row is itself an array
    for (int val : row) {     // each element inside row
        System.out.print(val + " ");
    }
    System.out.println();
}
```

---

## **Note: Jagged Arrays Can Be Multidimensional**

Just like 2D jagged arrays, we can also create **3D jagged arrays, 4D jagged arrays, etc.**

### **Example: 3D Jagged Array**

```java
int num[][][] = new int[3][][];

// Define 2D arrays of different sizes
num[0] = new int[2][];
num[1] = new int[3][];
num[2] = new int[4][];

// Define columns for each 2D array
num[0][0] = new int[2];
num[0][1] = new int[3];
num[1][0] = new int[4];
num[1][1] = new int[5];
num[1][2] = new int[6];
num[2][0] = new int[7];
num[2][1] = new int[8];
num[2][2] = new int[9];
num[2][3] = new int[10];
```

### **Initializing 3D Jagged Array**

```java
for (int i = 0; i < num.length; i++) {
    for (int j = 0; j < num[i].length; j++) {
        for (int k = 0; k < num[i][j].length; k++) {
            num[i][j][k] = (int)(Math.random() * 10);
        }
    }
}
```

### **Traversing 3D Jagged Array**

```java
for (int i = 0; i < num.length; i++) {
    for (int j = 0; j < num[i].length; j++) {
        for (int k = 0; k < num[i][j].length; k++) {
            System.out.print(num[i][j][k] + " ");
        }
        System.out.println();
    }
    System.out.println("----------------");
}
```

---

## **Key Takeaways**

1. Jagged arrays allow **different column sizes** in each row.
2. They are useful when the data is **not uniform.**
3. We can initialize them manually or using loops.
4. Traversal is done using **for loop** or **enhanced for loop.**
5. Jagged arrays can be **multi-dimensional** as well.
