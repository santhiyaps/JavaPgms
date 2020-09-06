class MyLinkedList {
    Node head;
    int length;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    /**
     * Initialize your data structure here.
     */
    public MyLinkedList() {
        this.head = null;
        this.length = 0;
    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        if (index < 0 || index >= length) {
            return -1;
        } else {
            int n = 0;
            Node curr = head;
            while (n != index) {
                curr = curr.next;
                n++;
            }
            return curr.data;
        }
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        this.head=newNode;
        length++;
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = new Node(val);
        length++;
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        if (index == 0) {
            addAtHead(val);
        } else if (index == length) {
            addAtTail(val);
        } else if (index > length) {
            return;
        } else {
            int counter = 0;
            Node curr = head;
            while (index - 1 != counter) {
                curr = curr.next;
                counter++;
            }
            Node temp = curr.next;
            Node newNode = new Node(val);
            curr.next = newNode;
            newNode.next = temp;
            length++;
        }

    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        Node curr = head;
        if (index < 0 || index >= length)
            return;
        else if (index == 0) {
            head = curr.next;
            length--;
        } else {
            int counter = 0;
            Node pre = null;
            while (index != counter) {
                pre = curr;
                curr = curr.next;
                counter++;
            }
            pre.next = curr.next;
            length--;
        }
    }

    public static void main(String[] args) {
        MyLinkedList obj = new MyLinkedList();
        int param_1 = obj.get(0);
        obj.addAtHead(1);
        obj.addAtTail(2);
        obj.addAtIndex(1, 3);
        //obj.deleteAtIndex(index);
    }
}