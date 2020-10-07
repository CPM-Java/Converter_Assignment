
/**
 * Working with system.in and objects
 * 
 * @author GrayKnight  CPM 2017
 * @version 9/14/17
 */

//import is done
import java.util.Scanner;

public class ConverterDriver
{
    private Scanner scan = new Scanner(System.in);
    
    //Notice that this is only a method declaration, not a complete instantiation.
    //It has been placed here so that memory is reserved and when the object instantiation 
    // is completed with  = new ConverterClass(), the object will be an instance variable,
    // and available to any method.
    private ConverterClass conv;
    // documentation for the ConverterClass can be found in the README.txt file
    

    /**
     * Makes Coversions
     */
    public void convert()
    {
        System.out.print("What country are you traveling to?");
        String loc = scan.nextLine(); //nextLine() will read a string from the terminal
        conv = new ConverterClass(loc); // Now that loc has info, the instantiation can be completed.
        System.out.print("Enter a temperature in degrees Fahrenheit:");
        double tempF = scan.nextDouble();
        System.out.print("Enter a distance in miles:");
        double distM = scan.nextDouble();
        System.out.print("Enter a weight in ounces:");
        double weigO = scan.nextDouble();
        
        System.out.print("That is:\n\t" + conv.tempConverter(tempF) + "  degrees Celsius.");
        System.out.print("\n\t" + conv.distConverter(distM) + "  kilometers.");
        System.out.println("\n\t" + conv.massConverter(weigO) + "  grams.");
        System.out.println(conv); //If you put an object identifier in a System.out.print() method,
                                  // the object's toString() method is called automatically.
    }
}
