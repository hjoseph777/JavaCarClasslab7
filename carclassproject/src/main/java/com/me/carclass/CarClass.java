package com.me.carclass;
import java.util.Scanner;

public class CarClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        // Create car instances
        Car myCar = new Car("Honda", "Civic", "red");
        Car davidsCar = new Car("Benz", "GLA", "black");
      
        // Get year and acceleration for myCar
        System.out.print("Enter the year for myCar: ");
        int yearForMyCar = scanner.nextInt();
        System.out.print("Enter the acceleration/brake force for myCar: ");
        int speedChangeMyCar = scanner.nextInt();
        
        System.out.println("\n--- My Car Details ---");
        displayCarInfo(yearForMyCar, speedChangeMyCar, myCar);
        
        // Get year and acceleration for davidsCar
        System.out.print("\nEnter the year for davidsCar: ");
        int yearForDavidsCar = scanner.nextInt();
        System.out.print("Enter the acceleration/brake force for davidsCar: ");
        int speedChangeDavidsCar = scanner.nextInt();
        
        System.out.println("\n--- David's Car Details ---");
        displayCarInfo(yearForDavidsCar, speedChangeDavidsCar, davidsCar);

        // Additional steps for myCar
        System.out.println("\n--- Additional Steps for myCar ---");
        System.out.println("Initial Car State:");
        myCar.displayState();

        // Try to accelerate
        System.out.println("\nTrying to accelerate:");
        myCar.accelerate(20);

        // Start the car
        System.out.println("\nStarting the car:");
        myCar.start();
        myCar.displayState();

        // Switch gear to 'd'
        System.out.println("\nSwitching gear to 'd':");
        myCar.switchGear('d');
        myCar.displayState();

        // Accelerate to a desired speed
        System.out.println("\nAccelerating to 50:");
        myCar.accelerate(50);
        myCar.displayState();

        // Brake to bring the car speed to 0
        System.out.println("\nBraking to 0:");
        myCar.brake(50);
        myCar.displayState();

        // Switch gear to 'r'
        System.out.println("\nSwitching gear to 'r':");
        myCar.switchGear('r');
        myCar.displayState();

        // Accelerate to 20
        System.out.println("\nAccelerating to 20:");
        myCar.accelerate(20);
        myCar.displayState();

        // Brake to bring the car speed to 0
        System.out.println("\nBraking to 0:");
        myCar.brake(20);
        myCar.displayState();

        // Stop the car
        System.out.println("\nStopping the car:");
        myCar.stop();
        myCar.displayState();

        // Switch gear to 'p'
        System.out.println("\nSwitching gear to 'p':");
        myCar.switchGear('p');
        myCar.displayState();

        // Honk
        System.out.println("\nHonking:");
        myCar.honk();

        scanner.close();
    }
 
 
 
    private static void displayCarInfo(int year, int speedChange, Car car) {
        
        //System.out.println("=== Car Information ===");
        System.out.printf("Year: %d%n", year);
        car.displayCarInfo();
        car.displayState();
        System.out.println();
    
        
        System.out.println("=== Starting Car ===");
        car.start();
        System.out.printf("Status: %s%n", car.getStatus());
        System.out.printf("Speed: %d mph%n", car.getSpeed());
        System.out.println();
    
       
        System.out.println("=== Speed Changes ===");
        car.accelerate(speedChange);
        System.out.printf("Speed after acceleration: %d mph%n", car.getSpeed());
        car.brake(speedChange);
        System.out.printf("Speed after braking: %d mph%n", car.getSpeed());
        System.out.println();
    
     
        System.out.println("=== Stopping Car ===");
        car.stop();
        System.out.printf("Status after stopping: %s%n", car.getStatus());
        System.out.printf("Speed after stopping: %d mph%n", car.getSpeed());
        System.out.println();
    
        //System.out.println("=== Switching Gears ===");
       // car.switchGear('d');
        //System.out.println("=== Additional Actions ===");
        //car.honk();
        //System.out.println();
    }

    
}