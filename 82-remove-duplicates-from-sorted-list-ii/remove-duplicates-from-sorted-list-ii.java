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
        ArrayList<Integer> arl = new ArrayList<>();
        ListNode curr = head;
        while(curr!=null && curr.next!=null){
            if(curr.val == curr.next.val){
                if (arl.isEmpty() || arl.get(arl.size() - 1) != curr.val) {
                    arl.add(curr.val);
                }
            }
            curr = curr.next;
        }
        ListNode h1 = new ListNode(0);
        ListNode c = h1;
        curr = head;
        while(curr!=null){
            if(arl.contains(curr.val)) {
                curr = curr.next;
                continue;
            }
            else{
                c.next = new ListNode(curr.val);
                c = c.next;
            } 
            curr = curr.next;
        }
        return h1.next;
    }
}