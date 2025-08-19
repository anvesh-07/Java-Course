# JVM, JRE, and JDK

These notes explain **what JVM, JRE, and JDK are**, how they work together, and when to use each. Save or print this as a mini‑handbook.

---

## Quick definitions (at a glance)

- **JDK (Java Development Kit)** → Everything you need to **develop** Java applications: compiler, tools, and the runtime to run them.
- **JRE (Java Runtime Environment)** → Everything you need to **run** Java applications: the **JVM + core libraries + supporting files**.
- **JVM (Java Virtual Machine)** → The engine that **executes Java bytecode** at runtime. It loads classes, verifies bytecode, and runs your program with JIT/interpreter and garbage collection.

> Short version: **You write with JDK**, **you run on JVM**, and **JRE is the runtime bundle that contains the JVM**.

---

## The big picture

```text
Your .java source code
        │  (compile with JDK: javac)
        ▼
    .class bytecode  ──►  (run with 'java' launcher)
        │
        ▼
   JVM executes the bytecode
        │
        ▼
Operating System & Hardware
```

- **Platform independence** comes from bytecode + a JVM implementation for each OS. You compile once (to bytecode) and run anywhere that has a compatible JVM.
- **Platform dependence** applies to the JVM **implementation** itself (there is a build of the JVM for Windows, Linux, macOS, etc.).

---

## What is the JDK?

**JDK = Tools for developers + a runtime to run your code.**

Main parts you use:

- **`javac`** → the **compiler** that converts `.java` files to **bytecode** (`.class`).
- **`java`** → the **launcher** that starts a JVM to run your program.
- **`jar`** → package classes/resources into a JAR file.
- **`javadoc`** → generate documentation.
- **`jlink` / `jpackage`** → build custom runtimes/installers (modern Java).
- **`jshell`** → interactive REPL for quick experiments.

**When you install the JDK, you get the runtime as well (JRE + JVM).** For development, always install a JDK.

> Note: For modern Java releases, vendors typically **don’t ship a separate JRE installer**. The JDK already includes the runtime you need to run apps.

---

## What is the JRE?

**JRE = JVM + standard class libraries + supporting files** needed to **run** Java apps.

Responsibilities during run:

- Provides the **core libraries** your app relies on (e.g., collections, I/O, networking, concurrency, etc.).
- Contains the **JVM**, which:
  - **Loads** classes (Class Loader Subsystem)
  - **Verifies** bytecode safety (Bytecode Verifier)
  - **Executes** code (Interpreter + **JIT** compiler)
  - **Manages memory** (Heap/Stack/Metsaspace + **Garbage Collector**)

> Common confusion: People say “JRE validates the bytecode.” More precisely, the **bytecode verifier is inside the JVM**, and the JVM is part of the JRE bundle.

---

## What is the JVM?

**JVM is the runtime engine** that executes your **bytecode**.

Key components and tasks:

- **Class Loader Subsystem** → finds and **loads** classes into memory.
- **Bytecode Verifier** → ensures loaded classes are **safe** and follow JVM rules.
- **Execution Engine** → runs the code via **interpreter** and **JIT** (Just‑In‑Time) compilation for speed.
- **Memory Manager** → maintains **Heap** (objects), **Stacks** (per‑thread frames), and **Metaspace** (class metadata).
- **Garbage Collector** → automatically frees unused objects.
- **Native Interface (JNI)** → calls into native libraries when needed.

### Platform dependence vs independence

- **Bytecode** is platform‑independent.
- **JVM implementations** are platform‑specific (Windows/Linux/macOS builds). This is why Java achieves “**write once, run anywhere**.”

---

## How they work together (compile → run)

1. **Compile** with the JDK:

```bash
javac HelloWorld.java   # produces HelloWorld.class (bytecode)
```

2. **Run** with the launcher (part of the JDK/JRE):

```bash
java HelloWorld         # starts a JVM, loads HelloWorld.class, executes main
```

What happens at run time:

- The **JVM** starts.
- **Class loader** loads `HelloWorld` and any required classes.
- **Bytecode verifier** checks safety.
- **Execution engine** runs bytecode (interpreter + JIT).
- **GC** cleans unused objects in the heap.

---

## What to install (and when)

- **Learning or building apps** → Install a **JDK**.
- **Only running an existing app** → A **runtime** is needed. With modern distributions, installing the JDK is usually enough and simplest.

---

## Common misconceptions (fixed)

- “**JVM is platform‑independent**.” → ❌ The **bytecode** is. The **JVM** must be built for each OS.
- “**JRE validates bytecode**.” → ❌ The **bytecode verifier runs inside the JVM**, which is part of the JRE.
- “**I need a separate JRE**.” → ❌ Usually **not** with modern Java; the JDK ships with a runtime.
- “**JDK is only for compiling**.” → ❌ It also **runs** apps (it includes the launcher and the runtime).

---

## Minimal practical example (with end‑comments)

**HelloWorld.java**

```java
// A tiny program to show compile (JDK) vs run (JVM)
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, JVM/JRE/JDK!");
    }
}
```

**Commands**

```bash
# 1) Compile: uses the JDK compiler (javac) to turn source into bytecode
javac HelloWorld.java

# 2) Run: uses the 'java' launcher to start the JVM and execute bytecode
java HelloWorld
```

/\*
EXPLANATION (end‑comments):

1. The file defines class HelloWorld with a main method (entry point).
2. `javac` (part of the JDK) compiles HelloWorld.java → HelloWorld.class (bytecode).
3. `java` starts a JVM, which loads HelloWorld.class, verifies it, and executes main.
4. The JVM uses JIT/Interpreter to run the code and manages memory/GC automatically.
   \*/

---

## Quick comparison table

| Task                 | Use         | Tool/Component                          |
| -------------------- | ----------- | --------------------------------------- |
| Write & compile code | Development | **JDK** (`javac`, tools)                |
| Run an app           | Runtime     | **JRE** (contains **JVM** + libraries)  |
| Execute bytecode     | Engine      | **JVM**                                 |
| Package app          | Build       | `jar`, `jlink`, `jpackage` (in the JDK) |
| Explore/try code     | Learning    | `jshell` (in the JDK)                   |

---

## Final summary

- **JDK**: for **developers**. Includes compiler, tools, and the runtime needed to run apps.
- **JRE**: for **running** apps. It bundles the **JVM** and standard libraries.
- **JVM**: the **runtime engine** that loads, verifies, and executes your **bytecode**, with GC and JIT for performance.
- **Write once, run anywhere** is achieved by compiling to **bytecode** and running on a **JVM** implementation for each platform.
