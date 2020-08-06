public class WordDictionary {

    /** Initialize your data structure here. */
    class TrieNode {
        boolean isWord = false;
        TrieNode[] children = new TrieNode[26];
    }
    TrieNode root = null;
    public WordDictionary() {
        root = new TrieNode();
    }

    /** Adds a word into the data structure. */
    public void addWord(String word) {
        TrieNode temp = root;
        for (char c : word.toCharArray()) {
            if (temp.children[c - 'a'] == null) {
                temp.children[c - 'a'] = new TrieNode();
            }
            temp = temp.children[c - 'a'];
        }
        temp.isWord = true;
    }

    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        return search(word, 0, root);
    }
    private boolean search(String word, int index, TrieNode node) {
        if(node == null) return false;
        TrieNode temp = node;
        if (index == word.length()) {
            return temp.isWord;
        }
        char c = word.charAt(index);
        if (c == '.') {
            for (int i = 0; i < 26; i++)
                if (search(word, index + 1, temp.children[i])) {
                    return true;
                }
        }
        else {
            if (search(word, index + 1, temp.children[c - 'a'])) return true;
        }
        return false;
    }
}


/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */