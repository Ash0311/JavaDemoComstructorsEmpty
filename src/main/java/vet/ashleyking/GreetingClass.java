package vet.ashleyking;

import java.util.Scanner;

public class GreetingClass {

    // Empty constructor
    public GreetingClass() {
        // Nothing to do here
    }

    // Method to display a greeting with the user's name
    public void displayGreeting() {
        Scanner scanner = new Scanner(System.in);

        // Prompting the user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Displaying the greeting message
        System.out.println("Hello, " + name + "!");

        scanner.close();
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Creating an instance of GreetingClass using the empty constructor
        GreetingClass greeting = new GreetingClass();

        // Calling the displayGreeting method
        greeting.displayGreeting();
    }
}
