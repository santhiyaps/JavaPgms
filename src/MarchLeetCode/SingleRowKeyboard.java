package MarchLeetCode;

public class SingleRowKeyboard {
    public int calculateTime(String keyboard, String word) {
        int[]keyArr=new int [26];
        for(int i=0;i<keyboard.length();i++){
            char c=keyboard.charAt(i);
            keyArr[c-'a']=i;
        }
        int prev=0;
        int time=0;
        for(char alp:word.toCharArray()){
            time+=Math.abs(prev-keyArr[alp-'a']);
            prev=keyArr[alp-'a'];
        }
        return time;
    }

    public static void main(String[] args) {
        System.out.println(new SingleRowKeyboard().calculateTime("abcdefghijklmnopqrstuvwxyz","cba"));
    }
}
