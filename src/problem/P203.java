package problem;

import common.ListNode;

// todo
public class P203 {
    public ListNode removeElements(ListNode head, int val) {
        while (head != null){
            if (head.val == val){
                if (head.next != null){
                    head = head.next;
                } else {
                    head = null;
                }
            } else {

            }
            head = head.next;

        }
        return head;
    }
}
