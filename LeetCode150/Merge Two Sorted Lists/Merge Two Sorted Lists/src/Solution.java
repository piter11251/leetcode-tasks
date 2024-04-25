

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        ListNode h1 = list1;
        ListNode h2 = list2;

        ListNode answerHead = null;
        ListNode answerTail = null;

        if(h1.val <= h2.val){
            answerHead = h1;
            answerTail = h2;
            h1 = h1.next;
        }
        else{
            answerHead = h2;
            answerTail = h2;
            h2 = h2.next;
        }

        while(h1!=null && h2!=null){
            if(h1.val <= h2.val){
                answerTail.next = h1;
                answerTail = answerTail.next;
                h1 = h1.next;
            }
            else{
                answerTail.next = h2;
                answerTail = answerTail.next;
                h2 = h2.next;
            }
        }

        if(h1 == null){
            answerTail.next = h1;
        }
        else{
            answerTail.next = h2;
        }
        return answerHead;
    }
}