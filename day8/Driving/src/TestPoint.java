package Tester;
import com.app.geometry.*;
import java.util.Scanner;

public class TestPoint {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

        System.out.print("Enter x & y for point 1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("Enter x & y for point 2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        Point2d p1 = new Point2d(x1, y1);
        Point2d p2 = new Point2d(x2, y2);

        System.out.println("Point 1 details: " + p1.getdetails());
        System.out.println("Point 2 details: " + p2.getdetails());

        if (p1.isEqual(p2)) {
            System.out.println("Points are at the same location.");
        } else {
            System.out.println("Points are at different locations.");
            double distance = p1.caldis(p2);
            System.out.printf("Distance between points: %.2f\n", distance);
        }

        sc.close();
    }
}
		

