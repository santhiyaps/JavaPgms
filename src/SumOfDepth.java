import java.util.ArrayList;
import java.util.List;

public class SumOfDepth {
    public static List<Integer> branchSums(TreeNode root) {
        List<Integer> returnList=new ArrayList<>();
        branchSumsHelper(root,returnList,0);
        return returnList;
    }
    public static void branchSumsHelper(TreeNode node,List<Integer> list, int runningSum){
        if(node==null)
            return;
        int newSum=runningSum+node.val;
        if(node.left==null && node.right==null){
            list.add(newSum);
            return;
        }
        branchSumsHelper(node.left,list,newSum);
        branchSumsHelper(node.right,list,newSum);

    }

    public static void main(String[] args) {
        TreeNode treeNode=new TreeNode(1);
        TreeNode left=new TreeNode(2);
        TreeNode right=new TreeNode(3,new TreeNode(6),new TreeNode(7));
        treeNode.left=left;
        treeNode.right=right;
        TreeNode leftLeft=new TreeNode(4,new TreeNode(8),new TreeNode(9));
        TreeNode leftRight=new TreeNode(5,new TreeNode(10),null);
        left.left=leftLeft;
        left.right=leftRight;
        List<Integer>sumList=branchSums(treeNode);
        for(int i:sumList){
            System.out.println(i);
        }
    }
}
