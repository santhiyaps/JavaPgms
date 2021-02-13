package graph;

import java.util.*;

public class AlienDictionary {
    public String alienOrder(String[] words) {
        Map<Character, List<Character>> adjList=new HashMap();
        Map<Character,Integer>countMap=new HashMap();
        Queue<Character>queue= new Queue<>(26);
        for(String word:words){
            for(int i=0;i<word.length();i++){
                adjList.put(word.charAt(i),new ArrayList<Character>());
                countMap.put(word.charAt(i),0);
            }
        }
        for(int i=0;i<words.length-1;i++){
            String word1=words[i];
            String word2=words[i+1];

            if(word1.length()>word2.length() && word1.startsWith(word2)){
                return "";
            }
            int len=Math.min(word1.length(),word2.length());
            for(int j=0;j<len;j++){
                if(word1.charAt(j)!=word2.charAt(j)){
                    adjList.get(word1.charAt(j)).add(word2.charAt(j));
                    countMap.put(word2.charAt(j),countMap.get(word2.charAt(j))+1);
                    break;
                }
            }
        }

        for(Character c:countMap.keySet()){
            if(countMap.get(c)==0){
                queue.enqueue(c);
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!queue.isEmpty()){
            Character c=queue.dequeue();
            sb.append(c);
            for(Character next:adjList.get(c)){
                countMap.put(next,countMap.get(next)-1);
                if(countMap.get(next)==0)
                    queue.enqueue(next);
            }
        }

        if(sb.length()!=countMap.size())
            return "";

        return sb.toString();


    }

    public static void main(String[] args) {
        AlienDictionary alienDictionary=new AlienDictionary();
        String []words={"z","x"};
        System.out.println(alienDictionary.alienOrder(words));
    }
}
