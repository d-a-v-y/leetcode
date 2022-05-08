package com.davy.list;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Davy
 * <p>
 * 删除链表的倒数第N个节点
 * <p>
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 */
public class DeleteReciprocalList {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(0,head);
        ListNode first = head;
        ListNode second = dummy;

        for(int i = 0;i < n;i++){
            first = first.next;
        }

        while (first != null){
            first = first.next;
            second = second.next;
        }

        second.next = second.next.next;
        ListNode ans = dummy.next;
        return ans;
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}