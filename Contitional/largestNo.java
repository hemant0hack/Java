
import java.util.Scanner;

public class largestNo{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter first no.:");
        int a = input.nextInt();

        System.out.println("Enter second no.:");
        int b = input.nextInt();

        if(a>b){
            System.out.println("Largest First no.");
        }else{
            System.out.println("Largest second no.");
        }
    }
}