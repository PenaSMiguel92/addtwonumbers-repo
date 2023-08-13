public class ListNode {
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

    @Override 
    public String toString() {
        String val = "";
        ListNode nextNode = this;
        while (nextNode != null) {
            val += nextNode.val;
            nextNode = nextNode.next;
        }
        return val;
    }
}
