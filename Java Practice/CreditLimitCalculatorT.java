import java.util.Scanner;

public class CreditLimitCalculatorT
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    {
      int account = 1, balance,charges,credits,credit_limit,newbal;

      while(account != 0)
      {
        System.out.println();
        System.out.print("Enter Account Number: ");
        account = scan.nextInt();

        System.out.print("Enter Initial Balance: ");
        balance = scan.nextInt();

        System.out.print("Enter Total Charges: ");
        charges = scan.nextInt();

        System.out.print("Enter Total Credits: ");
        credits = scan.nextInt();

        System.out.print("Enter Credit Limit: ");
        credit_limit = scan.nextInt();

        newbal = balance + charges - credits;
        System.out.println("New Balance: " + newbal);

        if(newbal > credit_limit)
        {
          System.out.println("Credit Limit Exceeded");
          break;
        }
      }
    }
  }
}
