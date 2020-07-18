import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MinIndex {
    public static String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> commonInterest=new HashMap();
        int minIndex=Integer.MAX_VALUE;
        List<String> interestList=new ArrayList();
        for(int i=0;i<list1.length;i++){
            commonInterest.put(list1[i],i);
        }
        for(int i=0;i<list2.length;i++){
            if(commonInterest.containsKey(list2[i]))
            {
                if(commonInterest.get(list2[i])+i<minIndex){
                    minIndex=commonInterest.get(list2[i])+i;
                    if(!interestList.isEmpty()) {
                        interestList.remove(0);
                    }
                    interestList.add(list2[i]);
                } else if(commonInterest.get(list2[i])+i==minIndex){
                minIndex=commonInterest.get(list2[i])+i;
                interestList.add(list2[i]);
                 }
                else{
                    break;
                }
            }
        }
        String[] returnArr=new String[interestList.size()];
        int k=0;
        for(String s:interestList){
            returnArr[k]=s;
            k++;
        }
        return returnArr;
    }

    public static void main(String[] args) {
        findRestaurant(new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"},new String[]{"KFC", "Shogun", "Burger King"});
    }
}
