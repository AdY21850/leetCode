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
    public ListNode rotateRight(ListNode head, int k) {
         if (head==null){
            return null;
        }
        if (head.next==null)
        {
            return head;
        }
        if(k==0)
        {
            return head;
        }
        int listsize=1;
         ListNode currNode=head;
            while (currNode.next!=null)
            {
                currNode=currNode.next;
                listsize++;
            }
        int m=k%listsize;
        ListNode tail;
        int p=0;
       
        while (p<m)
        {
            ListNode curr=head;
            while (curr.next.next!=null)
            {
                curr=curr.next;
            }
            tail=curr.next;
            curr.next=null;
            tail.next=head;
            head=tail;
            p++;
        }
        return head;
    }
}