public class LongestPalindromicSubString {
    public String longestPalindrome(String s) {
        if(s.length()>0) {
            int longestArr[] = {0, 1};
            for (int i = 1; i < s.length(); i++) {
                int odd[] = findPalindrome(i - 1, i + 1, s);
                int even[] = findPalindrome(i - 1, i, s);
                int[] currLongest = odd[1] - odd[0] > even[1] - even[0] ? odd : even;
                longestArr = currLongest[1] - currLongest[0] > longestArr[1] - longestArr[0] ? currLongest : longestArr;
            }
            return s.substring(longestArr[0], longestArr[1]);
        }
        return s;

    }
    public int[] findPalindrome(int leftIndex,int rightIndex,String str){
        while(leftIndex>=0 && rightIndex<str.length()){
            if(str.charAt(leftIndex)!=str.charAt(rightIndex))
                break;
            leftIndex--;
            rightIndex++;

        }
        return new int[]{leftIndex+1,rightIndex};

    }

    public static void main(String[] args) {
//        System.out.println(new LongestPalindromicSubString().longestPalindrome("ababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababab" +
//                "ababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababa"));
        System.out.println(new LongestPalindromicSubString().longestPalindrome(""));
   }
}
