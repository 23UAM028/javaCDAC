import java.util.Scanner;

public class EmployeeManagementSystem {
    private static final int MAX_EMPLOYEES = 10;
    private static Employee[] employees = new Employee[MAX_EMPLOYEES];
    private static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Employee Management Menu ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Display Employees joined in given Year");
            System.out.println("5. Find Employee with Maximum Salary");
            System.out.println("6. Find Employee with Minimum Salary");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> addEmployee(sc);
                case 2 -> displayAll();
                case 3 -> searchById(sc);
                case 4 -> displayByJoiningYear(sc);
                case 5 -> findMaxSalary();
                case 6 -> findMinSalary();
                case 7 -> System.out.println("Exiting program...");
                default -> System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 7);

        sc.close();
    }

    private static void addEmployee(Scanner sc) {
        if (count >= MAX_EMPLOYEES) {
            System.out.println("Cannot add more employees.");
            return;
        }

        sc.nextLine(); // consume newline

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Date of Birth (day month year):");
        MyDate dob = new MyDate(sc.nextInt(), sc.nextInt(), sc.nextInt());

        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        sc.nextLine(); // consume newline
        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        System.out.println("Enter Date of Joining (day month year):");
        MyDate doj = new MyDate(sc.nextInt(), sc.nextInt(), sc.nextInt());

        employees[count++] = new Employee(name, dob, id, dept, salary, doj);
        System.out.println("Employee added successfully.");
    }

    private static void displayAll() {
        if (count == 0) {
            System.out.println("No employees to display.");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }

    private static void searchById(Scanner sc) {
        System.out.print("Enter Employee ID to search: ");
        int id = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (employees[i].getId() == id) {
                System.out.println("Employee Found: " + employees[i]);
                found = true;
                break;
            }
        }

        if (!found) System.out.println("Employee not found.");
    }

    private static void displayByJoiningYear(Scanner sc) {
        System.out.print("Enter Joining Year to search: ");
        int year = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (employees[i].getDateOfJoining().getYear() == year) {
                System.out.println(employees[i]);
                found = true;
            }
        }

        if (!found) System.out.println("No employees joined in year " + year);
    }

    private static void findMaxSalary() {
        if (count == 0) {
            System.out.println("No employees available.");
            return;
        }

        Employee max = employees[0];
        for (int i = 1; i < count; i++) {
            if (employees[i].getSalary() > max.getSalary()) {
                max = employees[i];
            }
        }

        System.out.println("Employee with Max Salary: " + max);
    }

    private static void findMinSalary() {
        if (count == 0) {
            System.out.println("No employees available.");
            return;
        }

        Employee min = employees[0];
        for (int i = 1; i < count; i++) {
            if (employees[i].getSalary() < min.getSalary()) {
                min = employees[i];
            }
        }

        System.out.println("Employee with Min Salary: " + min);
    }
}
