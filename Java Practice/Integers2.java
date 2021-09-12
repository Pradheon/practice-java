/**
Name: Joshan Rai
Date: 05/12/2021
Class: CS212
Assignment: Lab01 from Chapter 02
Question Number: 2.24 (Largest and Smallest Integers) 
Synopsis: Application that reads five integers, no user input, and determines and prints the largest and smallest integers in the group. Use only the programming techniques you learned in this chapter.
*/
public class Integers2 {
  public static void main (String[] args) {

    int num1 = 2;
    int num2 = 5;
    int num3 = 7;
    int num4 = 9;
    int num5 = 4;
    int smallest;
    int largest;

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
