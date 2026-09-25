class evenodd{
    public static void main(String[] args) {
        // count even or odd values
        
        int[] arr = {10, 15, 20, 25, 30, 35};
        
        int even = 0, odd = 0;

        for(int x : arr){
            if(x % 2 == 0)
                even++;
            else
                odd++;
        }
        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);
    }
}