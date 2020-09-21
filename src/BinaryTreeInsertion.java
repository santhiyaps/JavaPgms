public class BinaryTreeInsertion {
    class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
        }
    }
    public Node insertNode(Node root, int data){
        Node node=new Node(data);
        if(root==null) return node;
        Node parent=null,current=root;
        while(current!=null){
            parent=current;
            if(data<=current.data)
                current=current.left;
           else
                current=current.right;
        }
        if(data<=parent.data)
           parent.left=node;
        else
            parent.right=node;

        return root;
    }
}
