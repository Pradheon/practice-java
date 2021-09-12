// Fig. 3.1 Account.java
// Account class that contains a name instance variable and methods to set and get its value.
import java.util.Scanner;

public class Account {
  private String name; //instance variable

  //method to set the name in the object
  public void setName(String name) {
    this.name = name; //store the name
  }

  // method to retrieve the name from the object
  public String getName() {
    return this.name; //return value of name to caller
  }

  public static void main(String[] args) {
    // create a Scanner object to obtain input from the command window
    Scanner input = new Scanner(System.in);

    // create an Account object and assign it to myAccount
    Account myAccount = new Account();

    // display initial value of name 9null
    System.out.printf("Initial name is: %s%n%n", myAccount.getName());

    // prompt for and read name
    System.out.println("Please enter the name: ");
    String theName = input.nextLine(); // read a line of text
    myAccount.setName(theName); // put theName in myAccount
    System.out.println(); //outputs a blank line

    // display the name stored in object myAccount
    System.out.printf("Name in account is: %n%s%n", myAccount.getName());
  }
}
