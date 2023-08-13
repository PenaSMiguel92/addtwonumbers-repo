public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode answer = new ListNode();
        ListNode answerPointer = answer;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum > 9 ? 1 : 0;

            answerPointer.val = sum % 10;
            if (l1 != null || l2 != null) {
                answerPointer.next = new ListNode();
                answerPointer = answerPointer.next;
            }
        }
        if (carry != 0) {
            answerPointer.next = new ListNode();
            answerPointer = answerPointer.next;
            answerPointer.val = carry;
        }
        return answer;
    }
}
