/*
 * @author Divyansh Bhardwaj
 * @version 1.0
 * */
package main;

import java.util.Scanner;


public class Gravity {
	// TODO 1: Create the main method
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter time :");
        double gravity = 9.8;
        double time = scn.nextDouble();
        double Distance = 0.0;
        double Speed = 0.0;
        System.out.println("Distance: " + 0.5 * gravity * time * time);
        System.out.println("Speed: " + gravity * time);

		/* TODO 2:
		 *   a. Declare all your necessary variables inside main method.
		 *   b. Declare a constant for 'gravity', assume the value to be 9.8
		 *   c. Calculate the result and print it to the screen.
		 * */
	}
	// P.S: Refer to the README.md file for the problem statement, input & output.
}
