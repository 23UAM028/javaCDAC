import java.util.Scanner;

public class ManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of Employees: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Employe[] emp = new Employe[n];
        int count = 0;

        while (true) {
            System.out.println("\n===== Employee Management Menu =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Display Employees Joined in Given Year");
            System.out.println("5. Find Employee with Maximum Salary");
            System.out.println("6. Find Employee with Minimum Salary");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // flush newline

            switch (choice) {
                case 1:
                    if (count < n) {
                        emp[count] = Employe.create(sc);
                        count++;
                    } else {
                        System.out.println("Employee limit reached.");
                    }
                    break;

                case 2:
                    for (int i = 0; i < count; i++) {
                        System.out.println(emp[i]);
                    }
                    break;

                case 3:
                    System.out.print("Enter ID to search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (emp[i].getId() == searchId) {
                            System.out.println(emp[i]);
                            found = true;
                            break;
                        }
                    }
                    if (!found) System.out.println("Employee not found.");
                    break;

                case 4:
                    System.out.print("Enter Year: ");
                    int year = sc.nextInt();
                    for (int i = 0; i < count; i++) {
                        if (emp[i].getDateOfJoining().getYear() == year) {
                            System.out.println(emp[i]);
                        }
                    }
                    break;

                case 5:
                    if (count == 0) {
                        System.out.println("No employees available.");
                        break;
                    }
                    Employe maxSalEmp = emp[0];
                    for (int i = 1; i < count; i++) {
                        if (emp[i].getSalary() > maxSalEmp.getSalary()) {
                            maxSalEmp = emp[i];
                        }
                    }
                    System.out.println("Employee with Maximum Salary:");
                    System.out.println(maxSalEmp);
                    break;

                case 6:
                    if (count == 0) {
                        System.out.println("No employees available.");
                        break;
                    }
                    Employe minSalEmp = emp[0];
                    for (int i = 1; i < count; i++) {
                        if (emp[i].getSalary() < minSalEmp.getSalary()) {
                            minSalEmp = emp[i];
                        }
                    }
                    System.out.println("Employee with Minimum Salary:");
                    System.out.println(minSalEmp);
                    break;

                case 7:
                    System.out.println("Exiting Application...");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}
