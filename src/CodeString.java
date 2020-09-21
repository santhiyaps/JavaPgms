public class CodeString {
    public static void main(String[] args) {
        String str="copexxcode";
        int count=0;
        for(int i=0;i<str.length()-3;i++){
            System.out.println(str.substring(i,i+4));
            if(str.substring(i,i+4).matches("co[a-z]e")){
                count++;
            }
        }
        System.out.println(count);
    }
}
