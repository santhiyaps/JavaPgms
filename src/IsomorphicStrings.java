import java.util.HashMap;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> charMap=new HashMap();
        int i=0;
        while(i<s.length()){
            char schar=s.charAt(i);
            char tchar=t.charAt(i);
            if(charMap.containsKey(schar) ){
                if( charMap.get(schar)!=tchar)
                        return false;
            }else{
                if(charMap.containsValue(tchar))
                    return false;
                charMap.put(schar,tchar);
            }
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg","add"));
    }
}
