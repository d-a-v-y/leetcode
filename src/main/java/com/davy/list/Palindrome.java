package com.davy.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Davy
 * <p>
 * 回文链表
 * <p>
 * 给你一个单链表的头节点 head ，请你判断该链表是否为回文链表。如果是，返回 true ；否则，返回 false 。
 */
public class Palindrome {
    public boolean isPalindrome(ListNode3 head) {
        List<ListNode3> list = new ArrayList<>();
        ListNode3 ans = head;
        int count = 0;
        while (ans != null){
            list.add(ans);
            ans = ans.next;
            ++count;
        }
        for(int i = 0,j = count - 1;i < j;i++,j--){
            if(list.get(i).val != list.get(j).val){
                return false;
            }
        }
        return true;
    }
}

class ListNode3 {
    int val;
    ListNode3 next;

    ListNode3() {
    }

    ListNode3(int val) {
        this.val = val;
    }

    ListNode3(int val, ListNode3 next) {
        this.val = val;
        this.next = next;
    }
}
