// Author: Maya Strickland
// Date: 10/11/2022
// About the program: This program will calculate the score of a bowling game based on the user's input for each frame.

import java.util.Scanner;
import java.util.Arrays;

class Main {

  // List of variables used in this program
  public static int numberOfRolls;
  public static int maxPins = 10;
  public static int numberOfPins;
  //public static int strikeBonus;
  public static int score;
  // List of scanners
  public static Scanner input = new Scanner(System.in);

  // Method that prompts the user to enter in the scores from one frame

  public static void myFrame() {
    int[] frame1 = new int[2];
    System.out.println("");
    for (int counter = 0; counter < frame1.length; counter++) {
      System.out.println("Please enter the number of pins knocked down in roll " + (counter + 1));
      numberOfPins = input.nextInt();
      frame1[counter] = numberOfPins;
      if (numberOfPins > 10) {
        System.out.println("Invalid number of pins! Number cannot exceed 10! Try again!");
      } else if (numberOfPins == maxPins) { // calculation of spare and strike
       // for (int counter2 = 0; counter2 < frame1.length; counter2++) {
          System.out.println("Please enter the number of pins knocked down in bonus roll " + (counter + 1));
          strikeBonus = input.nextInt();
          frame1[counter2] = strikeBonus;
          score = 10 + score + frame1[counter2];
        }
      } else {
        score = score + frame1[counter];
      }
    }

    // input.close();

    System.out.println("Your score for frame 1 is");
    // for(int counter = 0; counter<numberOfRolls;counter++)
    // {
    System.out.println(score);
    // }

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