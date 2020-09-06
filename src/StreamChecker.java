import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

class TrieNodes{
    Map<Character,TrieNodes> children=new HashMap();
    boolean endOfWord=false;
}

public class StreamChecker {
    TrieNodes trie=new TrieNodes();
    Deque<Character>stream=new ArrayDeque<>();
    public  StreamChecker(String []words){
        for(String word:words){
            TrieNodes node=trie;
            String reversedWord=new StringBuilder(word).reverse().toString();
            for(char ch:reversedWord.toCharArray()){
                if(!node.children.containsKey(ch)){
                    node.children.put(ch,new TrieNodes());
                }
                node=node.children.get(ch);
            }
            node.endOfWord=true;
        }
    }
    public boolean query(char letter) {
        TrieNodes node=trie;
        stream.addFirst(letter);
        for(char ch:stream){
            if(node.endOfWord)
                return true;
            if(!node.children.containsKey(ch)){
                return false;
            }
            node=node.children.get(ch);
        }
        return node.endOfWord;
    }
}

