package Exercises;

public class StackMin {
    Node top;
    Node min;


    public StackMin() {
        top = null;
        min = null;

    }

    public int min() {
        return min.value;
    }

    //push method
    public void push(int value) {
        if (min == null) {
            min = new Node(value, min);
        }
        else if (min.value < value) {
            min = new Node(min.value, min);
        }
        else {
            min = new Node(value, min);
        }
        top = new Node(value, top);

    }
/*    //isFull Method
    public boolean isFull() {
        return topOfStack == arr.length -1;
    }

    //isEmpty method
    public boolean isEmpty() {
        return topOfStack == -1;
    }



    public int pop() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            return -1;
        }
        else {
            return min;
        }

    }*/

}
