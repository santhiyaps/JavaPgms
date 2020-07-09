

import java.io.IOException;
import java.util.Scanner;

public class JumpingClouds {

    // Complete the jumpingOnClouds function below.0010010
    static int jumpingOnClouds(int[] c) {
      int jump=0;

      int i=0;
      while(i<c.length-1)
      {
        if(i+2==c.length || c[i+2]==1)
        {
            i++;
            jump++;
        }else
        {
            i+=2;
            jump++;
        }
      }

      return  jump;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        /*BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
        */
        System.out.println(jumpingOnClouds(new int[]{0,0,0,1,0,0}));

    }
}
