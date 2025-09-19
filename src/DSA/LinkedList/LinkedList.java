package DSA.LinkedList;

public class LinkedList {
    public Node head;
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

    public void insertAtBegining(int data){
        Node newNode = new Node(data);

        Node node = head;
        head=newNode;
        head.next=node;
    }



    public void display(){
        Node tail = head;
        while(tail!=null){
            System.out.print(tail.data+" ");
            tail=tail.next;
        }


    }

    public void insertAt(int index, int data) {
        if(index==0){
            insertAtBegining(data);
        }
        else{
            Node newNode = new Node(data);
            Node tail = head;
            for(int i=0;i<index;i++){
                tail=tail.next;
            }

            newNode.next=tail.next;
            tail.next = newNode;
        }


    }

    public void deleteAt(int index){
        if(index==0){
            head=head.next;
        }
        else{
            Node tail = head;
            Node n1 = null;

            for(int i=0;i<index-1;i++){
                tail = tail.next;
            }

            n1 = tail.next;
            tail.next  = n1.next;
        }

    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
