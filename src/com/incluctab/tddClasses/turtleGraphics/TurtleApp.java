package com.incluctab.tddClasses.turtleGraphics;

import java.util.Scanner;

public class TurtleApp {

    private static Turtle newTurtle = new Turtle();
    private static Sketchpad newSketch = new Sketchpad(20, 20);
    private static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        int inputCollector;
        do {
            displayMenu();
            inputCollector = input.nextInt();
            collectInput(inputCollector);
        }while(inputCollector != 9);
    }

    public static void displayMenu(){
        String mainMenu = """
                -> Enter 1 for Pen Up
                -> Enter 2 for Pen Down
                -> Enter 3 for Turn Right
                -> Enter 4 for Turn Left
                -> Enter 5 to Move Forward
                -> Enter 6 to Display SketchPad Floor
                -> Enter 9 for End of Data
                """;
        System.out.println(mainMenu);
    }

    public static void collectInput(int inputCollector){
        switch (inputCollector) {
            case 1 -> newTurtle.turnPenUp();
            case 2 -> newTurtle.turnPenDown();
            case 3 -> newTurtle.turnRight();
            case 4 -> newTurtle.turnLeft();
            case 5 -> {
                System.out.println("Enter number of steps: ");
                int inputSteps = input.nextInt();
                newTurtle.moveForward(inputSteps, newSketch);
            }
            case 6 -> newSketch.displaySketchPad();
        }
    }
}
