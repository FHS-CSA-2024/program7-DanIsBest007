//import stuff here
import java.util.Scanner;

//Your code here

public class Program7
{
    public static double convertMoney(int schruteBuck, int klevin, int stanleyNickel)
    {
        double total = schruteBuck;
        double newKlevin = klevin;
        newKlevin += (double)stanleyNickel / 12;
        total += newKlevin / 20;
        total *= 100;
        total = (int)(total+0.5);
        total /= 100;
        return total;
    }
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // old system
        System.out.println("Enter Schrute bucks, Klevins, and Stanly Nickel amount in order: ");
        int schruteBuck = input.nextInt();
        int klevin = input.nextInt();
        int stanleyNickel = input.nextInt();
        
        //prints old value
        System.out.println("Currency in old system: $" + schruteBuck + "." + klevin + "." + stanleyNickel);
        
        // converts all values to stanleyNickels
        double newSchruteBuck = convertMoney(schruteBuck, klevin, stanleyNickel);
        
        //prints new value
        System.out.println("Currency in new system: $" + newSchruteBuck);
    }
}

//Paste console output below:
/*
    Enter Schrute bucks, Klevins, and Stanly Nickel amount in order: 
    5
    2
    8
    Currency in old system: $5.2.8
    Currency in new system: $5.13
*/
