package Labs;


/**
 * Calculates miles traveled and work miles traveled
 *
 * @author (Connor Kasper, Ashar)
 * @date (8/28)
 */
import java.util.Scanner;
public class MilesTravelled 
{
    public static void main(String[] args)
    {
        int daysDrove = 5, workDays;
        Scanner keyboard = new Scanner(System.in);
        double disFromHome = 20.0; //miles
        double totalMileage = 0.0;
        
        System.out.println("How long were you driving for: (Days) ");
        daysDrove = keyboard.nextInt();
        
        System.out.println("How many work days did you have in " + daysDrove + " days: ");
        workDays = keyboard.nextInt();
        
        System.out.println("What's the beginning mileage: ");
        double startMile = keyboard.nextDouble();
        
        System.out.println("What's the ending mileage: ");
        double endMile = keyboard.nextDouble();
        
        totalMileage = endMile - startMile;
        System.out.println("Total Mileage: " + totalMileage + " Miles");
        double workMiles = workDays * disFromHome;
        System.out.println("Work Mileage: " + workMiles + " Miles");
        double ratio = totalMileage/workMiles * 100;
        System.out.printf("Ratio: %-1.2f", ratio);
        System.out.print("%");
        
    }
}
