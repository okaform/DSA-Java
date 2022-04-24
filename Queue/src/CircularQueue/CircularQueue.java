package CircularQueue;

public class CircularQueue {
    int[] arr;
    int beginningOfQueue;
    int topOfQueue;
    int size;

    public CircularQueue(int size) {
        this.arr = new int[size];
        this.size = size;
        this.beginningOfQueue = -1;
        this.topOfQueue = -1;
        System.out.println("The Queue has been created with size of: " + size);
    }

    //isEmpty
    public boolean isEmpty() {
        return topOfQueue == -1 || arr == null;
/*        if (topOfQueue == -1 || arr == null) {
            return true;
        }
        return false;*/
    }

    //isFull
    public boolean isFull() {
        if (topOfQueue + 1 == beginningOfQueue) { //this means that we have completed the circle
            return true;
        }
        else if (beginningOfQueue == 0 && topOfQueue +1 == size) {
            return true;
        }
        else {
            return false;
        }
    }

    //enQueue method
    public void enQueue(int value) {
        if (isFull()) System.out.println("The Circular Queue is full!");
        else if (isEmpty()) {//meaning first element to enter
            beginningOfQueue = 0;
            topOfQueue ++;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted " +value+ " in the queue");
        }
        else { //if it is not empty
            if (topOfQueue + 1 == size) { //meaning we have data at the last cell
                // but have empty cell at the first
                topOfQueue = 0;
            }
            else {
                topOfQueue++;
            }
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted " +value+ " in the queue");
        }

    }

    //deQueue
    public int deQueue() {
        if (isEmpty()) {
            System.out.println("The Circular Queue is empty!");
            return -1;
        }
        else {
            int result = arr[beginningOfQueue];
            arr[beginningOfQueue] = 0;
            if (beginningOfQueue == topOfQueue) {//meaning only one element in the queue
                beginningOfQueue = topOfQueue = -1; //meaning queue becomes empty
            } else if (beginningOfQueue +1 == size) {//if it gets to the end of the array
                beginningOfQueue = 0;
            }
            else {
                beginningOfQueue++;
            }
            return result;
        }
    }





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
        System.out.println("Queue is successfully deleted");
    }
}
