import java.util.Scanner;

public class Employe extends Person {
    private int id;
    private String department;
    private double salary;
    private MyDat dateOfJoining;

    // Constructor
    public Employe(String name, MyDat dob, int id, String department, double salary, MyDat doj) {
        super(name, dob);
        this.id = id;
        this.department = department;
        this.salary = salary;
        this.dateOfJoining = doj;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public MyDat getDateOfJoining() {
        return dateOfJoining;
    }

    // toString override
    @Override
    public String toString() {
        return  
               ", ID: " + id +
               ", Department: " + department +
               ", Salary: " + salary +
               ", Date of Joining: " + dateOfJoining;
    }

    // Static method to create employee using input
    public static Employe create(Scanner sc) {
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Date of Birth:");
        MyDat dob = new MyDat();	
        
        dob.acceptData();

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        sc.nextLine(); // consume leftover newline

        System.out.println("Enter Date of Joining:");
        MyDat doj = new MyDat();
        doj.acceptData();

        return new Employe(name, dob, id, dept, salary, doj);
    }
}
