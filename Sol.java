import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

class Add {
    void add(int... n1) {
        String s = "";
        int i = 0;
        int sum = 0;
        int ar=n1.length-1;
        while (i <=ar) {
            sum += n1[i];
            if (i == ar)
                s += n1[i];
            else
                s += n1[i] + "+";;
            i++;
        }
        s += "=" + sum;

        System.out.println(s);
    }
}


public class Sol {

    public static void main(String[] args) {
        try {

            Add ob = new Add();
            ob.add(1, 2);
            ob.add(1, 2, 3);
            ob.add(1, 2, 3, 4, 5);
            ob.add(1, 2, 3, 4, 5, 6);
            Method[] methods = Add.class.getDeclaredMethods();
            Set<String> set = new HashSet<>();
            boolean overload = false;
            for (int i = 0; i < methods.length; i++) {
                if (set.contains(methods[i].getName())) {
                    overload = true;
                    break;
                }
                set.add(methods[i].getName());

            }
            if (overload) {
                throw new Exception("Overloading not allowed");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}

