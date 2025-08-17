package Basics;

public class Switch {

    // An enum to demonstrate switching on a non-primitive type.
    public enum Planet {
        MERCURY, VENUS, EARTH, MARS, JUPITER, SATURN
    }

    public static void main(String[] args) {

        System.out.println("--- 1. Traditional 'switch' with ':' and 'break' ---");
        int dayOfWeek = 3;
        String dayName;
        switch (dayOfWeek) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            default:
                dayName = "Some other day";
                break;
        }
        System.out.println("Result: " + dayName);
        System.out.println("--------------------------------------------------\n");

        System.out.println("--- 2. Traditional 'switch' with Grouped Cases (Fall-Through) ---");
        char grade = 'B';
        String comment;
        switch (grade) {
            case 'A':
                comment = "Excellent!";
                break;
            case 'B':
            case 'C':
                comment = "Well done!";
                break;
            case 'D':
                comment = "You passed.";
                break;
            default:
                comment = "Invalid grade.";
                break;
        }
        System.out.println("Result for grade '" + grade + "': " + comment);
        System.out.println("--------------------------------------------------\n");

        System.out.println("--- 3. Modern 'switch' Expression with '->' (Arrow Syntax) ---");
        int month = 8;
        String quarter = switch (month) {
            case 1, 2, 3 -> "Q1";
            case 4, 5, 6 -> "Q2";
            case 7, 8, 9 -> "Q3";
            case 10, 11, 12 -> "Q4";
            default -> "Invalid month";
        };
        System.out.println("Month " + month + " is in: " + quarter);
        System.out.println("--------------------------------------------------\n");

        System.out.println("--- 4. Modern 'switch' Expression with ':' and 'yield' ---");
        String fruit = "Orange";
        String fruitType = switch (fruit) {
            case "Apple", "Pear" -> "Common fruit";
            case "Orange", "Lemon" -> {
                System.out.println("  (A small check was performed for citrus fruits...)");
                yield "Citrus fruit";
            }
            default -> "Unknown fruit type";
        }; // ✅ Added missing semicolon here
        System.out.println("Result: An " + fruit + " is a " + fruitType);
        System.out.println("--------------------------------------------------\n");

        System.out.println("--- 5. Modern 'switch' as a Statement with '->' ---");
        Planet p = Planet.MARS;
        System.out.print("Checking planet " + p + ": ");
        switch (p) {
            case MERCURY -> System.out.println("Smallest planet.");
            case EARTH -> System.out.println("Our home.");
            case JUPITER -> System.out.println("Largest planet.");
            default -> System.out.println("It's one of the other planets.");
        }
        System.out.println("--------------------------------------------------\n");

        System.out.println("--- 6. How to Return a Value from a Method using 'switch' ---");
        System.out.println("Getting season for month 12: " + getSeason(12));
        System.out.println("Getting season for month 6: " + getSeason(6));
        System.out.println("--------------------------------------------------");
    }

    public static String getSeason(int month) {
        return switch (month) {
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Autumn";
            default -> "Invalid Month";
        };
    }

}
