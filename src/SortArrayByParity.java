public class SortArrayByParity {
    public int[] sortArrayByParity(int[] A) {
        if(A.length==1) return A;
        int []sortArr=new int[A.length];
        int element=0;
        int startArr=0,endArr=sortArr.length-1;
        for(int i=0;i<A.length;i++){
            element=A[i];
            if(element%2==0){
                sortArr[startArr]=element;
                startArr++;
            }else{
                sortArr[endArr]=element;
                endArr--;
            }
        }
        return sortArr;
    }

    public static void main(String[] args) {
        new SortArrayByParity().sortArrayByParity(new int[]{3,1,2,4});
    }
}
