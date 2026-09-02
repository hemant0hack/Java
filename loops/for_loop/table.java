import java.util.Scanner;

class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Table number : ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int table = n * i;
            System.out.println(n + " x " + i + " = " + table);
        }
    }
}