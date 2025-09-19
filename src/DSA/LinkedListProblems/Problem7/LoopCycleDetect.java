package DSA.LinkedListProblems.Problem7;

import DSA.LinkedList.Node;

public class LoopCycleDetect {
    public static boolean hasCycle(Node head) {
        if (head == null || head.next == null) return false;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;          // move 1 step
            fast = fast.next.next;     // move 2 steps

            if (slow == fast) {
                return true;           // cycle found
            }
        }

        return false; // fast reached end → no cycle
    }
    public static void main(String[] args) {
        // Create list: 1 → 2 → 3 → 4 → 5 → null (no cycle)
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);

        System.out.println("List1 has cycle? " + hasCycle(head1)); // false

        // Create list: 1 → 2 → 3 → 4 → 5 → points back to 2 (cycle)
        Node head2 = new Node(1);
        head2.next = new Node(2);
        head2.next.next = new Node(3);
        head2.next.next.next = new Node(4);
        head2.next.next.next.next = new Node(5);

        // make a cycle: 5 → 2
        head2.next.next.next.next.next = head2.next;

        System.out.println("List2 has cycle? " + hasCycle(head2)); // true
    }
}
