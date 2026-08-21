import java.util.Scanner;

public class int_var{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter Number: "); //  for Int
    int a = input.nextInt();
    int b = input.nextInt();
    
    boolean c = a == b;
    boolean d = a != b;
    boolean e = a < b;
    boolean f = a > b;
    boolean g = a >= b;
    boolean h = a <= b;


    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
    System.out.println(f);
    System.out.println(g);
    System.out.println(h);

    input.close();
    }    
}