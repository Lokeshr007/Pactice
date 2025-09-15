package DSA.LinkedList;

public class Main {
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);

        list.insert(50);
        list.insert(60);

        list.insertAtBegining(5);

        list.insertAt(3,40);
        list.deleteAt(4);
        list.display();
    }
}
