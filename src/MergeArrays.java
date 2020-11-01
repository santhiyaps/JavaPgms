public class MergeArrays {
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
       int[] resultantArray=new int[arr1.length+arr2.length];
       int i=0,j=0,k=0;
       while(i<arr1.length && j<arr2.length){
           if(arr1[i]<arr2[j])
               resultantArray[k++]=arr1[i++];
           else
               resultantArray[k++]=arr2[j++];
       }
       while(i<arr1.length){
           resultantArray[k++]=arr1[i++];
       }
        while(j<arr2.length){
            resultantArray[k++]=arr2[j++];
        }
        return resultantArray;

    }

    public static void main(String[] args) {
        int[] arr1 = {1,12,14,17,23}; // creating a sorted array called arr1
        int[] arr2 = {25,26,27};  // creating a sorted array called arr2

        int[] resultantArray = mergeArrays(arr1, arr2); // calling mergeArrays

        System.out.print("Arrays after merging: ");
        for(int i = 0; i < arr1.length + arr2.length; i++) {
            System.out.print(resultantArray[i] + " ");
        }
    }
}
