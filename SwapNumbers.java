import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        int x, y, temp;
        System.out.println("Enter x and y");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        temp = x;
        x = y;
        y = temp;
        System.out.println("x: " + x + " y: " + y);

    }
}
