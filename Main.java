// Author: Maya Strickland
// Date: 10/11/2022
// About the program: This program will calculate the score of a bowling game based on the user's input for each frame.

import java.util.Scanner;
import java.util.Arrays;

class Main {

  // List of variables used in this program
  public static int numberOfRolls;
  public static int maxPins;
  public static int numberOfPins;
  // List of scanners
  public static Scanner input = new Scanner(System.in);
  

  // Method that prompts the user to enter in the scores from one frame

  public static void myFrame() {
    //System.out.println("How many rolls did you have in frame 1?");
    System.out.println("");
    //numberOfRolls = input.nextInt();
    int[] frame1 = new int[numberOfRolls];
    System.out.println("");
    if (numberOfRolls > 3) {
      System.out.println("Number of rolls cannot exceed 3 per frame. Try again!");
    } else {
      for (int counter = 0; counter < numberOfRolls; counter++) {
        System.out.println("Please enter the number of pins knocked down in roll " + (counter + 1));
        numberOfPins = input.nextInt();
        frame1[counter] = numberOfPins;
        if(numberOfPins > 10){
          System.out.println("Invalid number of pins! Number cannot exceed 10! Try again!");
        }
          
      }
    }

    input.close();

    System.out.println("Your score for frame 1 is");
    for (int counter = 0; counter < numberOfRolls; counter++) {
      System.out.println(frame1[counter]);
    }

  }

  public static void main(String[] args) {
    System.out.println("");
    System.out.println("****************Welcome to MCC Bowling!****************");
    System.out.println("");
    System.out.println("This program will calculate the score of a bowling game for one bowler.");
    System.out.println("");
    myFrame();
  }
}

// To-Do List
// Create second input for number of pins knocked down
// 