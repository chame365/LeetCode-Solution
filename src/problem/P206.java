package problem;

import common.ListNode;

public class P206 {
    public ListNode reverseList(ListNode head) {
        ListNode reversed = null;
        ListNode cur = head;
        while (cur != null){
            ListNode next = cur.next;// 先把反转前的下一个node取出
            cur.next = reversed;
            reversed = cur;
            cur = next;
        }
        return reversed;
    }
}
