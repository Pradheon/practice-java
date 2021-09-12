/**
Name: Joshan Rai
Date: 05/12/2021
Class: CS212
Assignment: Lab01 from Chapter 02
Question Number: 2.24 (Largest and Smallest Integers)
Synopsis: Application that reads five integers, from user input, and determines and prints the largest and smallest integers in the group. Use only the programming techniques you learned in this chapter.
*/

import java.util.Scanner;

public class Integers {
  public static void main (String[] args) {
    Scanner input=new Scanner(System.in);

    int num1;
    int num2;
    int num3;
    int num4;
    int num5;
    int smallest;
    int largest;

    System.out.print("Enter 1st number: ");
    num1 = input.nextInt();

    System.out.print("Enter 2nd number: ");
    num2 = input.nextInt();

    System.out.print("Enter 3rd number: ");
    num3 = input.nextInt();

    System.out.print("Enter 4th number: ");
    num4 = input.nextInt();

    System.out.print("Enter 5th number: ");
    num5 = input.nextInt();

    smallest = num1;
    if (num2 < smallest)
      smallest = num2;

    if (num3 < smallest)
      smallest = num3;

    if (num4 < smallest)
      smallest = num4;

    if (num5 < smallest)
      smallest = num5;

    largest = num1;
    if (num2 > largest)
      largest = num2;

    if (num3 > largest)
      largest = num3;

    if (num4 > largest)
      largest = num4;

    if (num5 > largest)
      largest = num5;

      System.out.printf("Smallest integer is: %d\n", smallest);
      System.out.printf("Largest integer is: %d\n", largest);

  }
}
