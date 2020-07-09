

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QueryPosition {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lines = in.nextInt();
        List<ArrayList> lineList = new ArrayList<>();
        ArrayList<Integer> singleLine;
        for (int i = 0; i < lines; i++) {
            singleLine = new ArrayList<>();
            int d = in.nextInt();
            for (int j = 0; j < d; j++) {
                singleLine.add(in.nextInt());

            }
            lineList.add(singleLine);
        }
        int query = in.nextInt();
        List finalAnswer = new ArrayList();
        for (int i = 0; i < query; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            try {
                ArrayList<Integer> indvidual = lineList.get(--x);
                int z = indvidual.get(--y);
                finalAnswer.add(z);
            } catch (Exception e) {
                finalAnswer.add("ERROR!");
            }
        }
        for (Object O : finalAnswer) {
            System.out.println(O.toString());
        }
    }
}

