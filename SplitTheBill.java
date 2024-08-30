package Labs;


/**
 * Write a description of class SplitTheBill here.
 *
 * @author (Connor Kasper, Ashar)
 * @version (08/29/24)
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class SplitTheBill
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How much is the bill? (No tip) ");
        double bill = keyboard.nextDouble();
        double tip = bill * 0.2;
        double total = bill + tip;
        System.out.println("How many friends did you bring: ");
        int people = keyboard.nextInt();
        people = people + 1;
        
        
        double pay = bill / people;
        double pay2 = tip / people;
        
        DecimalFormat fmt = new DecimalFormat("0.00");
        System.out.println("The tip is $" + fmt.format(tip));
        System.out.println("The bill with the tip is $" + fmt.format(total));
        System.out.println("Each person has to pay $" + fmt.format(pay) + " for the bill. ");
        System.out.println("Each person has to pay $" + fmt.format(pay2) + " for the tip. ");
        System.out.println("Each person has to pay $" + fmt.format(pay + pay2) + " in total. ");
    
    }
}
