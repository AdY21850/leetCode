class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode currNode = head;

       
        int l = 0;
        while (currNode != null) {
            l++;
            currNode = currNode.next;
        }

       
        int baseSize = l / k;
        int extra = l % k;

       
        ListNode[] result = new ListNode[k];
        currNode = head;

        for (int i = 0; i < k; i++) {
            if (currNode == null) {
                result[i] = null;
                continue;
            }

            result[i] = currNode; 
            int partSize = baseSize + (extra-- > 0 ? 1 : 0);

           
            for (int j = 1; j < partSize; j++) {
                if (currNode != null) currNode = currNode.next;
            }

           
            if (currNode != null) {
                ListNode nextPart = currNode.next;
                currNode.next = null;
                currNode = nextPart;
            }
        }

        return result;
    }
}
