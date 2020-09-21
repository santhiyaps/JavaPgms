import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
     List<String>parenthesisList=new ArrayList<>();
     helper(parenthesisList,n,0,0,"");
     return  parenthesisList;
    }

    public void helper(List<String>list,int n,int left, int right,String curr){
        if(curr.length()==n*2){
            list.add(curr);
            return;
        }
        if(left<n)  helper(list,n,left+1,right,curr+"(");
        if(right<left)  helper(list,n,left,right+1,curr+")");
    }

    public static void main(String[] args) {
        List<String> list=new GenerateParenthesis().generateParenthesis(3);
        for(String s:list){
            System.out.println(s);
        }
    }


}
