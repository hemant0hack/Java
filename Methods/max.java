
import java.util.Scanner;


class max{
    static int  maxofthree(int a,int b,int c) {
        if(a>b && a>c){
            return a;
        }else if(b>a && b>a){
            return b;
        }else{
            return c;
        }
    } 
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 3 value to check max Of Three:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(maxofthree(a,b,c));
    }
}