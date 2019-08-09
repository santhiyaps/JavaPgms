import java.util.ArrayList;
import java.util.List;

public class ValidParenthesis {
    public static boolean isValid(String s) {
        boolean valid=false;
        if(s.equals(""))
            return true;
        char charArray[]=s.toCharArray();
        List<Character> parenthesis= new ArrayList<Character>();
        for(int i=0;i<charArray.length;i++)
        {
            char c=charArray[i];
            if(c=='{'|c=='['|c=='(')
                parenthesis.add(c);
            else if(c=='}' && parenthesis.size()>0 && parenthesis.get(parenthesis.size()-1)=='{')
                parenthesis.remove(parenthesis.size()-1);
            else if(c==']' && parenthesis.size()>0 && parenthesis.get(parenthesis.size()-1)=='[')
                parenthesis.remove(parenthesis.size()-1);
            else if(c==')' && parenthesis.size()>0 && parenthesis.get(parenthesis.size()-1)=='(')
                parenthesis.remove(parenthesis.size()-1);
            else
                return false;
            }
           if(parenthesis.isEmpty())
               valid=true;
            return valid;
    }

    public static void main(String[] args) {
        System.out.println(isValid("{[]}"));
    }
}
