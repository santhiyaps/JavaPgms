import java.util.Scanner;

public class SwapNumNoTemp {
    public static void main(String[] args) {
        int x, y, temp;
        System.out.println("Enter x and y");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("x: " + x + " y: " + y);

    }

}
