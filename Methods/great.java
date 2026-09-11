class great{
    static void great(String name, int age) {
        System.out.println("Hello"+ name + age);
        }
    static int sumOfTwo(int a, int b) {
        return a+b;
    }
    
    public static void main(String[] args) {
        great(" Hemant ",20);
        int sum = sumOfTwo(10, 20);
        System.out.println(sum);
    }
}