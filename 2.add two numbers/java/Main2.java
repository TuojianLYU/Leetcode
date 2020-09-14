/**
 * Main
 */
public class Main2 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l11 = new ListNode(1);
        ListNode l111 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l22 = new ListNode(2);
        ListNode result = new ListNode(0);

        l1.next = l11;
        l1.next.next = l111;
        l2.next = l22;

        result = addTwoNumbers(l1,l2);

        while ( result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = ( p != null)? p.val: 0;
            int y = ( q != null)? q.val: 0;
            int sum = carry + x + y;
            carry = sum/10;
            curr.next = new ListNode(sum%10);
            curr = curr.next;
            if ( p != null) {
                p = p.next;
            }
            if ( q != null) {
                q = q.next;
            }
        }    

        if (carry > 0){
            curr.next = new ListNode(carry);
        }

        return dummyHead.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}
