package DSA.Queue;

public class Runner {

    public static void main(String[] args)
    {
        Queue q =new Queue();
        q.enQueue(10);
        q.enQueue(20);
        q.enQueue(30);
        q.enQueue(40);
        System.out.println(q.deQueue());
        q.show();
    }
}
