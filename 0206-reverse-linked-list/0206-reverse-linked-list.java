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
// class Solution {
//     public ListNode reverseList(ListNode head) {
//         ListNode prev = null;
//         ListNode curr = head;
//         ListNode temp = null;
//         while(curr != null){
//             temp = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = temp;
//         }
//         return prev;
        
//     }
// }


// solve by recursion 
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        } else if (head.next == null) {
            return head;
        } else {
            ListNode nextNode = head.next; 
            head.next = null;
            ListNode rest = reverseList(nextNode); 
            nextNode.next = head;
            return rest;
        }
    }
}
