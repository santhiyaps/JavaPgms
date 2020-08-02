import java.util.HashMap;

public class CowBull {

    public String getHint(String secret, String guess) {
        int bull=0;
        int cow=0;
        String guessLeft="";
        HashMap<Integer,Integer>charIndexMap=new HashMap();
        for(int i=0;i<secret.length();i++){
            int num=Character.getNumericValue(secret.charAt(i));
            int num1=Character.getNumericValue(guess.charAt(i));
            if(num==num1){
                bull++;

            }else{
                charIndexMap.put(num,charIndexMap.getOrDefault(num,0)+1);
                guessLeft+=guess.charAt(i);
            }
        }
        for(int j=0;j<guessLeft.length();j++){
            int num=Character.getNumericValue(guessLeft.charAt(j));
            if(charIndexMap.containsKey(num) && (charIndexMap.get(num)>0)){
                {
                    cow++;
                }
                charIndexMap.put(num,charIndexMap.getOrDefault(num,0)-1);
            }
        }
        String result=bull+"A"+cow+"B";
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new CowBull().getHint("1122","2211"));
    }
}
