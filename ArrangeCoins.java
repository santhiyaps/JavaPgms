public class ArrangeCoins {
    public int arrangeCoins(int n) {
        int num=n;
        int count=0;
        int k=1;
        while(num>0){
            num -=k;
            if(num>=0){
                count++;
            }
            ++k;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new ArrangeCoins().arrangeCoins(5));
    }
}
