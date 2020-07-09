

import java.util.*;

public class Solution1 {
    public static void main(String[] args)
        {
            Map<String ,Integer> phoneBook=new HashMap<>();
            List<String> output=new ArrayList();
            Scanner in = new Scanner(System.in);
            int n=in.nextInt();
            in.nextLine();
            for(int i=0;i<n;i++)
            {
                String name=in.nextLine();
                int phone=in.nextInt();
                phoneBook.put(name,phone);
                in.nextLine();
            }
            while(in.hasNext())
            {
                String s=in.nextLine();
                if(phoneBook.containsKey(s))
                    output.add(s+"="+phoneBook.get(s));
                else
                    output.add("Not found");
            }
            for (String result : output) {
            System.out.println(result);
        }
        }

}
