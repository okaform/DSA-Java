public class QueueArray {
    int[] arr;
    int topOfQueue; //the last element in the queue
    int beginningOfQueue; //the first element in the queue

    public QueueArray (int size) {
        this.arr = new int[size];
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        System.out.println("The Queue has been created with size of: " + size);
    }
}
