package Medium;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class AddTwoNumbers {
    public static void main(String[] args) {
        var l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))));
        var l2 = new ListNode(9, new ListNode(9));
        var finalNode = addTwoNumbers(l1, l2);
        while (finalNode != null) {
            System.out.println(finalNode.val);
            finalNode = finalNode.next;
        }
    }

    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(0);
        ListNode a = l1, b = l2, pre = node;
        int carry = 0;
        while (a != null || b != null) {
            int x = (a != null) ? a.val : 0;
            int y = (b != null) ? b.val : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            pre.next = new ListNode(sum % 10);
            pre = pre.next;
            if (a != null) {
                a = a.next;
            }
            if (b != null) {
                b = b.next;
            }
        }
        if (carry > 0) {
            pre.next = new ListNode(carry);
        }
        return node.next;
    }
}
