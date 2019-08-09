public class longestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==1)
            return strs[0];
        String sub ="";
       for(int i=0;i<strs.length-1;i++)
       {
           sub=findSub(strs[i],strs[i+1],sub);
           if(sub.equals(""))
               return "";
       }
        return sub;
    }

    public static String findSub(String str1, String str2,String sub) {
        String prefix="";
       for(int i=0,j=0;i<str1.length()&&j<str2.length();i++,j++)
       {
           if(str1.charAt(i)!=str2.charAt(j))
               break;
           prefix+=str1.charAt(i);
       }
       if(sub!=""&&(prefix.length()>=sub.length()))
           return sub;
       else
           return prefix;


    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"acc","aaa","aaba"}));

    }
}
