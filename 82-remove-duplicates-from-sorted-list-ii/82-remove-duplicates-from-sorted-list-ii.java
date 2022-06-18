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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode tmp = new ListNode();
        tmp.next = head;
        
        ListNode now = head;
        ListNode prev = tmp;
        
        while(now != null){
            if(now.next != null && now.val == now.next.val){
                ListNode tmp2 = now.next;
                while(tmp2 != null && tmp2.val == now.val){
                    tmp2 = tmp2.next;
                }
                prev.next = tmp2;
                now = tmp2;
            }else{
                prev = now;
                now = now.next;
            }
        }
        return tmp.next;
    }
}