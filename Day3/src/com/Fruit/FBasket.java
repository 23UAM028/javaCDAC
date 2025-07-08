package com.Fruit;

import java.util.Scanner;

public class FBasket {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter basket size: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        Fruit[] basket = new Fruit[n];
        int counter = 0;

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("0. Exit");
            System.out.println("1. Add Apple");
            System.out.println("2. Add Orange");
            System.out.println("3. Add Mango");
            System.out.println("4. Display names of all fruits");
            System.out.println("5. Display details of all fresh fruits");
            System.out.println("6. Mark fruit as stale");
            System.out.println("7. Display taste of all stale fruits");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); 
            switch (choice) {
                case 0:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                case 1: 
                    if (counter >= n) {
                        System.out.println("Basket is full!");
                        break;
                    }
                    System.out.print("Enter name: ");
                    String aname = sc.nextLine();
                    System.out.print("Enter weight: ");
                    double aweight = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter color: ");
                    String acolor = sc.nextLine();
                    basket[counter++] = new Apple(aname, aweight, acolor, true);
                    break;

                case 2: 
                    if (counter >= n) {
                        System.out.println("Basket is full!");
                        break;
                    }
                    System.out.print("Enter name: ");
                    String oname = sc.nextLine();
                    System.out.print("Enter weight: ");
                    double oweight = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter color: ");
                    String ocolor = sc.nextLine();
                    basket[counter++] = new Orange(oname, oweight, ocolor, true);
                    break;

                case 3: 
                    if (counter >= n) {
                        System.out.println("Basket is full!");
                        break;
                    }
                    System.out.print("Enter name: ");
                    String mname = sc.nextLine();
                    System.out.print("Enter weight: ");
                    double mweight = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter color: ");
                    String mcolor = sc.nextLine();
                    basket[counter++] = new Mango(mname, mweight, mcolor, true);
                    break;

                case 4: 
                    System.out.println("Fruits in the basket:");
                    for (Fruit f : basket) {
                        if (f != null) {
                            System.out.println(f.getname());
                        }
                    }
                    break;

                case 5:
                    System.out.println("Details of fresh fruits:");
                    for (Fruit f : basket) {
                        if (f != null && f.isFresh()) {
                            System.out.println(f.toString() + ", Taste: " + f.tast());
                        }
                    }
                    break;

                case 6: 
                    System.out.print("Enter index to mark stale (0 to " + (counter - 1) + "): ");
                    int idx = sc.nextInt();
                    sc.nextLine();
                    if (idx < 0 || idx >= counter || basket[idx] == null) {
                        System.out.println("Invalid index!");
                    } else {
                        basket[idx].setFresh(false);
                        System.out.println("Fruit at index " + idx + " marked as stale.");
                    }
                    break;

                case 7: 
                    System.out.println("Tastes of all stale fruits:");
                    for (Fruit f : basket) {
                        if (f != null && !f.isFresh()) {
                            System.out.println(f.getname() + ": " + f.tast());
                        }
                    }
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
