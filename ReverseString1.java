import java.util.Scanner;

public class ReverseString1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your String");
        String str = in.nextLine();
        char charArray[] = str.toCharArray();
        String reverse = "";
        for (int i = charArray.length - 1; i >= 0; --i) {
            reverse = reverse + charArray[i];
        }
        System.out.println(reverse);
    }

     static String reverse(String str)
    {
        String s1="";
        for(int i=str.length();i>=0;i--)

            s1+=str.charAt(i);
        return s1;
    }
}
