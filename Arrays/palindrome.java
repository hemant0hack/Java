class palindrome{
    public static void main(String[] args) {
        String str = "Apple";
        char arr[] = str.toCharArray();

        int left = 0;
        int right = str.length()-1;

        boolean palindrome = true;

        while(left<right){
            if(arr[left] != arr[right]){
                palindrome = false;
                break;
            }
            left ++;
            right --;
    
        }
        System.out.println(palindrome);
    }

}