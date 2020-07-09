

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicate {
    int firstDuplicate(int[] a) {
        int duplicate=-1;
        Set<Integer> numberSet=new HashSet();
        for(int b:a)
        {
            if(!numberSet.add(b))
            {
                duplicate=b;
            }
        }
        return duplicate;
    }

    public static void main(String[] args) {
        Duplicate duplicate=new Duplicate();
        System.out.println(duplicate.firstNotRepeatingCharacter("abacbbbbb"));

    }


    char firstNotRepeatingCharacter(String s) {
        char d='-';
        char[] a=s.toCharArray();
        List<Character> nonRepeating=new ArrayList();
        for(int i=0;i<a.length;i++)
        {
           if(nonRepeating.contains(a[i]))
           {
              if(s.indexOf(a[i],i+1)<0)
              {
                nonRepeating.remove(Character.valueOf(a[i]));
              }
           }else
           {
                nonRepeating.add(a[i]);
           }

        }
        if(!nonRepeating.isEmpty())
            d=nonRepeating.get(0);
        return d ;
    }
}
