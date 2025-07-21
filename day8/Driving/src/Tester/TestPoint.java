package Tester;

import java.util.Scanner;
import com.app.geometry.Point2D;

public class TestPoint {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter number of points to plot: ");
			int n = sc.nextInt();
			Point2D[] points = new Point2D[n];

			// Accepting point data
			for (int i = 0; i < n; i++) {
			    System.out.print("Enter x and y for point " + i + ": ");
			    int x = sc.nextInt();
			    int y = sc.nextInt();
			    points[i] = new Point2D(x, y);
			}

      
			while (true) {
			    System.out.println("\nMenu:");
			    System.out.println("1. Display details of a specific point");
			    System.out.println("2. Display x, y co-ordinates of all points");
			    System.out.println("3. Display distance between two points");
			    System.out.println("0. Exit");
			    System.out.print("Enter choice: ");
			    int choice = sc.nextInt();

			    switch (choice) {
			        case 1:
			            System.out.print("Enter point index: ");
			            int index = sc.nextInt();
			            if (index >= 0 && index < n) {
			                System.out.println("Point: " + points[index].getdetails());
			            } else {
			                System.out.println("Invalid index, please retry!");
			            }
			            break;

			        case 2:
			            System.out.println("All points:");
			            for (Point2D p : points) {
			                System.out.println(p.getdetails());
			            }
			            break;

			        case 3:
			            System.out.print("Enter index of start point: ");
			            int i = sc.nextInt();
			            System.out.print("Enter index of end point: ");
			            int j = sc.nextInt();
			            if (i >= 0 && i < n && j >= 0 && j < n) {
			                if (!points[i].isEqual(points[j])) {
			                    double dist = points[i].caldis(points[j]);
			                    System.out.printf("Distance: %.2f\n", dist);
			                } else {
			                    System.out.println("Both points are at the same location.");
			                }
			            } else {
			                System.out.println("Invalid indices, please retry!");
			            }
			            break;

			        case 0:
			        
			            System.out.println("Exiting...");
			            break;

			        default:
			            System.out.println("Invalid choice!");
			    }
			}
		}

       
    }
}
