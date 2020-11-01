
 class TreeNode1 {
     int val;
      TreeNode1 left;
      TreeNode1 right;
      TreeNode1() {}
      TreeNode1(int val) { this.val = val; }
      TreeNode1(int val, TreeNode1 left, TreeNode1 right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
class BSTSum {
    public int rangeSumBST(TreeNode1 root, int L, int R) {
        int sum=0;
        BSThelper(root,sum,L,R);
        return sum;
    }

    void BSThelper(TreeNode1 node,int sum,int L,int R){
        if(node!=null){
            if(node.val>=L && node.val<=R)
                sum+=node.val;
            BSThelper(node.left,sum,L,R);
            BSThelper(node.right,sum,L,R);
        }
    }

    public static void main(String[] args) {

    }
}
