
import java.util.Scanner;

public class greatest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int greatest = 1;
        
        for (int i = 1 ; i < n; i++) {
            if(n % i == 0){
                greatest = i;
            }
        }System.out.println(greatest);
    }   
}