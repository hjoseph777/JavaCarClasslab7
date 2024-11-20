//File: `src/main/java/com/me/carclass/Car.java`
package com.me.carclass;

public class Car {
    private String make;
    private String model;
    private String color;
    private String status = "stopped";
    private int speed = 0;
    private char gear = 'p';
    public static final int MAX_SPEED = 200; 

    // Constructor
    public Car(String make, String model, String color) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.gear = 'p'; // Initialize gear to 'p'
    }

    // Setters and getters
    public void setMake(String make) {
        this.make = make;
    }

    public String getMake() {
        return this.make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public String getStatus() {
        return this.status;
    }

    public void start() {
        System.out.println("Starting the car...");
        this.status = "started";
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }

    
    public void accelerate(int speedChange) {
        if (!this.status.equals("started")) { 
            System.out.println("Please start the car");
            return;
        }
        if (this.speed + speedChange > MAX_SPEED) {
            System.out.println("Cannot exceed maximum speed of " + MAX_SPEED);
            return;
        }
        this.speed += speedChange;
        displayCarInfo();
    }

    public void brake(int speedChange) {
        if (this.speed - speedChange < 0) { 
            this.speed = 0;
        } else {
            this.speed -= speedChange;
        }
        displayCarInfo();
    }

    public void stop() {
        System.out.println("Stopping the car...");
        this.status = "stopped";
    }

    public void honk() {
        System.out.println("honk honk~~~");
    }

    
    public void switchGear(char newGear) {
        if (this.speed > 0) {
            System.out.println("Cannot change gear while car is moving");
            return;
        }
        if (newGear == 'p' || newGear == 'd' || newGear == 'n' || newGear == 'r') {
            this.gear = newGear;
        } else {
            System.out.println("Invalid gear selection");
        }
    }

        public void displayState() {
        System.out.printf("Status: %s, Speed: %d, ", this.status, this.speed);
        switch (this.gear) {
            case 'p':
                System.out.println("The car is in Park");
                break;
            case 'd':
                System.out.println("The car is in Drive");
                break;
            case 'n':
                System.out.println("The car is in Neutral");
                break;
            case 'r':
                System.out.println("The car is in Reverse");
                break;
            default:
                System.out.println("Unknown gear");
        }
    }

    public void displayCarInfo() {
        System.out.printf("Make: %s, Model: %s, Speed: %d, Color: %s, Status: %s%n", this.make, this.model, this.speed, this.color, this.status);
    }
}