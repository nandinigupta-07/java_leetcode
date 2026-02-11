/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int idx=0;
        while(temp!=null){
            idx++;
            temp=temp.next;
        }
        int tar=idx-n;
        if(tar==0){
          return  head.next;
        }
        int xx=0;
        temp=head;
        while(temp!=null){
            if(xx==tar-1 && temp.next!=null){
                temp.next=temp.next.next;
            } 
            temp=temp.next;
            xx++;
        }
        return head;
    }
}