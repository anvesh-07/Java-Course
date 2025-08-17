# 📘 Number Problems in Java

This guide explains **basic number problems** in Java with step-by-step logic.
We only use **loops, `%` (modulus), and `/` (division)** — no strings, no arrays, no advanced concepts.
Perfect for **beginners**.

---

## 🔹 Basics You Must Know

### 1. Modulus `%`

- `%` gives the **remainder** after division.
  Example:

```
123 % 10 = 3   (last digit)
125 % 2 = 1    (odd number → remainder 1)
```

### 2. Division `/`

- `/` removes the **last digit** if used with 10.
  Example:

```
123 / 10 = 12   (last digit removed)
12 / 10 = 1
1 / 10 = 0
```

### 3. How to Get Each Digit

- Repeat:

  - `digit = num % 10` → take last digit
  - `num = num / 10` → remove last digit

- Continue until `num` becomes `0`.

---

## 📝 Problems with Logic & Approach

### 1. Length of Number

**Example**: 100 → length = 3
**Logic**: Count how many times we divide by 10 until the number becomes 0.

---

### 2. Reverse the Number

**Example**: 2025 → 5201
**Logic**:

- Take last digit → `num % 10`
- Build reverse → `rev = rev * 10 + digit`
- Remove digit → `num = num / 10`

---

### 3. Even Count

**Example**: 200219198 → evens count = 5
**Logic**:

- Extract each digit.
- If `digit % 2 == 0` → increment even counter.

---

### 4. Odd Count

**Logic**: Similar to even count.

- If `digit % 2 != 0` → increment odd counter.

---

### 5. Prime Check

**Prime Number**: A number greater than 1 divisible only by 1 and itself.
**Logic**:

- Loop from `2` to `n-1`.
- If any divisor exists → not prime.
- Else → prime.

---

### 6. Print Even Digits

**Example**: 998866554455 → even digits = 886644

- Extract digits.
- Print if even.
- For unique evens: store and skip duplicates.

---

### 7. Print Odd Digits

Similar to even.

---

### 8. Sum of Digits

**Example**: 2002 → 2+0+0+2 = 4
**Logic**: Add each digit while extracting.

---

### 9. Product of Digits

Multiply digits instead of adding.

---

### 10. Factorial of Each Digit

**Factorial**: `n! = n × (n-1) × (n-2) … × 1`
**Example**: number = 123 → `1! + 2! + 3!`
**Logic**: For each digit, calculate factorial and add.

---

### 11. Square of Digits

**Example**: 1234 → 1²+2²+3²+4²
Extract digit → square it → add.

---

### 12. Add Digits to Single Digit

**Example**: 1998
Step1: 1+9+9+8 = 27
Step2: 2+7 = 9
Repeat until single digit.

---

### 13. Arrange Even–Odd

**Example**: 19982002

- Put evens first → 82200199
- For unique → 82019

---

### 14. Arrange Odd–Even

Same as above, just odd first.

---

### 15. Greatest Digit

Extract all digits → keep track of max.

---

### 16. Least Digit

Same as above → keep track of min.

---

### 17. Specific Digit Count

**Example**: 5432887, digit = 5 → count = 1
Logic: Extract digits and compare with given digit.

---

### 18. Armstrong Number

**Definition**: Sum of each digit raised to the power of number of digits = original number.
Example: 153 = 1³ + 5³ + 3³.
If true → Armstrong.

---

### 19. Palindrome Number

If reverse of number = same number → palindrome.
Example: 121 → palindrome.

---

### 20. Fibonacci Series

**Series**: 0, 1, 1, 2, 3, 5, 8…
Logic:

- Start with 0, 1.
- Next = sum of previous two.

---

### 21. Strong Number

**Definition**: Sum of factorial of digits = number.
Example: 145 = 1! + 4! + 5! = 145.

---

### 22. Perfect Number

**Definition**: Sum of divisors (excluding itself) = number.
Example: 6 → divisors: 1, 2, 3 → sum = 6 → perfect.

---

### 23. Sum of Even and Odd Digits Separately

Extract digits → if even add to evenSum, else add to oddSum.

---

### 24. GCD (Greatest Common Divisor)

Loop from 1 to min(a,b), largest divisor common to both is GCD.
**LCM**: `(a*b) / GCD`.

---

### 25. Get Specific Digit by Position

**Example**: 54321, position = 3 → digit = 3
Logic: Use `%` and `/` repeatedly until required position.

---
