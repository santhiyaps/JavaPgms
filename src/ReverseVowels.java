import java.util.HashSet;
import java.util.Set;

public class ReverseVowels {
    public String reverseVowels(String s) {
        Set<Character> vowelSet=new HashSet();
        vowelSet.add('a');
        vowelSet.add('e');
        vowelSet.add('i');
        vowelSet.add('o');
        vowelSet.add('u');
        char a[]=s.toCharArray();
        int i=0,j=a.length-1;
        while(i<j){
            if(vowelSet.contains(a[i]) && vowelSet.contains(a[j])){
                char c=a[i];
                a[i]=a[j];
                a[j]=c;
                i++;
                j--;
            }else if(vowelSet.contains(a[i])){
                j--;
            }else if(vowelSet.contains(a[j]))
                i++;
            else {
                i++;
                j--;
            }
        }
        return new String(a);
    }

    public static void main(String[] args) {
        System.out.println(new ReverseVowels().reverseVowels("hello"));
    }
}
