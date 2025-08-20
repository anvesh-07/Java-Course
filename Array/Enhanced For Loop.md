# 📘 Enhanced For Loop

## 1) Why do we need the Enhanced For Loop?

- Before Java 5, we only had **normal for loop**, **while loop**, and **do-while loop**.
- These loops require:

  - An **index** (like `i = 0`)
  - A **condition** (like `i < arr.length`)
  - An **increment/decrement** (like `i++`)

- For arrays and collections, this makes traversal more **complicated** and **error-prone**.
  Example of traditional `for` loop:

  ```java
  int nums[] = {10, 20, 30, 40};
  for (int i = 0; i < nums.length; i++) {
      System.out.println(nums[i]);
  }
  ```

  Here we must use `i` as an index.

✅ To simplify this, **Java 5 introduced Enhanced For Loop** (also known as **for-each loop**).

---

## 2) What is Enhanced For Loop?

- It is a **simpler and cleaner** way to traverse elements in:

  - **Arrays**
  - **Collections** (like `ArrayList`, `HashSet`, etc.)

- No need for:

  - Index
  - Condition
  - Increment
    → It automatically goes through all elements **one by one**.

---

## 3) Syntax of Enhanced For Loop

```java
for (dataType variable : arrayOrCollection) {
    // use variable directly
}
```

- `dataType` → Type of element stored in array/collection
- `variable` → Temporary variable that holds each element during iteration
- `arrayOrCollection` → The data structure we want to traverse

---

## 4) Example with Array

```java
class EnhancedForArray {
    public static void main(String[] args) {
        int nums[] = {10, 20, 30, 40};

        // Using enhanced for loop
        for (int n : nums) {
            System.out.println(n);
        }
    }
}
```

### 🔎 Explanation:

- `int n : nums` → Means: take each element of `nums` and put it inside `n`.
- No index required → it directly gives **values** one by one:

  - First iteration: `n = 10`
  - Second iteration: `n = 20`
  - Third iteration: `n = 30`
  - Fourth iteration: `n = 40`

---

## 5) Example with Collection (just for curiosity)

```java
import java.util.ArrayList;

class EnhancedForCollection {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);

        // Enhanced for loop with collection
        for (Integer num : al) {
            System.out.println(num);
        }
    }
}
```

### 🔎 Explanation:

- `Integer num : al` → Each element in `al` is taken one by one and stored in `num`.
- Prints:

  ```
  10
  20
  30
  ```

---

## 6) Important Notes

1. Enhanced for loop **cannot be used if you need the index** (use normal `for` loop then).
2. Works best when you just want to **read elements**.
3. Works with **arrays and all collections**.
4. You cannot **remove** elements while iterating using enhanced for loop (for that, use an `Iterator` in collections).

---

✅ **Summary**

- Enhanced for loop = cleaner, faster way to loop.
- No need to write index, condition, increment.
- Best for reading/traversing elements in arrays and collections.
