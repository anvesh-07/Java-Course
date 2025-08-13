public class Conditionals {
  public static void main(String[] args) {

        System.out.println("--- 1. The 'if' Statement ---");
        // Use 'if' when you want to execute a block of code only when a condition is true.
        int userAge = 20;
        if (userAge >= 18) {
            System.out.println("Condition is true. User is 18 or older. Access granted.");
        }
        // This 'if' condition is false, so its code block will be skipped.
        if (userAge < 10) {
            System.out.println("This message will NOT be printed.");
        }
        System.out.println("----------------------------------\n");


        System.out.println("--- 2. The 'if-else' Statement ---");
        // Use 'if-else' for a clear "this or that" choice. One of the two blocks will always execute.
        int temperature = 15; // degrees Celsius
        if (temperature > 25) {
            // This block is skipped because the condition is false.
            System.out.println("It's hot outside. Wear shorts!");
        } else {
            // This block executes because the 'if' condition was false.
            System.out.println("It's cool outside. You should wear a jacket.");
        }
        System.out.println("----------------------------------\n");


        System.out.println("--- 3. The 'if-else if-else' Ladder ---");
        // Use this for checking a sequence of multiple conditions.
        // The first one that is true gets executed, and the rest are skipped.
        int score = 88;
        char grade;

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) { // This condition (88 >= 80) is true.
            grade = 'B';           // 'B' is assigned, and the ladder is exited.
        } else if (score >= 70) {
            grade = 'C';
        } else {
            grade = 'F';
        }
        System.out.println("A score of " + score + " earns a grade of: " + grade);
        System.out.println("----------------------------------\n");


        System.out.println("--- 4. Nested 'if' Statements ---");
        // Use nested 'if' to check for a secondary condition after a primary one is met.
        boolean hasLicense = true;
        int personAge = 22;

        if (personAge >= 18) {
            System.out.println("Primary check passed: Person is old enough.");
            if (hasLicense) {
                System.out.println("Nested check passed: Person has a license. Ready to drive!");
            } else {
                System.out.println("Nested check failed: Person does NOT have a license.");
            }
        } else {
            System.out.println("Primary check failed: Person is too young to drive.");
        }
        System.out.println("----------------------------------\n");

    }
}
