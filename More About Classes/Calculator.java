package lab2;

import java.util.Scanner;

public class Calculator {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        // Demonstrate first add() method
        System.out.println("Enter two integers to add:");
        int int1 = scanner.nextInt();
        int int2 = scanner.nextInt();
        System.out.println("Sum of two integers: " + calculator.add(int1, int2));

        // Demonstrate second add() method
        System.out.println("\nEnter three integers to add:");
        int int3 = scanner.nextInt();
        System.out.println("Sum of three integers: " + calculator.add(int1, int2, int3));

        // Demonstrate third add() method
        System.out.println("\nEnter two doubles to add:");
        double double1 = scanner.nextDouble();
        double double2 = scanner.nextDouble();
        System.out.println("Sum of two doubles: " + calculator.add(double1, double2));

        scanner.close();
    }
}
