public class StringToInteger {

    public int myAtoi(String str) {
        boolean foundDigit = false,signFound=false;
        if(str.equals("")) return 0;
        int returnInt = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isWhitespace(str.charAt(i)) || Character.isDigit(str.charAt(i)) || str.charAt(i) == '-' || str.charAt(i)=='+') {
                if(str.charAt(i)=='-' || str.charAt(i)=='+'){
                    if(foundDigit) return 0;
                    signFound=true;
                    if(i-1>=0){
                        if(str.charAt(i-1)=='-'|| str.charAt(i-1)=='+')
                            return 0;
                    }
                }
                if (Character.isDigit(str.charAt(i)))
                    foundDigit = true;
                if(Character.isWhitespace(str.charAt(i))){
                    if(foundDigit) {
                        str = str.substring(0, i);
                        break;
                    }else if(signFound){
                        return 0;
                    }
                }
            } else if (foundDigit) {
                str = str.substring(0, i);
                break;
            } else
                return 0;
        }
        if (foundDigit && returnInt == 0) {
            try {
                str=str.replace(" ","");
                returnInt = Integer.parseInt(str.trim());
            } catch (Exception e) {
                if(str.startsWith("-"))
                    return Integer.MIN_VALUE;
                return Integer.MAX_VALUE;
            }
        }
        return returnInt;
    }

    public static void main(String[] args) {
        System.out.println(new StringToInteger().myAtoi("      -11919730356x"));
    }
}
