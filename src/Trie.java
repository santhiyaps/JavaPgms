import java.util.HashMap;
import java.util.Map;

public class Trie {

    TrieNode root=null;
    /** Initialize your data structure here. */
    public Trie() {
        root=new TrieNode();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode curr=root;
        for(char c:word.toCharArray()){
            curr=curr.getChildren().computeIfAbsent(c,l->new TrieNode());
        }
        curr.setEndOFWord(true);
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode curr=root;
        for(char c:word.toCharArray()){
            TrieNode node= curr.getChildren().get(c);
            if(node==null)
                return false;
            curr=node;
        }

        return curr.isEndofWord();

    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode curr=root;
        for(char c:prefix.toCharArray()){
            if(!curr.getChildren().containsKey(c))
                return false;
            curr=curr.getChildren().get(c);
        }
        return (curr!=null);
    }

    public static void main(String[] args) {
        Trie dict=new Trie();
        dict.insert("apple");
        System.out.println(dict.search("apple"));
    }
}

class TrieNode{
    private Map<Character,TrieNode> children=new HashMap();
    private boolean endOfWord=false;
    Map<Character,TrieNode> getChildren(){
        return children;
    }
    void setEndOFWord(boolean endOfWord){
        endOfWord=endOfWord;
    }
    boolean isEndofWord(){
        return endOfWord;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */