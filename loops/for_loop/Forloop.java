import java.util.Scanner;

public class Forloop{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // System.out.print("Enter your num :");
        // int n = input.nextInt();

        // for (int i = 1; i <= n; i++){
        //     System.out.println(i);   
        // }

        // System.out.print("Enter your table num :");
        // int t = input.nextInt();  

        // for (int x=1; x<=10; x++){
        //     int table = t*x;
        //     System.out.println(t+"x"+x+"="+table);
        // }

        // System.out.print("Enter your num :");
        // int e = input.nextInt();  

        // for (int x=1; x<=e; x++){
        //     if (x%2==0)
        //     System.out.println(x);
        // }

        int num = input.nextInt();
        int rev = 0;
        while(num > 0){
            int lastdigit = num%10;
            rev = rev*10 +lastdigit;
            num = num/10;
             
            System.out.println(rev);
        }
    }
}