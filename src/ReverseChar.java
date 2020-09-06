public class ReverseChar {
    public String reverseOnlyLetters(String S) {
        char []cArr=S.toCharArray();
        int start=0,end=cArr.length-1;
        while(start<end){
            char s=cArr[start];
            char e=cArr[end];
            if(Character.isAlphabetic(s) && Character.isAlphabetic(e)){
                cArr[start]=e;
                cArr[end]=s;
                start++;
                end--;
            }else if(Character.isAlphabetic(s)){
                end--;
            }else if(Character.isAlphabetic(e)){
                start++;
            }
        }
        String newS="";
        for(char c:cArr){
            newS+=c;
        }
        return newS;
    }

    public static void main(String[] args) {
        System.out.println(new ReverseChar().reverseOnlyLetters("ab-cd"));
    }
}
