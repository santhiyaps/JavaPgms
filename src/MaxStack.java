import java.util.Comparator;
import java.util.Stack;
import java.util.TreeMap;

class MaxStack {
    Stack<Integer> stack;
    TreeMap<Integer,Integer> maxMap;
    /** initialize your data structure here. */
    public MaxStack() {
        stack=new Stack();
        maxMap=new TreeMap<>(Comparator.reverseOrder());
    }

    public void push(int x) {
       stack.push(x);
       maxMap.put(x,maxMap.getOrDefault(x,0)+1);
    }

    public int pop() {
        int x=stack.peek();
        removeFromMap(x);
        stack.pop();
        return x;
    }

    public int top() {
        return stack.peek();
    }

    public int peekMax() {
        return maxMap.entrySet().iterator().next().getKey();
    }

    public int popMax() {
        int max=maxMap.entrySet().iterator().next().getKey();
        removeFromMap(max);
        Stack<Integer>buffer=new Stack();
        while(!stack.isEmpty()){
            int i=stack.pop();
            if(i==max) break;
            buffer.push(i);
        }
        while(!buffer.isEmpty()){
            stack.push(buffer.pop());
        }
        return max;
    }

    private void removeFromMap(int x){
        int repetition=maxMap.get(x);
        if(repetition>1){
            maxMap.put(x,repetition-1);
        }else{
            maxMap.remove(x);
        }
    }

    public static void main(String[] args) {
        MaxStack maxStack=new MaxStack();
        maxStack.push(5);
        maxStack.push(1);
        System.out.println(maxStack.popMax());
        System.out.println(maxStack.peekMax());
       /* ["MaxStack","push","push","push","top","popMax","top","peekMax","pop","top"]
[[],[5],[1],[5],[],[],[],[],[],[]]*/
    }
}