package MarchLeetCode;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class AverageOfLevels {

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double>avgList=new ArrayList();
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.add(root);
        while(!q.isEmpty()){
            int len= q.size();
            double sum=0;
            for(int i=0;i<len;i++){
                TreeNode curr=q.remove();
                sum+=curr.val;
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }
            avgList.add(sum/len);
        }
        return avgList;

    }
}
