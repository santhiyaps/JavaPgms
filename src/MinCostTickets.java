import java.util.Arrays;

public class MinCostTickets {
    public int mincostTickets(int[] days, int[] costs) {
        boolean[] isTravelDays=new boolean[366];
        for(int i:days){
            isTravelDays[i]=true;
        }
        int[] dp=new int[366];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for(int i=1;i<366;i++){
            if(!isTravelDays[i]){
                dp[i]=dp[i-1];
                continue;
            }
            dp[i]=Math.min(dp[i],dp[i-1]+costs[0]);
            if(i-7>=0){
                dp[i]=Math.min(dp[i],dp[i-1]+costs[1]);
            }else{
                dp[i]=Math.min(dp[i],costs[1]);
            }
            if(i-30>=0){
                dp[i]=Math.min(dp[i],dp[i-1]+costs[2]);
            }else{
                dp[i]=Math.min(dp[i],costs[2]);
            }

        }
        return dp[365];
    }

    public static void main(String[] args) {
        System.out.println(new MinCostTickets().mincostTickets(new int[]{1,4,6,7,8,20},new int[]{2,7,15}));
    }
}
