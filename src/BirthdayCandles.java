public class BirthdayCandles {
    static int birthdayCakeCandles(int[] ar) {
        int nos = 0;
        int max = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > max) {
                max = ar[i];
                nos = 1;
            } else if (ar[i] == max) {
                nos++;
            }
        }
        return nos;

    }

    public static void main(String[] args) {
    //16481469408
        System.out.println(repeatedString("epsxyyflvrrrxzvnoenvpegvuonodjoxfwdmcvwctmekpsnamchznsoxaklzjgrqruyzavshfbmuhdwwmpbkwcuomqhiyvuztwvq",  549382313570L));
    }

    static long repeatedString(String s, long n) {
        long occ = 0;
        long len=s.length();
       StringBuilder str=new StringBuilder(s);
        if (s.equals("a")) {
            return n;
        }else {
            if (len > n) {
                s=s.substring(0, (int) n);
                for(int i=0;i<s.length();i++)
                {
                    if(s.charAt(i)=='a')
                        occ++;
                }
            }else
            {
                long div=n%len;
                for(int i=0;i<s.length();i++)
                {
                    if(s.charAt(i)=='a')
                        occ++;
                }
                long rep=(long)n/len;
                occ=occ*rep;
                if(div!=0)
                {
                    s=s.substring(0, (int)div);
                    for(int i=0;i<s.length();i++)
                    {
                        if(s.charAt(i)=='a')
                            occ++;
                    }
                }


            }
        }

        return occ;
    }


}
