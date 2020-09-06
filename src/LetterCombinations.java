import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {
    public List<String> letterCombinations(String digits) {
        List<String>combinations=new ArrayList<>();
        if(digits.equals("")){
            return combinations;
        }
        String mappings[]={"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        letterCombinationsHelper(mappings,"",0,combinations,digits);
        return  combinations;
    }
    public void  letterCombinationsHelper(String[]mappings,String curr,int index,List<String>combinations,String digits){
        if(index==digits.length()){
            combinations.add(curr);
            return;
        }
        String letters=mappings[digits.charAt(index)-'0'];
        for(int i=0;i<letters.length();i++){
            letterCombinationsHelper(mappings,curr+letters.charAt(i),index+1,combinations,digits);
        }
    }
}
