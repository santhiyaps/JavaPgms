
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class AddNode {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int i = 0;
        ListNode l3 = new ListNode(-1);
        int l1Val = 0, l2Val = 0;
        ListNode l4=l3;
        int rem=0;
        while (i == 0) {
            if (l1 == null)
                l1Val = 0;
            else {
                l1Val = l1.val;
                l1 = l1.next;
            }
            if (l2 == null)
                l2Val = 0;
            else {
                l2Val = l2.val;
                l2 = l2.next;
            }
            ListNode temp;
            int j = l1Val +l2Val+rem;
            rem=0;
            if(j>9)
            {
                rem=j/10;
                j=j%10;
            }
            if (l3.val == -1) {
                l3.val = j;
            } else {
                temp = new ListNode(j);
                l3.next = temp;
                l3=temp;
            }
            if (l1 == null && l2 == null)
            {
                if(rem>0)
                {
                    temp = new ListNode(rem);
                    l3.next = temp;

                }

                i = 1;
            }

        }
        return l4;

    }

    public static void main(String[] args) {
        ListNode l1=new ListNode(2);
        l1.next=new ListNode(4);
        l1.next.next=new ListNode(3);
        ListNode l2=new ListNode(5);
        l2.next=new ListNode(6);
        l2.next.next=new ListNode(4);

        ListNode l3=addTwoNumbers(l1,l2);
        while(l3.next!=null)
        {
            System.out.println(l3.val);
            l3=l3.next;
        }


    }

}
