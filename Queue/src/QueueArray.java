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

    //isFull
    public boolean isFull() {
        if (topOfQueue == arr.length -1) {
            return true;
        }
        return false;
    }

    //isEmpty Method
    public boolean isEmpty() {
        if (beginningOfQueue == -1 || beginningOfQueue == arr.length) {
            return true;
        }
        return false;
    }

    //enQueue method for inserting elements
    public void enQueue(int value) {
        if (isFull()) {
            System.out.println("The Queue is Full!");
        }
        else {

        }
    }
}
