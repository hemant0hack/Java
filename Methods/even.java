
import java.util.Scanner;

class even{
    static boolean  even(int n) {
        return n%2==0;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num. to check even or odd..!?");
        int num = sc.nextInt();

        System.out.println(even(num));
    }
}