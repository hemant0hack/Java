import java.util.Scanner;

public class vote{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age :");
        
        int age = input.nextInt();
        boolean hasvoterId = input.nextBoolean();
        
        if (age >= 18  && age <=60 ){
            if (hasvoterId){
                System.out.println("you has voter ID");
                System.out.println("You can vote");
            }
            else{
                System.err.println("need Voter Id");
                System.err.println("you cannot vote");
            }
        }
        else{
            System.out.println("You are not to eligible to vote");
        }
    }
}