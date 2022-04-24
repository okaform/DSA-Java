package CircularQueue;

public class Main {
    public static void main(String[] args) {

        CircularQueue CQ = new CircularQueue(3);
        CQ.enQueue(10);
        CQ.enQueue(20);
        CQ.enQueue(30);
        CQ.enQueue(40);

        System.out.println(CQ.peek());
        System.out.println(CQ.peek());

    }
}
