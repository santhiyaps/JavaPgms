package MarchLeetCode;

import java.util.HashSet;

public class Candies {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length/2;
        HashSet<Integer>candySet=new HashSet<Integer>();
        for(int candy:candyType){
            candySet.add(candy);
        }
        if(candySet.size()>n)
            return n;

        return candySet.size();
    }

    public static void main(String[] args) {
        System.out.println(new Candies().distributeCandies(new int[]{1,1,2,2,3,3}));
        System.out.println(new Candies().distributeCandies(new int[]{1,1,2,3}));
        System.out.println(new Candies().distributeCandies(new int[]{6,6,6,6}));
    }
}
