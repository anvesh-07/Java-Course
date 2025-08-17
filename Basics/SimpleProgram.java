package Basics;

// This is the declaration of our class.
// The class name 'SimpleProgram' must match the filename 'SimpleProgram.java'.
public class SimpleProgram {

    // This is the main method, the entry point for any Java application.
    public static void main(String[] args) {

        // This line prints the string "Hello, Java World!" to the console.
        // 'println' stands for 'print line'.
        System.out.println("Hello, Java World!");

    }

}

/*
 * =============================================================================
 * ====
 * Explanation of the Code
 * =============================================================================
 * ====
 *
 * 1. `public class SimpleProgram`
 * - `public`: This is an access modifier, which means the class is visible and
 * can be
 * accessed by any other class.
 * - `class`: This keyword is used to declare a class in Java. A class is a
 * blueprint for creating objects. For now, think of it as a container for our
 * program.
 * - `SimpleProgram`: This is the name of our class. In Java, the name of the
 * public
 * class must match the name of the file it is saved in (e.g.,
 * SimpleProgram.java).
 *
 * 2. `public static void main(String[] args)`
 * - This is the main method. When you run a Java program, the Java Virtual
 * Machine (JVM)
 * looks for this specific method to start the execution. It is the entry point
 * of the program.
 * - `public`: Again, this means the method can be called from outside this
 * class.
 * - `static`: This keyword means the method belongs to the `SimpleProgram`
 * class itself,
 * not to an instance (object) of the class. This allows the JVM to run the
 * method
 * without creating an object first.
 * - `void`: This indicates that the main method does not return any value.
 * - `main`: The name of the method.
 * - `(String[] args)`: This is a parameter. It's an array of strings that
 * allows you to
 * pass arguments to your program from the command line. We are not using it in
 * this
 * simple example, but it's required for the main method signature.
 *
 * 3. `System.out.println("Hello, Java World!");`
 * - This line does the actual work of printing text to the console.
 * - `System`: A built-in Java class that contains fields and methods for
 * standard input,
 * output, and error streams.
 * - `out`: A static field within the `System` class. It is an instance of
 * `PrintStream`,
 * which is responsible for handling output.
 * - `println(...)`: A method of the `out` object. It prints the text you
 * provide inside
 * the parentheses to the console and then moves the cursor to the next line.
 * - `"Hello, Java World!"`: This is the string of text that we want to print.
 *
 * 4. `{` and `}`
 * - These curly braces are used to define a block of code. The opening brace
 * `{` marks
 * the beginning of a block, and the closing brace `}` marks the end. In this
 * program,
 * they define the scope of the class and the main method.
 */