package MarchLeetCode;

public class AddRowTree {
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if(d==1){
            TreeNode node=new TreeNode(v);
            node.left=root;
            return node;
        }
        helper(root,v,1,d);
        return root;
    }

    public void helper(TreeNode node,int v,int d,int n){
        if(node==null) return;

        if(d==n-1){
            TreeNode temp=node.left;
            node.left=new TreeNode(v);
            node.left.left=temp;
            temp=node.right;
            node.right=new TreeNode(v);
            node.right.right=temp;


        }else{
            helper(node.left,v,d+1,n);
            helper(node.right,v,d+1,n);
        }

    }
}
