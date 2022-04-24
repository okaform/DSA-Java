package QueueArray;

public class Main {
    public static void main(String[] args) {

        QueueArray newQueue = new QueueArray(3);
        newQueue.enQueue(111);
        newQueue.enQueue(2);
        newQueue.enQueue(3);
        newQueue.enQueue(4);

        System.out.println(newQueue.isFull());
        int result = newQueue.peek();
        System.out.println(result);



        newQueue.deleteQueue();

        int result1 = newQueue.peek();
        System.out.println(result1);


    }
}
