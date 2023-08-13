public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        ListNode list1_node3 = new ListNode(3);
        ListNode list1_node2 = new ListNode(4, list1_node3);
        ListNode list1_node1 = new ListNode(2, list1_node2);

        ListNode list2_node3 = new ListNode(4);
        ListNode list2_node2 = new ListNode(6, list1_node3);
        ListNode list2_node1 = new ListNode(5, list1_node2);

        System.out.println(sol.addTwoNumbers(list1_node1, list2_node1));
    }
}