import java.util.Scanner; // Import Scanner class for user input

public class EmployeeIOExample {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Input: String
        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        // Input: Integer
        System.out.print("Enter employee ID: ");
        int id = sc.nextInt();

        // Input: Double
        System.out.print("Enter employee salary: ");
        double salary = sc.nextDouble();

        // Output
        System.out.println("\n=== Employee Details ===");
        System.out.println("Name   : " + name);
        System.out.println("ID     : " + id);
        System.out.println("Salary : ₹" + salary);

        // Close Scanner
        sc.close();
    }
}
