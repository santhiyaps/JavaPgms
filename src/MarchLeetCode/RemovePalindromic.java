package MarchLeetCode;

public class RemovePalindromic {
    public int removePalindromeSub(String s) {
        if(s.isEmpty()){
            return 0;
        }
        StringBuilder sb=new StringBuilder(s);
        String reverseS= sb.reverse().toString();
        if(reverseS.equals(s))
            return 1;
        return 2;
    }
}
