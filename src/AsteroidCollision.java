import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
     Stack<Integer>stacks=new Stack();
     int i=0;
     while(i<asteroids.length){
         if(asteroids[i]>0){
           stacks.push(asteroids[i]);
         }else{
                while(!stacks.isEmpty()&& stacks.peek()>0 && stacks.peek()<Math.abs(asteroids[i])){
                    stacks.pop();
                }
                if(stacks.isEmpty() || stacks.peek()<0){
                    stacks.push(asteroids[i]);
                }else if(stacks.peek()==Math.abs(asteroids[i])){
                    stacks.pop();
                }
         }
         i++;
     }
        int remaining[]=new int[stacks.size()];
        for(int k=remaining.length-1;k>=0;k--){
            remaining[k]=stacks.pop();
        }
        return remaining;
    }
}
