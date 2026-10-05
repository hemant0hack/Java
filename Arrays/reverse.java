class reverse{
    // public static void main(String[] args) {
    //     String str = "Apple";
    //     String rev = " ";

    //     for (int i= str.length()-1; i >=0; i--){
    //         rev += str.charAt(i); 
    //     }
    //     System.out.println(rev);
    // }
    public static void main(String[] args) {
        String str = "Apple";
        char arr[] = str.toCharArray();

        int left = 0;
        int right = str.length()-1;

        while(left<right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left ++;
            right--;
        } 
        System.out.println(arr);
    }
}