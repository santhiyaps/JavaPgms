public class MinLength {
    public int minLength(String s){
        int moves=0;
        for(int i=0;i<s.length();i++){
            int charlength=1;
            for(;i+1<s.length()&& s.charAt(i)==s.charAt(i+1);++i){
                charlength++;
            }
            moves+=charlength/3;
        }
        return moves;
    }
    public int solution(int[] A) {
        // write your code in Java SE 8
        int n=A.length;
        boolean check[]=new boolean[n+1];
        for(int i=0;i<n;i++){
            if(A[i]>0 && A[i]<=n){
                check[A[i]]=true;
            }
        }
        for(int i=1;i<=n;i++){
            if(!check[i])
                return i;
        }
        return n+1;

    }

    public static void main(String[] args) {
        System.out.println(new MinLength().solution(new int[]{1,3,6,4,1,2}));
    }
}
