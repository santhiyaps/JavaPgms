public class MergeList {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l3temp=null, l3=null,l3rev=null;
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;
        while (l1 != null && l2 != null)
        {
            l3=new ListNode(l1.val);
            if(l3temp!=null) {
                l3temp.next = l3;
            }
            l3temp=new ListNode(l2.val);
            l3.next=l3temp;
            l1=l1.next;
            l2=l2.next;
            if(l3rev==null)
                l3rev=l3;
        }
        return l3rev;

    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(6);
        ListNode l2 = new ListNode(3);
        l2.next = new ListNode(5);
        l2.next.next = new ListNode(7);

        ListNode l3 = mergeTwoLists(l1, l2);
        while (l3!= null) {
            System.out.println(l3.val);
            l3 = l3.next;
        }


    }
}
