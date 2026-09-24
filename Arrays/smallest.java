class smallest{
    public static void main(String[] args) {
        int[] arr = {10, 25, 5, 40, 15};
        int min = arr[0];

        for(int x : arr){
            if(x < min){
                min = x;
            }
        }
        System.out.println("Smallest = " + min);
    }
}