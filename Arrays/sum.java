class sum{
    public static void main(String[] args) {
        int[]  arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int sum = 0;

        for(int x : arr){
            sum += x;
        }
        System.out.println("Sum = " + sum);
    }
}