# Multidimensional Arrays in Java

In this lecture, we are discussing:

1. What is a multidimensional array?
2. Why do we need a multidimensional array?
3. How to create a multidimensional array?
4. How to access elements of a multidimensional array?
5. How to traverse a multidimensional array using simple loop and enhanced for loop?

---

## 1) What is a multidimensional array?

- A **multidimensional array** is simply an **array of arrays**.
- The most common type is the **2D array**, which looks like a table (rows and columns).

Example of a 2D array with 2 rows and 3 columns:

```
-------------
| 1 | 2 | 3 |
-------------
| 4 | 5 | 6 |
-------------
```

- This is a **2D array**, where:

  - Row indices are `0` and `1`.
  - Column indices are `0`, `1`, `2`.

- Just like that, you can also create 3D arrays or even higher dimensions, but most problems can be solved using 2D arrays.

---

## 2) Why do we need a multidimensional array?

We need multidimensional arrays to represent **tabular data or grid-like structures**.
Some examples:

- To solve **matrix-related problems** (like addition, multiplication).
- To represent a **game board** (like chess or tic-tac-toe).
- To work with **tables**, **rows & columns** of numbers.

---

## 3) How to create a multidimensional array in Java?

There are two main ways:

### a) Literal notation

Here we directly assign values:

```java
int [][]arr = {{1, 2, 3}, {4, 5, 6}};
```

This creates the same 2D array:

```
-------------
| 1 | 2 | 3 |
-------------
| 4 | 5 | 6 |
-------------
```

### b) Object notation

Here we first create an empty 2D array with a given size:

```java
int [][]nums = new int[2][3]; // 2 rows, 3 columns
```

- By default, all values are `0` (because int default value is 0).
- Later we can assign values:

```java
nums[0][0] = 1;
nums[0][1] = 2;
nums[0][2] = 3;
nums[1][0] = 4;
nums[1][1] = 5;
nums[1][2] = 6;
```

---

## 4) How to access elements of a multidimensional array?

Let’s take the array again:

```java
int [][]arr = {{1, 2, 3}, {4, 5, 6}};
```

- To access element at **row 0 and column 1**:

```java
System.out.println(arr[0][1]); // Output: 2
```

- General rule:

```java
arr[i][j]; // element at ith row and jth column
```

Example:

- `arr[0][0]` → 1
- `arr[0][2]` → 3
- `arr[1][1]` → 5

---

## 5) Traversing elements of a multidimensional array

### a) Using simple nested for loop

```java
int [][]arr = {{1, 2, 3}, {4, 5, 6}};

for(int i = 0; i < arr.length; i++){ // arr.length = number of rows
    for(int j = 0; j < arr[i].length; j++){ // arr[i].length = number of columns in ith row
        System.out.print(arr[i][j] + " ");
    }
    System.out.println();
}
```

**Output:**

```
1 2 3
4 5 6
```

---

### b) Using enhanced for loop

```java
for(int[] row : arr){       // each row is a 1D array
    for(int value : row){   // loop through each element of the row
        System.out.print(value + " ");
    }
    System.out.println();
}
```

**Output:**

```
1 2 3
4 5 6
```

---

## Summary

- A **multidimensional array** is an array of arrays.
- Most common is the **2D array** (rows and columns).
- We use it for matrix problems, grids, and tables.
- We can create it using **literal notation** or **object notation**.
- Accessing an element: `arr[i][j]`.
- Traversal can be done using **nested for loops** or **enhanced for loops**.
