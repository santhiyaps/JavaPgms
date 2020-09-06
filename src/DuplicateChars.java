public class DuplicateChars {
    public boolean hasDuplicates(String word){
        int[]charNums=new int[26];
        for(char c:word.toCharArray()){
            charNums[c-'a']++;
        }
        for(int i: charNums){
            if(charNums[i]>1)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new DuplicateChars().hasDuplicates("great"));
    }

}
