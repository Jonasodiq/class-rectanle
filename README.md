# Rectangle Program

## Description

This program demonstrates the use of a Java class called `Rectangle`. The class represents a rectangle and provides methods for calculating its area and perimeter, as well as handling its position and dimensions.

The program creates several rectangle objects using different constructors and shows how these objects can be modified and used.

## Features

1. **`Rectangle` Class**:
    - Contains four instance variables: `x`, `y`, `width`, `height`.
    - Three constructors:
        1. A no-parameter constructor that sets all instance variables to 0.
        2. A constructor that takes two values for `width` and `height` while setting `x` and `y` to 0.
        3. A constructor that takes four values to set `x`, `y`, `width`, and `height`.
    - Methods:
        - `calculateArea`: Calculates and returns the area of the rectangle.
        - `calculatePerimeter`: Calculates and returns the perimeter of the rectangle.
        - `setXY`: Sets new values for `x` and `y`.
        - `setWidth`: Sets a new value for `width`.
        - `setHeight`: Sets a new value for `height`.
        - `toString`: Returns a string representation of the rectangle.

2. **Program**:
    - Creates multiple rectangle objects using different constructors.
    - Displays the properties of the rectangles by printing their state using the `toString()` method.
    - Modifies the position and dimensions of the rectangles and displays the results.
    - Calculates and prints the area and perimeter for one of the rectangles.

## Example Usage

When you run the program, the output looks like this:

```
Rect0: Rectangle [x=0, y=0, width=0, height=0]
Rect1 w/h: Rectangle [x=0, y=0, width=30, height=40]
Rect2 x/y & w/h: Rectangle [x=10, y=20, width=30, height=40]
Rect1 x: Rectangle [x=5, y=8, width=30, height=40]
Rect2 x: Rectangle [x=10, y=20, width=20, height=40]
rect2.calcArea = 800.0 rect2.calcPerimeter = 120.0
Updated Rect2: Rectangle [x=10, y=15, width=7, height=12]
```

## Installation

1. Clone this repository or copy the Java source code to your local environment.
2. Compile and run `Main.java` with your Java compiler (e.g., `javac` and `java`).

```bash
javac Main.java
java Main
```

## System Requirements
- Java Development Kit (JDK) version 8 or higher.

## Author
- This program is created as an example to demonstrate object-oriented programming and the use of classes in Java.

