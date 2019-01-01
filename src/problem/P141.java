package problem;

import common.ListNode;

import java.util.HashSet;
import java.util.Set;

public class P141 {
    public static void main(String[] args) {

    }

    public boolean hasCycle(ListNode head) {
        Set<ListNode> listNodes = new HashSet<>();
        while (head != null){
            if(listNodes.contains(head)) {
                return true;
            } else {
                listNodes.add(head);
            }
            head = head.next;
        }
        return false;
    }
}
