import java.util.Arrays;

public class SmallestElement {
    int solution(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;;
        Arrays.sort(A);
        Arrays.sort(B);
        int i = 0;
        for (int k = 0; k < n; k++) {
            while (i < m - 1 && B[i] < A[k])
                i += 1;
            if (A[k] == B[i])
                return A[k];
        }
        return -1;
    }
    public static void main(String[] args) {
        SmallestElement smallestElement=new SmallestElement();
        System.out.println(smallestElement.solution(new int[]{3,5,7,9},new int[]{1,2,4,7,10}));


    }
}
