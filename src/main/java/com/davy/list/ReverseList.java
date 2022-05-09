package com.davy.list;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Davy
 *
 * 反转链表
 * 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 */
public class ReverseList {
    public ListNodeA reverseList(ListNodeA head) {
        ListNodeA ans = null;
        for(ListNodeA x = head;x != null;x = x.next){
            ans = new ListNodeA(x.val,ans);
        }
        return ans;
    }
}

class ListNodeA {
    int val;
    ListNodeA next;

    ListNodeA() {
    }

    ListNodeA(int val) {
        this.val = val;
    }

    ListNodeA(int val, ListNodeA next) {
        this.val = val;
        this.next = next;
    }
}
