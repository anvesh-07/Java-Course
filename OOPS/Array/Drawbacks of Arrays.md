## 1. Arrays are created in Heap Memory

- In Java, whenever we use `new` keyword to create an array, it is stored in the **heap memory**.
- Heap memory is managed by the JVM and it requires **contiguous (continuous) memory allocation** for arrays.
- If sufficient continuous memory is not available, array creation can fail, even if total free memory is enough.

Example:

```java
int nums[] = new int[1000000]; // needs a large continuous memory block
```

---

## 2. Fixed Size (Cannot be Resized)

- Once we create an array, its **size is fixed**.
- We cannot add or remove elements dynamically.
- If you need more space, you must create a new bigger array and copy the old data.

Example:

```java
int nums[] = new int[5];
// if we want to add 6th element, not possible without creating a new array
```

⚠️ Problem: Not flexible for real-world cases where data keeps growing or shrinking.

---

## 3. Performance Issue (Insertion and Searching)

- **Insertion**:

  - If we want to insert at the beginning or middle, we need to shift many elements.
  - This makes insertion **slow** for large arrays.

- **Searching**:

  - Linear search (`O(n)`) is needed if the array is unsorted.
  - Even in sorted arrays, binary search is possible but still less efficient compared to modern data structures.

Example:

```java
int nums[] = {10, 20, 30, 40, 50};
// Insert 15 at position 1 → shift all elements → costly for large arrays
```

---

## 4. Only Homogeneous Data Allowed

- Arrays can only store **same type (homogeneous) data**.
- Example: If you create an `int[]`, you cannot store `String` or `float` in it.

Example:

```java
int nums[] = {1, 2, 3, 4};
// nums[2] = "Hello"; ❌ Not allowed
```

---

## 5. Collections Solve These Problems

Because of these drawbacks, Java introduced **Collections Framework** (like `ArrayList`, `HashSet`, `LinkedList`, etc.).

👉 Collections allow:

- Dynamic resizing (no fixed size)
- Better performance in insertion/searching
- Ability to store heterogeneous data (in some cases using generics or Object references)
- Rich built-in methods to work with data

Example (ArrayList instead of Array):

```java
import java.util.*;

public class Example {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30); // dynamic resize allowed
        System.out.println(list);
    }
}
```

---

## 📌 Summary

- Arrays are simple but **not flexible**.
- Problems:

  1. Created in heap, need contiguous memory.
  2. Fixed size, cannot grow/shrink dynamically.
  3. Insertion and searching is slow for large data.
  4. Only homogeneous data allowed.

- ✅ Solution: Use **Collections Framework** for dynamic and efficient data storage.
