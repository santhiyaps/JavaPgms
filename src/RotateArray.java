public class RotateArray {
    String name;

    public static void rotateArray(int[] arr){
        int lastElement=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            System.out.println(i);
            System.out.println(arr[i]+""+arr[i-1]);
            arr[i]=arr[i-1];
        }
        arr[0]=lastElement;

    }

    public static void main(String[] args) {

        int [] arr={1,2,3,4,5};
        rotateArray(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
