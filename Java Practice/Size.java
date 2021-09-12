//Java Progream to check the size using the switch...case statement
import java.util.Scanner;
class Size {
  public static void main(String[] args) {
    //int number = 44;
    Scanner input = new Scanner(System.in);
    // Getting float Input
    System.out.print("Enter a size: ");
    int myInt = input.nextInt();
    String size;
    // switch statement to check Size
    switch (myInt) { // was number
      case 29: size = "Small";break;
      case 42: size = "Medium";break;
      case 44: size = "Large";break;
      default: size = "Unknown";break;
    }
    System.out.println("Size: " + size);
  }
}
