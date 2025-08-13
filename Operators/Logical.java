package Operators;

public class Logical {
  public static void main(String[] args) {
        boolean p = true, q = false;

        System.out.println("p && q: " + (p && q)); // false
        System.out.println("p || q: " + (p || q)); // true
        System.out.println("!p: " + (!p));         // false
        System.out.println("!q: " + (!q));         // true

        // Combining multiple conditions
        int age = 25;
        boolean hasTicket = true;

        if (age >= 18 && hasTicket) {
            System.out.println("You can enter the cinema.");
        }

        if (age < 18 || hasTicket) {
            System.out.println("Either you are under 18 OR you have a ticket (or both).");
        }
    }
}
