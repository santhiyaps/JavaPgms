import java.util.ArrayList;
import java.util.*;
import java.util.regex.Pattern;

public class ReorderLogFiles {
    public static String[] reorderLogFiles(String[] logs) {
        String[] resultArr=new String[logs.length];
        boolean[] digitList=new boolean[logs.length];
        int index=0;
        for(int i=0;i<logs.length;i++){
            if(Character.isDigit(logs[i].charAt(logs[i].length()-1))){
                digitList[i]=true;
            }else{
                resultArr[index++]=logs[i];
            }
        }
        Arrays.sort(resultArr,0,index,(a,b)->{
            String []a1=a.split(" ",2);
            String []a2=b.split(" ",2);
            if(a1[1].compareTo(a2[1])==0)
                return a1[0].compareTo(a2[0]);
            return a1[1].compareTo(a2[1]);
        });
        for(int i=0;i<digitList.length;i++){
            if(digitList[i])
                resultArr[index++]=logs[i];
        }
        return resultArr;
    }

    public static void main(String[] args) {
        reorderLogFiles(new String[]{"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"});
    }
}
