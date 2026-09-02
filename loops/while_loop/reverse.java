
import java.util.Scanner;

public class reverse{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter no. to become reverse: ");
        int n = input.nextInt();
        int rev = 0;
        while (n != 0){
            int lastdigit = n%10;
            rev = rev * 10 + lastdigit;
            n = n / 10;
        }
        System.out.println(rev);
    }
}