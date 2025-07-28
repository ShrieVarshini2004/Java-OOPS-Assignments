import java.util.Scanner;

public class ControlStatementsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. IF, IF-ELSE, IF-ELSE-IF
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("Positive number");
        } else if (num < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Zero");
        }

        // 2. SWITCH Statement
        System.out.print("\nEnter a day number (1-3): ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Other Day");
        }

        // 3. FOR Loop
        System.out.println("\nFOR Loop: Counting 1 to 5");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }

        // 4. WHILE Loop
        System.out.println("\n\nWHILE Loop: Counting down from 5");
        int count = 5;
        while (count > 0) {
            System.out.print(count + " ");
            count--;
        }

        // 5. DO-WHILE Loop
        System.out.println("\n\nDO-WHILE Loop: At least once");
        int x = 0;
        do {
            System.out.println("This will print at least once.");
            x--;
        } while (x > 0);

        // 6. BREAK and CONTINUE
        System.out.println("\nUsing BREAK and CONTINUE in a loop:");
        for (int i = 1; i <= 10; i++) {
            if (i == 3) {
                System.out.println("Skipping 3");
                continue;
            }
            if (i == 7) {
                System.out.println("Breaking at 7");
                break;
            }
            System.out.print(i + " ");
        }

        // 7. RETURN Statement
        System.out.println("\n\nCalling methodWithReturn...");
        methodWithReturn();

        sc.close();
    }

    static void methodWithReturn() {
        System.out.println("Inside method, returning early...");
        return;
        // System.out.println("This will never be printed"); ❌ unreachable
    }
}
