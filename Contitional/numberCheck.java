import java.util.Scanner;

public class numberCheck{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number:");
        int num = input.nextInt();

        if (num>0){
            System.out.println("Positive No.");
        }
        else if (num<0){
            System.out.println("Negative No.");
        }
        else{
            System.out.println("Zero");
        }
    }
}
