import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderPrint {

    public void levelOrder(Node root){
        if(root==null) return;
        Queue<Node> queue=new LinkedList<>();
        queue.add((root));
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                Node current=queue.poll();
                System.out.print(current.val+" ");
                if(current.left!=null){
                    queue.add(current.left);
                }
                if(current.right!=null){
                    queue.add(current.right);
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Node root=new Node(3);
        Node left=new Node(9);
        left.left=new Node(8);
        left.right=new Node(10);
        root.left=left;
        Node right=new Node(20);
        right.left=new Node(15);
        right.right=new Node(7);
        root.right=right;
        new LevelOrderPrint().levelOrder(root);
    }
}
