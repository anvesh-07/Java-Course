# Arrays of Objects

## 1) What is an Array of Objects?

- It’s an array whose **elements are references to objects**, not the objects themselves.
- When you write `Student[] sts = new Student[5];` you create **one array object** that can hold **5 references** to `Student`. At this moment, **each element is `null`** (no Student object yet).

```
Heap:   [ null | null | null | null | null ]   ← one array object (type: Student[])
Index:    0      1      2      3      4
```

To actually store students, you must **create objects** and assign them to slots:

```
sts[0] = new Student();
sts[1] = new Student();
...
```

---

## 2) Default Values (very important)

When you create arrays with `new`:

- **Primitive arrays** (e.g., `int[]`, `double[]`): slots get a **default value** (0, 0.0, `false`, etc.).
- **Reference-type arrays** (e.g., `Student[]`, `String[]`): slots get **`null`** until you put objects there.

**Examples**

```java
int[] a = new int[3];     // [0, 0, 0]
boolean[] b = new boolean[2]; // [false, false]
String[] s = new String[2];   // [null, null]
Student[] sts = new Student[2]; // [null, null]
```

> `new` initializes the array structure, **not** the objects inside a reference-type array.

---

## 3) Why the `length` Property Matters

- `length` tells you how many slots the array has, so you can **loop safely** and **avoid going out of range**.
- Use it for traversing, validations, and to avoid magic numbers.

```java
int[] nums = new int[5];
for (int i = 0; i < nums.length; i++) { // safe bound
    // ...
}
```

---

## 4) Array Index and Exceptions

- Valid indexes are `0` to `length - 1`.
- Accessing outside that range throws **`ArrayIndexOutOfBoundsException`**.

```java
int[] x = new int[3]; // indexes: 0,1,2
x[3] = 10;            // ❌ throws ArrayIndexOutOfBoundsException
```

Separate but common pitfall with arrays of objects:

- Calling a method on a **`null` slot** throws **`NullPointerException`**.

```java
Student[] sts = new Student[1]; // [null]
sts[0].print();                 // ❌ NullPointerException (no object at index 0)
```

---

## 5) Creating Arrays of Objects — The Right Ways

### A) Size first, fill later (most common in beginners’ tasks)

```java
class Student {
    String name;
    int marks;

    Student() {}
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void print() {
        System.out.println(name + " → " + marks);
    }
}

class StudentArrayBasicsDemo {
    public static void main(String[] args) {
        // 1) Create the array (reference slots are null initially)
        Student[] sts = new Student[3]; // [null, null, null]

        // 2) Create objects and assign
        sts[0] = new Student("Anvesh", 86);
        sts[1] = new Student("Reddy", 91);
        sts[2] = new Student("Kiran", 78);

        // 3) Traverse using length (simple for loop)
        for (int i = 0; i < sts.length; i++) {
            sts[i].print();
        }

        // 4) Enhanced for loop (cleaner)
        for (Student s : sts) {
            s.print();
        }
    }
}
/*
Logic notes:
- Student[] creates an array that holds Student REFERENCES (null by default).
- We must "new" each Student before using it, otherwise NPE.
- Use length for safe looping (0..length-1).
*/
```

### B) Inline initialization with objects (literal-style)

```java
class StudentInlineInitDemo {
    public static void main(String[] args) {
        Student[] team = {
            new Student("Asha", 88),
            new Student("Manu", 92),
            new Student("Rekha", 85)
        };

        for (Student s : team) {
            s.print();
        }
    }
}
/*
Logic notes:
- Create and assign objects in one step.
- Useful when you already know all values at compile time.
*/
```

### C) Partially filled arrays (common pattern)

Sometimes the array capacity is larger than current count. Track a separate `size`.

```java
class StudentPartialFillDemo {
    public static void main(String[] args) {
        Student[] bucket = new Student[5]; // capacity 5
        int size = 0;                       // how many actually used

        bucket[size++] = new Student("Dev", 77);
        bucket[size++] = new Student("Ira", 81);
        // 3 empty slots remain as null

        // Traverse only the filled part
        for (int i = 0; i < size; i++) {
            bucket[i].print();
        }

        // Avoid enhanced for if there are nulls, or check for null
        for (Student s : bucket) {
            if (s != null) s.print();
        }
    }
}
/*
Logic notes:
- Capacity vs size: array may be larger than used elements.
- Keep a separate counter to avoid processing null slots.
*/
```

---

## 6) Traversing Arrays of Objects

### Simple for loop (index-based)

- Good when you need the index or when the array may contain `null`.

```java
for (int i = 0; i < sts.length; i++) {
    if (sts[i] != null) {
        sts[i].print();
    }
}
```

### Enhanced for loop (for-each)

- Clean and simple when you know elements are non-null.

```java
for (Student s : sts) {
    if (s != null) {
        s.print();
    }
}
```

---

## 7) Jagged Arrays of Objects (array of arrays with different row sizes)

```java
class JaggedStudentsDemo {
    public static void main(String[] args) {
        Student[][] classes = new Student[3][]; // 3 rows (3 classes)

        classes[0] = new Student[2]; // Class 0 has 2 students
        classes[1] = new Student[1]; // Class 1 has 1 student
        classes[2] = new Student[3]; // Class 2 has 3 students

        classes[0][0] = new Student("Arya", 90);
        classes[0][1] = new Student("Bala", 84);
        classes[1][0] = new Student("Chirag", 88);
        classes[2][0] = new Student("Diya", 93);
        classes[2][1] = new Student("Eshan", 79);
        classes[2][2] = new Student("Farah", 87);

        // Traverse (enhanced for)
        for (Student[] row : classes) {
            for (Student s : row) {
                if (s != null) s.print();
            }
            System.out.println("---");
        }
    }
}
/*
Logic notes:
- Jagged = each row can have a different length.
- Still arrays of references, so initialize each slot with new Student(...).
*/
```

---

## 8) Common Mistakes and How to Avoid Them

1. **Forgetting to create objects**

```java
Student[] sts = new Student[2]; // [null, null]
sts[0].print(); // ❌ NPE — create object first: sts[0] = new Student(...)
```

2. **Going out of bounds**

```java
Student[] sts = new Student[2];
sts[2] = new Student(); // ❌ index 2 doesn’t exist (valid: 0,1)
```

3. **Assuming primitives’ behavior applies**

```java
int[] a = new int[2];     // [0, 0]
Student[] s = new Student[2]; // [null, null] — not objects yet
```

4. **For-each over partially filled arrays without null check**

```java
for (Student s : bucket) {
    // if bucket has nulls, check before using
    if (s != null) s.print();
}
```

---

## 9) Recap

- An **array of objects** stores **references**. Slots start as **`null`**.
- `new Type[n]` creates the array _structure_; you must still `new` each element.
- Use **`length`** to loop safely and avoid **ArrayIndexOutOfBoundsException**.
- Watch for **NullPointerException** when elements are not initialized.
- Traverse with index-based loops or enhanced for loops (with null checks when needed).
- Works with jagged arrays too (rows of different sizes).

---
