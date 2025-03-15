class Solution {
    public ListNode oddEvenList(ListNode head) {
        int pos = 1;
        ListNode oddNodeHead = new ListNode(-1), oddNodeTail = oddNodeHead ;
        ListNode evenNodeHead = new ListNode(-1), evenNodeTail =evenNodeHead;
        ListNode curr = head, temp;

        while(curr!=null){
            temp = curr;
            curr = curr.next;
            temp.next = null;

            if(pos%2 != 0 ){
                oddNodeTail.next = temp;
                oddNodeTail = temp;
            }else{
                evenNodeTail.next = temp;
                evenNodeTail = temp;
            }
            pos++;
        }
        oddNodeTail.next = evenNodeHead.next;
        return oddNodeHead.next;
    }
}