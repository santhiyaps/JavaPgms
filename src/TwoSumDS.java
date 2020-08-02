import java.util.ArrayList;
import java.util.List;

public class TwoSumDS {

        List<Integer> sumFind;
        /** Initialize your data structure here. */
        public TwoSumDS() {
            sumFind=new ArrayList();
        }

        /** Add the number to an internal data structure.. */
        public void add(int number) {
            sumFind.add(number);
        }

        /** Find if there exists any pair of numbers which sum is equal to the value. */
        public boolean find(int value) {
            if(sumFind.size()>1){
                for(int i:sumFind){
                    System.out.println(value-i);
                    if(sumFind.contains(value-i)){
                        return true;
                    }
                }
            }
            return false;
        }

    public static void main(String[] args) {
            TwoSumDS twoSumDS=new TwoSumDS();
            twoSumDS.add(3);
            twoSumDS.add(2);
            twoSumDS.add(1);
            System.out.println(twoSumDS.find(2));


    }
}


