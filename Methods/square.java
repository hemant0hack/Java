
import java.util.Scanner;

class square{
    static int  square(int n) {
        return n*n;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // User Input
        System.out.print("Enter number to become square:");
        int num = sc.nextInt();

        System.out.println(square(num));
    }
}