# Car Class Project 7

## Synopsis

### Car.java

The `Car` class represents a car with attributes such as make, model, color, status, speed, and gear. It provides methods to start, stop, accelerate, brake, honk, switch gears, and display car information.

- **Attributes:**
  - `make`: The make of the car.
  - `model`: The model of the car.
  - `color`: The color of the car.
  - `status`: The current status of the car (e.g., "started", "stopped").
  - `speed`: The current speed of the car.
  - `gear`: The current gear of the car (e.g., 'p', 'd', 'n', 'r').
  - `MAX_SPEED`: The maximum speed the car can go (200).

- **Methods:**
  - `start()`: Starts the car.
  - `stop()`: Stops the car.
  - `accelerate(int speedChange)`: Increases the car's speed by the specified amount, with conditions.
  - `brake(int speedChange)`: Decreases the car's speed by the specified amount, with conditions.
  - `honk()`: Honks the car's horn.
  - `switchGear(char newGear)`: Switches the car's gear, with validation.
  - `displayState()`: Displays the car's current state, including status, speed, and gear.
  - `displayCarInfo()`: Displays the car's information.

[-->View Car.java](src/main/java/com/me/carclass/Car.java)

### CarClass.java

The `CarClass` class contains the `main` method and serves as the entry point for the application. It creates instances of the `Car` class, prompts the user for input, and displays car information.

- **Main Method:**
  - Prompts the user to enter the year and acceleration/brake force for two cars.
  - Displays the details of each car, including the effects of acceleration and braking.
  - Additional steps for `myCar`:
    - Displays the initial car state.
    - Tries to accelerate.
    - Starts the car.
    - Switches gear to 'd'.
    - Accelerates to a desired speed.
    - Brakes to bring the car speed to 0.
    - Switches gear to 'r'.
    - Accelerates to 20.
    - Brakes to bring the car speed to 0.
    - Stops the car.
    - Switches gear to 'p'.
    - Honks the horn.

[-->View CarClass.java](src/main/java/com/me/carclass/CarClass.java)

## Images

<!--- ![Output Screen](/carclassproject/images/OutputScreenlab7_1.png)
- ![Class Diagram](/carclassproject/images/OutputScreenlab7_2.png)
- ![Class Diagram](/carclassproject/images/OutputScreenlab7_3.png)
-->
<div style="width:auto; height:550px; font-size:20px; text-align:center;">

| Output 1 | Output 2 | Output 3 |
|:-------------------------:|:-------------------------:|:-------------------------:|
|<img src="/carclassproject/images/OutputScreenlab7_3.png" style="width:600px; height:550px;"> | <img src="/carclassproject/images/OutputScreenlab7_1.png" style="width:auto; height:500px;"> | <img src="/carclassproject/images/OutputScreenlab7_2.png" style="width:auto; height:500px;"> |

</div>


## Author: [Harry Joseph](https://github.com/hjoseph777)
## Date: 2024-11-19
