public class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        int balance=0;
        for(int i:bills){
            if(i==5){
                balance+=i;
            }else if(i>5){
                if(balance<i-5)
                    return false;
                balance-=i-5;
                balance+=5;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new LemonadeChange().lemonadeChange(new int[]{10,10}));
    }
}
