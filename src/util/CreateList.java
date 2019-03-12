package util;

import common.ListNode;

import java.util.ArrayList;
import java.util.List;

public class CreateList {
    public static ListNode process(int[] nums) {
        List<ListNode> listNodes = new ArrayList<>();
        for (int num : nums) {
            listNodes.add(new ListNode(num));
        }

        ListNode head = listNodes.get(0);
        ListNode result = head;

        for (int i = 0; i < listNodes.size(); i++) {
            if (i + 1 >= listNodes.size()) {
                head.next = null;
            } else {
                head.next = listNodes.get(i + 1);
            }
            head = head.next;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2};
        process(nums);
    }
}
