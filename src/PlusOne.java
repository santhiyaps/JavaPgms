import java.util.ArrayList;
import java.util.List;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        List<Integer> digitList=new ArrayList();
        int carry=0,a=0;
        for(int i=digits.length-1;i>=0;i--){
            a=0;
            if(i==digits.length-1){
                a=digits[i]+1;
            }else{
                a=digits[i]+carry;
            }
            if(a>9){
                carry=1;
                digitList.add(0);
            }else{
                carry=0;
                digitList.add(a);
            }
        }
        if(carry==1){
            digitList.add(1);
        }
        int newArr[]=new int[digitList.size()];
        int k=0;
        for(int i=digitList.size()-1;i>=0;i--){
            newArr[k]=digitList.get(i);
            k++;
        }
        return newArr;
    }
}
