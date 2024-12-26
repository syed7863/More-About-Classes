package lab2;

import java.util.Scanner;

public class Car {
    // Attributes
    private String make;
    private String model;
    private short year;
    private int price;

    // Constructor
    public Car(String make, String model, short year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Method to display car details
    public void displayCarDetails() {
        System.out.println("Car Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of cars you want to create:");
        int numberOfCars = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Car[] cars = new Car[numberOfCars];

        // Input car details
        for (int i = 0; i < numberOfCars; i++) {
            System.out.println("\nEnter details for Car " + (i + 1) + ":");
            System.out.print("Make: ");
            String make = scanner.nextLine();
            System.out.print("Model: ");
            String model = scanner.nextLine();
            System.out.print("Year: ");
            short year = scanner.nextShort();
            System.out.print("Price: ");
            int price = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            cars[i] = new Car(make, model, year, price);
        }

        // Display car details
        System.out.println("\nDisplaying Car Details:");
        for (int i = 0; i < cars.length; i++) {
            System.out.println("\nCar " + (i + 1) + ":");
            cars[i].displayCarDetails();
        }

        scanner.close();
    }
}