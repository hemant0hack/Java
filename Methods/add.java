public class add{
    public static void add(int a , int b) {
        System.out.println(a + b);
    }
    public static int add2(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        add(10,20);
        System.out.println(add2(15, 5));
    }

}