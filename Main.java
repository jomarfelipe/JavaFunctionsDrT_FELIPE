/***
  Functions Practice with Java Dr. McMillan
  A program to calculate the invoice amount for various customers.
  We practice various functions that pass information by value.
  @author (Dr. Tyson McMillan)
  @version (a version 2 12-01-2022)
  @teacher (Dr. T)
*/
import java.text.NumberFormat; //special thanks to GeeksForGeeks

class Main 
{
  //function definition for the invoice calculator
  public static double invoiceCalculator(double rate, double hours, String custName, int discount) 
  {
    double grossDue = 0.0, netDue = 0.0, tax = 0.0, taxRate = 0.0825;
    if(discount == 1)
    {
      grossDue = (rate * hours) * 0.90;
    }
    else if(discount == 2)
    {
      grossDue = (rate * hours) * 0.80;
    }
    else
    {
      grossDue = (rate * hours);
    }
    tax = grossDue * taxRate;
    netDue = grossDue + tax;
    System.out.print(custName + ": ");

    return netDue;
  }

  public static void main(String[] args)
  {
    double result = 0.0;
    NumberFormat formatter = NumberFormat.getCurrencyInstance();
    result = invoiceCalculator(95.00,35.50,"Web, LLC", 1);
    System.out.println(formatter.format(result));

    result = invoiceCalculator(95.00,27.00,"Dr T's Turkey Legs",2);
    System.out.println(formatter.format(result));

    result = invoiceCalculator(109.99,29.99,"Felipe Music Studios",0);
    System.out.println(formatter.format(result));
  }
}