package problem;

public class P707 {
    public static void main(String[] args) {
        MyLinkedList obj = new MyLinkedList();
        obj.get(0);
        obj.get(10);
        obj.addAtHead(0);
        obj.addAtTail(10);

        obj.addAtHead(1);
        obj.addAtIndex(0, 9);
        obj.deleteAtIndex(1);
    }
}

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}

class MyLinkedList {
    private ListNode head;
    private int size;

    public MyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public int get(int index) {
        ListNode dummy = head;
        if (index + 1 > this.size) {
            return -1;
        }
        for (int i = 0; i < index; i++) {
            dummy = dummy.next;
        }
        return dummy.val;
    }

    public void addAtHead(int val) {
        ListNode newHead = new ListNode(val);
        if (head == null) {
            newHead.next = null;
            head = newHead;
            return;
        }
        newHead.next = head;
        head = newHead;
        size++;
    }

    public void addAtTail(int val) {
        ListNode dummy = head;
        ListNode newTail = new ListNode(val);

        while (dummy == null) {
            dummy = dummy.next;
        }

        newTail.next = null;
        dummy.next = newTail;

        head = dummy;
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index == 0) {
            addAtHead(val);
            return;
        }
        ListNode dummy = head;
        ListNode newNode = new ListNode(val);
        for (int i = 0; i < index; i++) {
            dummy = dummy.next;
        }
        newNode.next = dummy.next;
        size++;
    }

    public void deleteAtIndex(int index) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        for (int i = 0; i < index - 1; i++) {
            dummy = dummy.next;
        }
        dummy.next = dummy.next.next == null ? null : dummy.next.next;
        head = dummy.next;
    }
}
