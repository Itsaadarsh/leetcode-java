package Easy;

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

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        var l1 = new ListNode(3, new ListNode(9, new ListNode(10, new ListNode(11))));
        var l2 = new ListNode(2, new ListNode(7, new ListNode(9, new ListNode(13))));
        var finalNode = merge(l1, l2);
        while (finalNode != null) {
            System.out.println(finalNode.val);
            finalNode = finalNode.next;
        }
    }

    static ListNode merge(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        if (l1.val < l2.val) {
            l1.next = merge(l1.next, l2);
            return l1;
        } else {
            l2.next = merge(l1, l2.next);
            return l2;
        }
    }

}
