package DSA.LinkedListProblems.Problem6;

import DSA.LinkedList.Node;

public class NodePalindromeCheck {
    public boolean isPalindrome(Node head) {
        if (head == null || head.next == null) return true;

        Node fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        Node rev = reverse(slow);

        Node tail = head;
        while (rev != null) {
            if (rev.data != tail.data) {
                return false;
            }
            rev = rev.next;
            tail = tail.next;
        }

        return true;
    }

    private Node reverse(Node head) {
        Node prev = null, curr = head;
        while (curr != null) {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public static void main(String[] args) {
        DSA.LinkedList.LinkedList list = new DSA.LinkedList.LinkedList();

        // Create a palindrome list: 1 -> 2 -> 3 -> 2 -> 1
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(2);
        list.insert(1);

        System.out.print("List: ");
        list.printList();

        NodePalindromeCheck checker = new NodePalindromeCheck();
        boolean result = checker.isPalindrome(list.head);

        System.out.println("Is Palindrome? " + result);
    }

}
