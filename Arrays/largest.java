class largest{
    public static void main(String[] args) {
        int[] arr = {10, 25, 5, 40, 15};
        int max = arr[0];

        for(int x : arr){
            if (x > max){
                max = x ;
            }
        }
        System.out.println("Largest = " + max);
    }
}