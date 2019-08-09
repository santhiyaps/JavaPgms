public class Palindrome {
    public static boolean isPalindrome(int x) {
        int i=0;
        int reverse=0;
        int y=x;
        boolean isSame=false;
        if(y<0)
            return false;
        while(y!=0)
        {
            i=y%10;
            reverse=reverse*10+i;
            y/=10;
        }
        if(x==reverse)
            isSame= true;
        return isSame;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}
