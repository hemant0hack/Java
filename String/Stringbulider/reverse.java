import java.util.Scanner;

class reverse{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        
        StringBuilder sb = new StringBuilder(str);

        sb.reverse();
        System.out.println(sb);
    }
}