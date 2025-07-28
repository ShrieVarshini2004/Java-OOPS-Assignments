import java.util.Scanner;

public class DataOperationsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Integer and Arithmetic Operations
        System.out.print("Enter an integer: ");
        int a = scanner.nextInt();

        System.out.print("Enter another integer: ");
        int b = scanner.nextInt();

        int sum = a + b;
        int diff = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        // Floating point numbers
        System.out.print("Enter a float: ");
        float f = scanner.nextFloat();

        System.out.print("Enter a double: ");
        double d = scanner.nextDouble();

        double floatSum = f + d;
        System.out.println("Sum of float and double: " + floatSum);

        // Char input and ASCII
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        int ascii = (int) ch;
        System.out.println("ASCII value of '" + ch + "' is: " + ascii);

        // Boolean operations
        System.out.print("Enter true or false: ");
        boolean flag = scanner.nextBoolean();
        System.out.println("Negation of input: " + !flag);

        // Bitwise operations
        byte byte1 = 0b00001100; // 12 in binary
        byte byte2 = 0b00000101; // 5 in binary
        System.out.println("Bitwise AND: " + (byte1 & byte2));
        System.out.println("Bitwise OR: " + (byte1 | byte2));
        System.out.println("Bitwise XOR: " + (byte1 ^ byte2));

        // Relational & Logical
        System.out.println("Is a > b? " + (a > b));
        System.out.println("Is a == b AND flag true? " + ((a == b) && flag));
        System.out.println("Is a < b OR flag false? " + ((a < b) || !flag));

        // Type Casting
        double casted = (double) a;
        System.out.println("Integer casted to double: " + casted);

        // Short and Long
        short s = 30000;
        long l = 9000000000L;
        System.out.println("Short: " + s);
        System.out.println("Long: " + l);

        // Ternary Operation
        String result = (a > b) ? "a is greater" : "b is greater or equal";
        System.out.println("Ternary result: " + result);

        // String input & operations
        scanner.nextLine(); // Clear buffer
        System.out.print("Enter your full name: ");
        String name = scanner.nextLine();
        System.out.println("Name in uppercase: " + name.toUpperCase());
        System.out.println("Length of your name: " + name.length());

        scanner.close();
    }
}
