public class TreeToSortedList {
    Node head=null;
    Node tail=null;
    public Node treeToDoublyList(Node root) {
        if(root==null) return null;
        walkNode(root);
        head.left=tail;
        tail.right=head;
        return head;
    }
    public void walkNode(Node node){
        if(node==null)
            return;
        walkNode(node.left);
        if(tail!=null){
            tail.right=node;
            node.left=tail;
        }
        tail=node;
        if(head==null){
            head=node;
        }
        walkNode(node.right);

    }
}
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};



