/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null){
            return null;
        }
        ListNode currNode1=headA;
        ListNode currNode2 =headB;
        while(currNode1!=currNode2){
            if(currNode1==null){
                currNode1=headB;
            }
            else{
                 currNode1=currNode1.next;
            }
           if(currNode2==null){
                currNode2=headA;
            }
            else{
                 currNode2=currNode2.next;
            }
        }
        return currNode1;
        
    }
}