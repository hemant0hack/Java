import java.util.Scanner;

public class cal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter operater");
        char  operater = sc.next().charAt(0);
        System.err.println("Enter first value:");
        int a = sc.nextInt();
        System.err.println("Enter second value:");
        int b = sc.nextInt();

        int result;
        switch (operater){
            case '+':
                result = a+b;
                System.out.println("Sum of A & B: " + result);
                break;
            case '-':
                result = a-b;
                System.out.println("Sub of A & B: " + result);
                break;
            case '*':
                result = a*b;
                System.out.println("Mul of A & B: " + result);
                break;
            case '/':
                result = a/b;
                System.out.println("Div of A & B: " + result);
                break;

        }
        
    }
}