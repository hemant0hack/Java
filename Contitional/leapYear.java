
import java.util.Scanner;

public class leapYear{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter year:");
        int year = input.nextInt();
         if (year % 400 == 0)
            System.out.println("Leap year");
        else if (year % 100 == 0)
            System.out.println("Not a Lear Year");
        else if (year % 4 == 0)
            System.out.println("Leap Year");
        else 
        System.out.println("Not a Leap Year");
    }
}