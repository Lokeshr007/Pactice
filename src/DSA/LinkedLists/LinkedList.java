package DSA.LinkedLists;

public class LinkedList {
    Node head;
    public void insert(int data){
        Node node = new Node(data);

        if(head==null){
            head = node;
        }
        else{
            Node tail = head;
            while(tail.next!=null){
                tail=tail.next;
            }

            tail.next = node;
        }
    }

    public void display(){
        Node tail = head;
        while(tail!=null){
            System.out.print(tail.data+" ");
            tail=tail.next;
        }


    }
}
