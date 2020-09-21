import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.PriorityQueue;


public class solutionmick {
    public String solution(String S) {
        int fileSize = 14680064;
        Date checkDate = null;
        try {
            checkDate = new SimpleDateFormat("yyyy-mm-dd").parse("1990-01-31");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        // write your code in Java SE 8
        String list[] = S.split("[\\r\\n]");
        int min = Integer.MAX_VALUE;
        for (String line : list) {
            line = line.trim();
            String individualLine[] = line.split(" ");
            Date date1 = null;
            try {
                date1 = new SimpleDateFormat("yyyy-mm-dd").parse(individualLine[1]);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            String fileLength = individualLine[0];
            if (individualLine[0].contains("K")) {
                fileLength = individualLine[0].substring(0, individualLine[0].indexOf("K"));
                fileLength += "000";
            } else if (individualLine[0].contains("M")) {
                fileLength = individualLine[0].substring(0, individualLine[0].indexOf("M"));
                fileLength += "000000";
            }
            if (individualLine[2].endsWith("~") && Integer.parseInt(fileLength) < fileSize && date1.after(checkDate)) {
                String files = individualLine[2];
                String fileName = files.substring(0, files.indexOf("."));
                min = Math.min(min, fileName.length());
            }
        }
        if (min == Integer.MAX_VALUE)
            return "NO Files";
        return min + "";
    }

    public static void main(String[] args) {
        String s = " 715K 2009-09-23 system.zip~\n" +
                " 179K 2013-08-14 to-do-list.xml~\n" +
                " 645K 2013-06-19 blockbuster.mpeg~\n" +
                "  536 2010-12-12 notes.html\n" +
                " 688M 1990-02-11 delete-this.zip~\n" +
                "  23K 1987-05-24 setup.png~\n" +
                " 616M 1965-06-06 important.html\n" +
                "  14M 1992-05-31 crucial-module.java~\n" +
                " 192K 1990-01-31 very-long-filename.dll~";
        System.out.println(new solutionmick().check("aaaabbbb"));
    }

    int check(String s) {
        int count = 0;
        int occurrences[] = new int[26];
        // Length of the string
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char x = s.charAt(i);
            occurrences[x - 'a'] += 1;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int c : occurrences) {
            if (c != 0) {
                pq.add(c);
            }
        }
        while (!pq.isEmpty()) {
            int most_frequent = pq.peek();
            pq.remove();
            if (pq.isEmpty()) {
                return count;
            }
            if (most_frequent == pq.peek()) {
                if (most_frequent > 1) {
                    pq.add(most_frequent - 1);
                }
                count++;
            }

        }
        return count;

    }
}

