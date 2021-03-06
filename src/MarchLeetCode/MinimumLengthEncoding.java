package MarchLeetCode;

import java.util.Arrays;
import java.util.HashSet;

public class MinimumLengthEncoding {
    public int minimumLengthEncoding(String[] words) {
        HashSet<String> wordSet=new HashSet<String>(Arrays.asList(words));
        for(String word:words){
            for(int i=1;i<word.length();i++){
                wordSet.remove(word.substring(i));
            }
        }
        int ans=0;
        for(String word:wordSet){
            ans+=word.length()+1;
        }
        return ans;
    }
}
