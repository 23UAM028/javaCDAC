package com.Fruit;

import java.util.Scanner;

public class FBasket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basket size: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Fruit[] basket = new Fruit[n];
        int counter = 0;

        while (true) {
            System.out.println("\nOptions:\n0. Exit\n1. Add Mango\n2. Add Orange\n3. Add Apple\n4. Display names of all fruits\n5. Display all fresh fruits details\n6. Mark fruit as stale\n7. Display tastes of all stale fruits");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 0:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                case 1: // Add Mango
                    if (counter >= n) {
                        System.out.println("Basket is full! Cannot add more fruits.");
                        break;
                    }
                    System.out.print("Enter Mango name: ");
                    String mName = sc.nextLine();
                    System.out.print("Enter weight: ");
                    double mWeight = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter color: ");
                    String mColor = sc.nextLine();
                    basket[counter++] = new Mango(mName, mWeight, mColor, true);
                    System.out.println("Mango added.");
                    break;

                case 2: // Add Orange
                    if (counter >= n) {
                        System.out.println("Basket is full! Cannot add more fruits.");
                        break;
                    }
                    System.out.print("Enter Orange name: ");
                    String oName = sc.nextLine();
                    System.out.print("Enter weight: ");
                    double oWeight = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter color: ");
                    String oColor = sc.nextLine();
                    basket[counter++] = new Orange(oName, oWeight, oColor, true);
                    System.out.println("Orange added.");
                    break;

                case 3: // Add Apple
                    if (counter >= n) {
                        System.out.println("Basket is full! Cannot add more fruits.");
                        break;
                    }
                    System.out.print("Enter Apple name: ");
                    String aName = sc.nextLine();
                    System.out.print("Enter weight: ");
                    double aWeight = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter color: ");
                    String aColor = sc.nextLine();
                    basket[counter++] = new Apple(aName, aWeight, aColor, true);
                    System.out.println("Apple added.");
                    break;

                case 4: // Display names of all fruits
                    System.out.println("Names of all fruits in basket:");
                    for (Fruit f : basket) {
                        if (f != null) {
                            System.out.println(f.getname());
                        }
                    }
                    break;

                case 5: // Display name,color,weight, taste of fresh fruits
                    System.out.println("Details of all fresh fruits:");
                    for (Fruit f : basket) {
                        if (f != null && f.isFresh()) {
                            System.out.println(f.toString() + ", taste: " + f.tast());
                        }
                    }
                    break;

                case 6: // Mark fruit as stale
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

                case 7: // Display tastes of all stale fruits
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
