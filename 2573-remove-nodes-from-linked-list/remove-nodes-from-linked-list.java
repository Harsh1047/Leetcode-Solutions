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
    public ListNode removeNodes(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode curr = head;
        Stack<Integer> stack = new Stack<>();
        while(curr!=null){
            stack.push(curr.val);
            curr = curr.next;
        }
        ListNode head1 = new ListNode(0);
        curr = head1;
        int max = Integer.MIN_VALUE;
        Stack<Integer> st1 = new Stack<>();
        while(!stack.isEmpty()){
            if(stack.peek()>=max){
                max = stack.pop();
                st1.push(max);
            }
            else stack.pop();
        }
        while(!st1.isEmpty()){
                curr.next = new ListNode(st1.pop());
                curr = curr.next;
        }
        return head1.next;
    }
}