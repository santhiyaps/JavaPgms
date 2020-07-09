

public class ReverseInteger {

        public static int reverse(int x) {
            long y=x;
            long reverse=0;
            long i=0;
            if(x < 0){
                x = 0 - x;
            }
            while(y!=0)
            {
                i=y%10;
                reverse=reverse*10+i;
                y/=10;
            }
            if(reverse>Integer.MAX_VALUE|| reverse<Integer.MIN_VALUE)
                return 0;

            return (int)reverse;
        }

    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }
}
