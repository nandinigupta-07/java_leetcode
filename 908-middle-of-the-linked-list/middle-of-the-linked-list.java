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
    public ListNode middleNode(ListNode head) {
        ListNode temp=head;
        int cnt=0;
        while(temp!=null){
             cnt++;
            temp=temp.next;
        }
        double val=Math.ceil(cnt/2);
        int uu=0;
         temp=head;
        while(temp!=null){
            if(uu==val){
                return temp;
            }
            temp=temp.next;
            uu++;
        }
        return temp;
    }
}
