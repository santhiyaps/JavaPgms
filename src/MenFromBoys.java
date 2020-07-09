

import java.util.*;

public class MenFromBoys {
    public static int[] menFromBoys(final int[] values) {
        Set<Integer>menSet = new TreeSet();
        Set<Integer> boySet = new TreeSet(Collections.reverseOrder());
        for (int n : values) {
            if (n % 2 == 0)
                menSet.add(n);
            else
                boySet.add(n);

        }
        List<Integer> combine=new ArrayList();
        combine.addAll(menSet);
        combine.addAll(boySet);
        int []finalArray=combine.stream().mapToInt(Integer::intValue).toArray();
        return finalArray ;
    }

    public static void main(String[] args) {
        System.out.println(menFromBoys(new int[]{2, 15, 17, 15, 2, 10, 10, 17, 1, 1}));
    }
}

