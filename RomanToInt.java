public class RomanToInt {

    int value(char r)
    {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return 0;
    }
    public  int romanToInt(String s) {
        int num = 0;
        for (int i=0;i<s.length();i++) {
            int r=value(s.charAt(i));
            if(i+1<s.length())
            {
                int n=value(s.charAt(i+1));
                if(n>r)
                {
                    num=num+n-r;
                    i++;
                }else
                {
                    num=num+r;

                }
            }else
            {
                num+=r;
                i++;
            }


        }
        return num;
    }

    public static void main(String[] args) {
        RomanToInt romanToInt=new RomanToInt();
        System.out.println(romanToInt.romanToInt("III"));
    }
    /*
    Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
     */

}
