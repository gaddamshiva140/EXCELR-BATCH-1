class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;
            int total = val1 + val2 + carry;
            carry = total / 10;
            current.next = new ListNode(total % 10);
            current = current.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        
        return dummy.next;
    }
    public static ListNode arrayToList(int[] numbers) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int num : numbers) {
            current.next = new ListNode(num);
            current = current.next;
        }
        return dummy.next;
    }
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        AddTwoNumbers solution = new AddTwoNumbers();
        ListNode l1 = arrayToList(new int[]{2, 4, 3});
        ListNode l2 = arrayToList(new int[]{5, 6, 4});
        ListNode result = solution.addTwoNumbers(l1, l2);
        printList(result); 

        l1 = arrayToList(new int[]{0});
        l2 = arrayToList(new int[]{0});
        result = solution.addTwoNumbers(l1, l2);
        printList(result);  

        l1 = arrayToList(new int[]{9, 9, 9, 9, 9, 9, 9});
        l2 = arrayToList(new int[]{9, 9, 9, 9});
        result = solution.addTwoNumbers(l1, l2);
        printList(result);
    }
}