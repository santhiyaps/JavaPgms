import java.util.*;

public class WordLadder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet=new HashSet(wordList);
        if(!wordSet.contains(endWord))return 0;
        Queue<String> queue=new LinkedList();
        queue.add(beginWord);
        Set<String>visited=new HashSet();
        visited.add(beginWord);
        int count=1;
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                String word=queue.poll();
                if(word.equals(endWord))return count;
                for(int j=0;j<word.length();j++){
                    for(int k='a';k<='z';k++){
                        char[]charArray=word.toCharArray();
                        charArray[j]=(char)k;
                        String s=new String(charArray);
                        if(wordSet.contains(s) && !visited.contains(s)){
                            queue.add(s);
                            visited.add(s);
                        }
                    }
                }
            }
            count++;
        }
        return 0;
    }



    public static void main(String[] args) {
        System.out.println(new WordLadder().ladderLength("hit","cog",Arrays.asList(new String[]{"hot","dot","dog","lot","log","cog"})));
    }
}
