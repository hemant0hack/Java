import java.util.Scanner;

public class grade{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your marks :");
        
        int marks = input.nextInt();
        
        if (marks >= 90){
            System.out.println("Grade : A");
        }
        else if (marks >=70){
            System.out.println("Grade : B");
        }
        else if (marks >= 50){
            System.out.println("Grade : C");
        }
        else if (marks >= 40){
            System.out.println("Pass");
        }
        else{
            System.err.println("fail");
        }
    }
}