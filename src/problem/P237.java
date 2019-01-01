package problem;

import common.ListNode;

public class P237 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;// 取出node下一个的val
        node.next = node.next.next;// 取出node下一个的next
    }
}
