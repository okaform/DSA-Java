package QueueList;

public class Main {
    public static void main(String[] args) {
        QueueList qll = new QueueList();
        qll.enQueue(10);
        qll.enQueue(20);
        qll.enQueue(30);
        qll.enQueue(40);


        System.out.println(qll.isEmpty());
        System.out.println(qll.deQueue());
        System.out.println(qll.deQueue());

        System.out.println(qll.peek());
        System.out.println(qll.peek());



    }

}
