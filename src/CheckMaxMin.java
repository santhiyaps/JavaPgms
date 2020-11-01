public class CheckMaxMin {
    public static void maxMin(int[] arr) {
        int newArr[]=new int[arr.length-1];
        int i=0,j=arr.length-1,k=0;
        while(i<j){
            newArr[k++]=arr[j--];
            newArr[k++]=arr[i++];
        }
        for(int s : newArr){
            System.out.print(s+" ");
        }
        for(int n=0;n<arr.length-1;n++){
            arr[n]=newArr[n];
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        maxMin(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
