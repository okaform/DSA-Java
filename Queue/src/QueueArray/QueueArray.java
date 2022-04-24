package QueueArray;
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
        return topOfQueue == arr.length - 1;
    }

    //isEmpty Method
    public boolean isEmpty() {
        if (beginningOfQueue == -1 || arr == null || beginningOfQueue == arr.length) {
            return true;
        }
        return false;
    }

    //enQueue method for inserting elements
    public void enQueue(int value) {
        if (isFull()) {
            System.out.println("The Queue is Full!");
        }
        else if (isEmpty()) { //if the queue is empty, beginning of queue changes to zero
            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted " +value+ " in the queue");
        }
        else {
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted " +value+ " in the queue");
        }
    }

    //deQueue Method
    public int deQueue() {
        if (isEmpty()) {
            System.out.println("The Queue is Empty!");
            return -1;
        }
        else {
            int result = beginningOfQueue;
            beginningOfQueue++;
            if (beginningOfQueue > topOfQueue) { //This means that the first element has gotten to the
                //last element and passed it and is now empty
                beginningOfQueue = topOfQueue = -1;
            }
            return arr[result];
        }
    }

    //Peek Method
    public int peek() {
        if(isEmpty()) {
            System.out.println("The Queue is empty");
            return -1;
        }
        else {
            return arr[beginningOfQueue];
        }
    }

    //Delete method
    public void deleteQueue() {
        arr = null;
        //beginningOfQueue = -1;
        //topOfQueue = -1;
        System.out.println("Queue is successfully deleted");
    }

}
