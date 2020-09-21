import java.util.HashMap;
import java.util.HashSet;

public class LengthOfDistinctNodes {
    public int distinctNodes(Node root) {
     if(root==null)
         return 0;
        HashMap<Integer,Integer> nummap=new HashMap();
        return distinctNodeHelper(root,nummap);

    }

    int distinctNodeHelper(Node node,HashMap<Integer,Integer>numMap){
        if(node==null){
            return numMap.size();
        }
        numMap.put(node.val,numMap.getOrDefault(node.val,0)+1);
        int max_path=Math.max(distinctNodeHelper(node.left,numMap),distinctNodeHelper(node.right,numMap));
        numMap.put(node.val,numMap.get(node.val)-1);
        if(numMap.get(node.val)==0)
            numMap.remove(node.val);
        return max_path;
    }

    public static void main(String[] args) {
        Node root= new Node(1);
        Node left=new Node(2);
        Node right=new Node(3);
        root.left=left;
        root.right=right;
        right.left=new Node(3);
        right.right=new Node(6);
        System.out.println(new LengthOfDistinctNodes().distinctNodes(root));

    }

}
