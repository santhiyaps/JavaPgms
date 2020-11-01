import java.util.Arrays;
import java.util.List;

public class Missing {
        static int find_missing(List<Integer> input) {
            int n=input.size()+1;
            int originalSum=(n * (n+1))/2;
            int currSum=0;
            for(int i:input){
                currSum+=i;
            }
            return originalSum-currSum;
        }

    public static void main(String[] args) {
        System.out.println(find_missing(Arrays.asList(6, 3, 1, 2, 5, 4, 8)));
    }
}
