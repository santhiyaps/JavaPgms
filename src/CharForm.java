class Solution {
    public int countCharacters(String[] words, String chars) {
        int []charArr=new int[26];
        int sum=0;
        for(char c:chars.toCharArray()){
            charArr[c-'a']++;
        }
        for(String s:words){
            int b[]=recreate(charArr);
            sum=0;
            boolean found=false;
            for(char c:s.toCharArray()){
                if(b[c-'a']>0){
                    b[c-'a']--;
                }else{
                    found=false;
                    break;
                }
                found=true;
            }
            if(found){
                sum+=s.length();
            }
        }
        return sum;
    }
    public int[] recreate(int[]a){
        int b[]=new int[a.length];
        for(int i=0;i<a.length;i++){
            b[i]=a[i];
        }
        return b;
    }
}