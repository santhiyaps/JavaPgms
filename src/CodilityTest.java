import java.util.HashMap;
import java.util.Map;

public class CodilityTest {

    static int gcd(int n, int d) {
        if (d == 0)
            return n;
        return gcd(d, n % d);
    }
    public static int solution(int[] A, int[] B) {
        int count = 0, modulous = 1000000007;
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(int i=0; i<A.length;i++) {
            int numerator = A[i];
            int denominator = B[i];

            int gcd = gcd(numerator, denominator);
            numerator = numerator/gcd;
            denominator = denominator/gcd;

            String expectedString = (denominator-numerator)+"-"+denominator;
            if(map.containsKey(expectedString)) {
                count = (count + map.get(expectedString))%modulous;
            }
            String currentString = numerator+"-"+denominator;
            map.put(currentString, (map.getOrDefault(currentString, 0) + 1)%modulous);
        }

        return count;
    }

    public static void main(String[] args) {
        int a[]={1,2,3,1,2,12,8,4};
        int b[]={5,10,15,2,4,15,10,5};
        System.out.println(solution(a,b));
    }
}
