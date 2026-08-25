import java.util.Scanner;

public class dl{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age :");
        int age = input.nextInt();
        
        
        if (age >= 18  && age <=70 ){
            
            System.err.print("Enter your DL stauts: ");
            boolean hasDLId = input.nextBoolean();
            if (hasDLId){
                System.out.println("you has DL ID");
                System.out.println("You can Drive");
            }
            else{
                System.err.println("need DL Id");
                System.err.println("you cannot Driving");
            }
        }
        else{
            System.out.println("You are not to eligible to Driving");
        }
    }
}