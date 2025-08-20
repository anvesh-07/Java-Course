## 1. `array.length` ⭐

- **What:** A field that gives the size of the array.
- **Why:** Used in loops to avoid going out of bounds.

```java
class Demo {
  public static void main(String[] args) {
    int[] nums = {10, 20, 30, 40, 50};
    System.out.println("Array length: " + nums.length);

    // Using length in loop
    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i] + " ");
    }
  }
}
```

✅ Output:

```
Array length: 5
10 20 30 40 50
```

---

## 2. `clone()` ⭐

- **What:** Creates a copy of the array.
- **Why:** Useful when you want a new array without affecting the original.

```java
class Demo {
  public static void main(String[] args) {
    int[] a = {1, 2, 3};
    int[] b = a.clone(); // copy

    b[0] = 99; // modify copy

    System.out.println("Original: " + java.util.Arrays.toString(a));
    System.out.println("Clone: " + java.util.Arrays.toString(b));
  }
}
```

✅ Output:

```
Original: [1, 2, 3]
Clone: [99, 2, 3]
```

---

## 3. `Arrays.toString(array)` ⭐

- **What:** Returns array contents as a readable string.
- **Why:** For printing/debugging arrays.

```java
import java.util.Arrays;

class Demo {
  public static void main(String[] args) {
    int[] nums = {10, 20, 30};
    System.out.println("Array: " + Arrays.toString(nums));
  }
}
```

✅ Output:

```
Array: [10, 20, 30]
```

---

## 4. `Arrays.equals(a, b)` ⭐

- **What:** Compares two arrays element by element.
- **Why:** Use this instead of `a.equals(b)` (which only compares references).

```java
import java.util.Arrays;

class Demo {
  public static void main(String[] args) {
    int[] a = {1, 2, 3};
    int[] b = {1, 2, 3};
    int[] c = {4, 5, 6};

    System.out.println(Arrays.equals(a, b)); // true
    System.out.println(Arrays.equals(a, c)); // false
  }
}
```

✅ Output:

```
true
false
```

---

## 5. `Arrays.sort(array)` ⭐

- **What:** Sorts the array in ascending order.
- **Why:** Very commonly used for ordering data.

```java
import java.util.Arrays;

class Demo {
  public static void main(String[] args) {
    int[] nums = {50, 10, 30, 20, 40};

    System.out.println("Before sort: " + Arrays.toString(nums));

    Arrays.sort(nums); // sort in ascending order

    System.out.println("After sort: " + Arrays.toString(nums));
  }
}
```

✅ Output:

```
Before sort: [50, 10, 30, 20, 40]
After sort: [10, 20, 30, 40, 50]
```

---

## 6. `Arrays.binarySearch(array, key)` ⭐

- **What:** Searches for a value in a **sorted array**.
- **Why:** Fast search (O(log n)) when array is sorted.

```java
import java.util.Arrays;

class Demo {
  public static void main(String[] args) {
    int[] nums = {10, 20, 30, 40, 50};
    Arrays.sort(nums); // must be sorted first

    int index1 = Arrays.binarySearch(nums, 30); // found
    int index2 = Arrays.binarySearch(nums, 25); // not found

    System.out.println("Index of 30: " + index1);
    System.out.println("Index of 25: " + index2); // negative → not found
  }
}
```

✅ Output:

```
Index of 30: 2
Index of 25: -3
```

---

## 7. `Arrays.fill(array, value)` ⭐

- **What:** Fills the entire array with one value.
- **Why:** Initialize or reset an array quickly.

```java
import java.util.Arrays;

class Demo {
  public static void main(String[] args) {
    int[] nums = new int[5];

    Arrays.fill(nums, 9); // set all elements to 9

    System.out.println(Arrays.toString(nums));
  }
}
```

✅ Output:

```
[9, 9, 9, 9, 9]
```

---

# Summary

### Most important and commonly used array methods/fields:

- `array.length` ⭐ → size of the array
- `clone()` ⭐ → make a copy
- `Arrays.toString(array)` ⭐ → print contents
- `Arrays.equals(a, b)` ⭐ → compare arrays by elements
- `Arrays.sort(array)` ⭐ → sort array
- `Arrays.binarySearch(array, key)` ⭐ → search in sorted array
- `Arrays.fill(array, value)` ⭐ → fill with a single value
