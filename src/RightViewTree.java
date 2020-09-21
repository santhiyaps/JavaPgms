import java.util.*;

public class RightViewTree {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        if(root==null) return result;
        Queue<TreeNode>queue=new LinkedList();
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            int value=0;
            for(int i=0;i<size;i++){
                TreeNode curr=queue.poll();
                value=curr.val;
                if(curr.left!=null)
                    queue.add(curr.left);
                if(curr.right!=null)
                    queue.add(curr.right);
            }
            if(value!=0)
                result.add(value);
        }
        return result;
    }
}
