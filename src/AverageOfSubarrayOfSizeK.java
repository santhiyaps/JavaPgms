import java.util.Arrays;

public class AverageOfSubarrayOfSizeK {
    public static double[] findAverages(int K, int[] arr) {
        int start=0;
        int end=0;
        double[] avgArr=new double[arr.length-K+1];
        double sum=0;
        while(start<arr.length){
            sum+=arr[start];
            if(start-end>=K-1){
                double i=sum/K;
                avgArr[end]=i;
                sum-=arr[end];
                end++;
            }
            start++;
        }
        return avgArr;
    }

    public static void main(String[] args) {
        double[] result = AverageOfSubarrayOfSizeK.findAverages(5, new int[] { 1, 3, 2, 6, -1, 4, 1, 8, 2 });
        System.out.println("Averages of subarrays of size K: " + Arrays.toString(result));
    }
}
