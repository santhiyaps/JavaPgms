

import java.util.Arrays;

public class PartsOfList {
    public static String[][] partlist(String[] arr) {
        int len= arr.length;
        String[][]parts=new String[len-1][2];
        String firstString="";
        for(int i=0;i<len-1;i++)
        {
            parts[i][0]=String.join(" ", Arrays.copyOfRange(arr,0,i+1));
            parts[i][1]=String.join(" ", Arrays.copyOfRange(arr,i+1,arr.length));

        }
        return parts;
    }

    public static void main(String[] args) {

       String []s1 = new String[] {"cdIw", "tzIy", "xDu", "rThG"};
        System.out.println(Arrays.deepToString(partlist(s1)));
    }
}
