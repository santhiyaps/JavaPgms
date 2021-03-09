package MarchLeetCode;

import java.util.HashMap;
import java.util.Map;

public class Strobogrammatic {
    public boolean isStrobogrammatic(String num) {
        Map<Character,Character> charMap=new HashMap(Map.of('0', '0', '1', '1', '6', '9', '8', '8', '9', '6'));
        StringBuilder sb=new StringBuilder();
        for(int i=num.length()-1;i>=0;i--){
            char c=num.charAt(i);
            if(charMap.containsKey(c)){
                sb.append(charMap.get(c));
            }else
                return false;
        }
        if(sb.toString().equals(num))
            return true;
        return false;

    }
}
