/*
Name: Joshan Rai
Date: 06/12/2021
Class: CS212
Filename: Date.java
HW#: Lab02 from Chapter 03
*/

import java.util.Scanner;

public class Date
{
  /*
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    Date dt = new Date(requestInput("Enter month: ", sc), requestInput("Enter day: ", sc), requestInput("Enter year: ", sc));

    dt.displayDate();
  }
  public static int requestInput(String s, Scanner sc){
    System.out.print(s);
    return sc.nextInt();
  }
  */

  private int month, day, year;

  public Date(int month, int day, int year)
  {
    setMonth(month);
    setDay(day);
    setYear(year);
  }
  //set
  public void setMonth(int month)
  {
    this.month = month;
  }
  public void setDay(int day)
  {
    this.day = day;
  }
  public void setYear(int year)
  {
    this.year = year;
  }

  //get
  public int getMonth()
  {
    return month;
  }
  public int getDay()
  {
    return day;
  }
  public int getYear()
  {
    return year;
  }

  //display
  public void displayDate()
  {
    System.out.printf("%d/%d/%d\n", getMonth(), getDay(), getYear());
  }
}
