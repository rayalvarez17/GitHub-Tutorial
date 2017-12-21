
package car.shopping;
import java.util.Scanner;
/**
 *Raymond Alvarez
 *Mr. Larrubia
 *Per.: 2
 * Project Name: Car Shopping 
 */
public class CarShopping {
private static Scanner in = new Scanner(System.in);
   
     public static void main(String[] args)
 {
 int totalCost = 0;
 totalCost += base();
 totalCost += automaticWindows();
 totalCost += keylessEntry();
 totalCost += abs();
 totalCost += wheel();
 totalCost += sunRoof();
 totalCost += coldWeather();
 totalCost += gpsNav();
 totalCost += speakers();
 totalCost += goldPlating();
 totalCost += bigGas();
 
 
 
System.out.println("*****CAR TOTAL " + totalCost + " *****");
     
 //TODO: call methods that you write for each feature
 //TODO: print the total cost of the vehicle
 }

 public static int base()
 {
 System.out.println("Our inventory:");
 System.out.println("Model 1 - $15,000");
 System.out.println("Model 2 - $24,000");
 System.out.println("Model 3 - $40,000");
 System.out.println("Which base model did the customer choose?"
         + "enter full model name) > ");
 String model = in.nextLine();
 if(model.equalsIgnoreCase("Model 1"))
 return 15000;
 
 else if (model.equalsIgnoreCase("Model 2"))
     return 24000;
 
 else if (model.equalsIgnoreCase("Model 3"))
     return 40000;
return 0;

 }

 public static int automaticWindows()
 {
 System.out.print("Automatic Windows for $500? (y/n) > ");
 String windows = in.nextLine();
 if (windows.equalsIgnoreCase("yes"))
     return 500;
 else 
     return 0;    
 }
public static int keylessEntry()
{
    System.out.println("Remote Keyless Entry for $1000? (y/n)");
    String entry = in.nextLine();
    if (entry.equalsIgnoreCase("yes"))
        return 1000;
    else 
        return 0;
}
public static int onStar()
{
    System.out.println("Onstar System for $1000? (y/n)");
    String onStar = in.nextLine();
    if (onStar.equalsIgnoreCase("yes"))
        return 1000;
    else 
        return 0;
}
public static int abs()
{
    System.out.println("Anti-lock Brakes for $500? (y/n)");
    String abs = in.nextLine();
    if (abs.equalsIgnoreCase("yes"))
        return 500;
    else 
        return 0;
}
public static int wheel()
{
    System.out.println("Telescoping Wheel & Adjustable"
            + " Pedals for $1000? (y/n)");
    String wheels = in.nextLine();
    if (wheels.equalsIgnoreCase("yes"))
        return 1000;
    else 
        return 0;
}
public static int sunRoof()
{
    System.out.println("Sun Roof for $800? (y/n)");
    String roof = in.nextLine();
    if (roof.equalsIgnoreCase("yes"))
        return 800;
    else 
        return 0;
}
public static int coldWeather()
{
    System.out.println("Cold Weather Package for $1500? (y/n)");
    String cold = in.nextLine();
    if (cold.equalsIgnoreCase("yes"))
        return 1500;
    else 
        return 0;
}
public static int gpsNav()
{
    System.out.println("GPS Navigation for $1000? (y/n)");
    String gps = in.nextLine();
    if (gps.equalsIgnoreCase("yes"))
        return 750;
    else 
        return 0;
}
public static int speakers()
{
    System.out.println("Dope speakers for $3000? (y/n)");
    String sound = in.nextLine();
    if (sound.equalsIgnoreCase("yes"))
        return 3000;
    else 
        return 0;
}
public static int goldPlating()
{
    System.out.println("Dope gold plating for $300000? (y/n)");
    String sound = in.nextLine();
    if (sound.equalsIgnoreCase("yes"))
        return 300000;
    else 
        return 0;
}
public static int bigGas()
{
    System.out.println("BigGas for $30000? (y/n)");
    String swag = in.nextLine();
    if (swag.equalsIgnoreCase("yes"))
        return 300000;
    else 
        return 0;
}
}