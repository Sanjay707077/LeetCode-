class Solution {
public ListNode middleNode(ListNode head) {
ListNode f = head;
ListNode s = head;
int k = 0;

 while (f != null && f.next != null) {
     f = f.next.next;
     s = s.next;
     k++;
 }

 return s;

}
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna