
import java.util.Scanner;

class prime{
    static boolean  prime(int n ) {
        if (n < 2){
            return false;
        }

        for (int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }

        return  true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(prime(n)){
            System.out.println("prime");
            System.out.println(prime(n));
        }else{
            System.out.println("Not prime");
            System.out.println(prime(n));
        }
    }
}