package QueueList;

public class QueueList {

    public SLL list;


    public QueueList() {
        this.list = new SLL();
        System.out.println("The Queue List is successfully created.");
    }

    //isEmpty
    public boolean isEmpty() {
        return list.head == null;
    }

    //enQueue
    public void enQueue(int value) {
        list.insertNode(value, list.size); //we use the size of the list to insert
        // at the end of the list
        System.out.println("Successfully inserted " +value+ " in the queue");
    }

    //deQueue method
    public int deQueue() {
        int result = -1;
        if (list.head == null) {
            System.out.println("The Queue list is empty");
        }
        else {
            result = list.head.value;
            list.deletionOfNode(0);
        }
        return result;
    }

    //peek method
    public int peek() {
        if (list.head != null) {
            return list.head.value;
        }
        else {
            System.out.println("The Queue list is empty");
            return -1;
        }
    }

    //delete
    public void deleteQueue() {
        list.head = null;
        list.tail = null;
        System.out.println("The Queue List has been successfully deleted");
    }
}
