package basics;

public class FlowControl {
    public static void main(String[] args) {
        // {} -> curly braces
        // [] -> square brackets
        // () -> parenthesis
        // "" -> double quotes
        // '' -> single quotes
        // &  -> ampersand
        // ;  -> semi-colon
        // :  -> colon
        // 1. if-else statement
        int age = 21;
        if (age > 50) {
            System.out.println("Age is greater than 50");
        } else if (age > 30 && age <= 50) {
            System.out.println("30 < Age <= 50");
        } else {
            System.out.println("Age <= 30");
        }

        // 2. switch statement
        int salary = 1_000_000;
        switch (salary) {
            case 1_000_000:
                System.out.println("Pretty good for everyone!");
                break; // otherwise falls through to the next case until break
            case 100_000:
                System.out.println("Senior Developer");
                break;
            case 80_000:
                System.out.println("Intermediate Developer");
                break;
            case 50_000:
                System.out.println("Junior Developer");
                break;
            default:
                System.out.println("Unemployed");
                break;
        }
    }
}
