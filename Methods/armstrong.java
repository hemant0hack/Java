class armstrong{
    static void main() {
        
        int n = 153;
        int temp = n;
        int sum = 0;

        while(temp> 0){
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp = temp / 10;
        }
        System.out.println(sum);

        if(sum==n){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
        
    }
}