import java.util.List;

public class BetaTesting {

    public static int findMinComplexity(List<Integer> complexity, int days) {
        if(complexity==null || complexity.size()==0) return 0;

        if(complexity.size()<days) return -1;

        int n=complexity.size();

        int [][] dp=new int[n+1][days+1];
        int max=0;
        for(int i=1;i<=n;i++){
            max=Math.max(max, complexity.get(i-1));
            dp[i][1]=max;
        }

        for(int j=2;j<=days;j++){
            for(int i=j;i<=n;i++){
                int maxComplexity=0;
                int min=Integer.MAX_VALUE;
                for(int row=i;row>j-1;row--){
                    maxComplexity=Math.max(complexity.get(row-1),maxComplexity);
                    min=Math.min(min,maxComplexity+dp[row-1][j-1]);
                }
                dp[i][j]=min;
            }
        }

        return dp[n][days];
    }

}
