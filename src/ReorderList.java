import java.util.*;

public class ReorderList {
    public void reorderList(ListNode head) {
        List<ListNode> nodeList=new ArrayList<>();
        ListNode curr=head;
        while(curr!=null){
            nodeList.add(curr);
            curr=curr.next;
        }
        int i=0,j=nodeList.size()-1;
        ListNode newList=head;
        ListNode temp=null;
        while(i<=j){
           temp=nodeList.get(i);
           newList=temp;
           newList=newList.next;
           temp=nodeList.get(j);
           newList=temp;
           newList=newList.next;
           ++i;
           --j;
        }
    }

    public static void main(String[] args) {
        ListNode listNode=new ListNode(1);
        listNode.next=new ListNode(2);
        listNode.next.next=new ListNode(3);
        listNode.next.next.next=new ListNode(4);
        new ReorderList().reorderList(listNode);
    }
}



