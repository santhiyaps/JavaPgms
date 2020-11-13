import java.util.HashSet;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> charSet=new HashSet();
        int start=0,end=0,max=0;
        while(end<s.length()){
            if(charSet.contains(s.charAt(end))){
                charSet.remove(s.charAt(start));
                start++;
            }else{
                charSet.add(s.charAt(end));
                end++;
                max=Math.max(max,end-start);

            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new LongestSubstring().lengthOfLongestSubstring("pwwkew"));
    }
}
