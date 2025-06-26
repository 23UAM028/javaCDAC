import java.util.Scanner;

public class Doublenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first double value: ");
        if (!sc.hasNextDouble()) {
            System.out.println(" First input is not a valid double.");
            return;
        }
        double first = sc.nextDouble();

        System.out.print("Enter second double value: ");
        if (!sc.hasNextDouble()) {
            System.out.println(" Second input is not a valid double.");
            return;
        }
        double second = sc.nextDouble();

        double average = (first + second) / 2.0;
        System.out.println("Average: " + average);
    }
}
