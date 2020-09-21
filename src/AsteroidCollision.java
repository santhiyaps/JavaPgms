import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Asteroid {
    public final int mass;
    public final int direction;
    public Asteroid(int mass, int direction) {
        this.mass = mass;
        this.direction = direction;
    }

    public int getMass() {
        return this.mass;
    }

    public int getDirection() {
        return this.direction;
    }

    public String toString() {
        return "Asteroid(" + mass + ", " + direction + ")";
    }
}

public class AsteroidCollision {
    public static void main(String[] args) {
        Asteroid[] case1 = new Asteroid[] {
                new Asteroid(1, 1),
                new Asteroid(5, -1),
                new Asteroid(7, 1),
                new Asteroid(3, -1),
        };

        Asteroid[] case2 = new Asteroid[] {
                new Asteroid(1, 1),
                new Asteroid(3, 1),
                new Asteroid(5, 1),
                new Asteroid(7, -1),
        };

        Asteroid[] case3 = new Asteroid[] {
                new Asteroid(5, 1),
                new Asteroid(1, 1),
                new Asteroid(4, -1),
        };

        Asteroid[] case4 = new Asteroid[] {
                new Asteroid(1, 1),
                new Asteroid(5, 1),
                new Asteroid(4, -1),
        };

        Asteroid[] case5 = new Asteroid[] {
                new Asteroid(6, 1),
                new Asteroid(3, -1),
                new Asteroid(2, -1),
                new Asteroid(1, -1),
        };
        System.out.println(collision(case1));
        System.out.println(collision(case2));
        System.out.println(collision(case3));
        System.out.println(collision(case4));
        System.out.println(collision(case5));
       /* testCase(1, case1, 1);
        testCase(2, case2, 2);
        testCase(3, case3, 1);
        testCase(4, case4, 2);
        testCase(5, case5, 0);*/
    }
    static int collision(Asteroid[] asteroids) {
        Stack<Asteroid> stack=new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            if(asteroids[i].getDirection()>0){
                stack.push(asteroids[i]);
            }else{
                while(!stack.isEmpty() && stack.peek().getDirection()>0 && stack.peek().getMass()<asteroids[i].getMass()){
                    int updatedMass=Math.abs(asteroids[i].getMass()-stack.peek().getMass());
                    int direct=asteroids[i].direction;
                    asteroids[i]=new Asteroid(updatedMass,direct);
                    stack.pop();
                }
                if(!stack.isEmpty() && stack.peek().getMass()>asteroids[i].getMass()){
                    int updatedMass=Math.abs(asteroids[i].getMass()-stack.peek().getMass());
                    int direct=asteroids[i].direction;
                    stack.pop();
                    stack.push(new Asteroid(updatedMass,direct));
                }
                if(!stack.isEmpty() && stack.peek().getMass()==asteroids[i].getMass()){
                    stack.pop();
                }
            }
        }
        return stack.size();
    }
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
