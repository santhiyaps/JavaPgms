public class DetectCapitalUse {
    public boolean detectCapitalUse(String word) {
     for(int i=0;i<word.length();i++){
         if(i-1>=0){
            if(i-1!=0 ){
               if(!Character.isUpperCase(word.charAt(i)) && Character.isUpperCase(word.charAt(i-1))) {
                   return false;
               }else if(Character.isUpperCase(word.charAt(i)) && !Character.isUpperCase(word.charAt(i-1)))
                   return false;
            }else{
                if(Character.isUpperCase(word.charAt(i)) && !Character.isUpperCase(word.charAt(i-1))) {
                    return false;
                }
            }
         }
     }
     return true;
    }

    public static void main(String[] args) {
        System.out.println(new DetectCapitalUse().detectCapitalUse("mL"));
        System.out.println(new DetectCapitalUse().detectCapitalUse("leEtcode"));
        System.out.println(new DetectCapitalUse().detectCapitalUse("Google"));
    }
}
