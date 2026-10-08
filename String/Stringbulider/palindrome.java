
class palindrome{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("nitin");

        // String rev = sb.reverse();

        if(sb.equals(sb.reverse())){
            System.out.println("palindrome");
        }else{
            System.out.println(" Not palindrome");
        }

        // System.out.println(palindrome);
        System.out.println(sb);
    }
}