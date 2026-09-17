
import java.util.Scanner;

class marks{
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Length of Array : ");
        int n = input.nextInt();

        int marks[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number index no. "+ i + ":" );
            marks[i] = input.nextInt();
        }
        
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i]+" ");
        }
    }
}