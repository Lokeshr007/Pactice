package DSA.LinkedListProblems;

public class LinkedListNode {
    public ListNode head;

    public void insert(int data)
    {
        ListNode newNode = new ListNode(data);
        if(head == null){
            head = newNode;
        }
        else{
            ListNode tail = head;

            while(tail!=null){
                tail = tail.next;
            }
            tail = newNode;
        }
    }

    public void display(){
        ListNode tail = head;

        while(tail!=null)
        {
            System.out.print(tail.data +" ");
            tail = tail.next ;
        }

    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0,head);
        ListNode fast = dummy;
        ListNode slow = dummy;

        for(int i=0;i<=n;i++){
            fast = fast.next;
        }

        while(fast!=null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }
}
