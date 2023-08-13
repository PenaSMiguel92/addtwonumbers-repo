public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        ListNode list1_node3 = new ListNode(3);
        ListNode list1_node2 = new ListNode(4, list1_node3);
        ListNode list1_node1 = new ListNode(2, list1_node2);

        ListNode list2_node3 = new ListNode(4);
        ListNode list2_node2 = new ListNode(6, list2_node3);
        ListNode list2_node1 = new ListNode(5, list2_node2);

        ListNode list3_node7 = new ListNode(9);
        ListNode list3_node6 = new ListNode(9, list3_node7);
        ListNode list3_node5 = new ListNode(9, list3_node6);
        ListNode list3_node4 = new ListNode(9, list3_node5);
        ListNode list3_node3 = new ListNode(9, list3_node4);
        ListNode list3_node2 = new ListNode(9, list3_node3);
        ListNode list3_node1 = new ListNode(9, list3_node2);

        ListNode list4_node4 = new ListNode(9);
        ListNode list4_node3 = new ListNode(9, list4_node4);
        ListNode list4_node2 = new ListNode(9, list4_node3);
        ListNode list4_node1 = new ListNode(9, list4_node2);

        System.out.println(sol.addTwoNumbers(list1_node1, list2_node1));
        System.out.println(sol.addTwoNumbers(list3_node1, list4_node1));
    }
}