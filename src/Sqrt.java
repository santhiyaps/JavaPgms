

public class Sqrt {
    public static int nearestSq(final int n){
        int num=0;
        int i= (int) Math.sqrt(n);
        if(i*i==n)
            return n;
        if(n>1&&n%2>0)
           i++;
        return i*i;
    }
    public static void main(String[] args) {
        System.out.println(nearestSq(106929));
    }
}
