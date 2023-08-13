public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode answer = new ListNode();
        ListNode answerPointer = answer;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int digit1 = l1 != null ? l1.val : 0;
            int digit2 = l2 != null ? l2.val : 0;
            int sum = carry + digit1 + digit2;

            carry = sum > 9 ? 1 : 0;

            answerPointer.next = new ListNode(sum % 10);
            answerPointer = answerPointer.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;

        }
        System.gc();
        return answer.next;
    }
}
