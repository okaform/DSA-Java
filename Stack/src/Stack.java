public class Stack {

    int[] arr;
    int topOfStack;

    public Stack (int size) {
        this.arr = new int[size];
        this.topOfStack = -1; //this means that stack is empty
        System.out.println("The Stack is created with size of: " + size);
    }

    //isEmpty
    public boolean isEmpty() {
        if (topOfStack == -1) {
            return true;
        }
        return false;
    }

    //isFull Method
    public  boolean isFull() {
        if (topOfStack == arr.length -1) {
            System.out.println("The stack is full!");
            return true;
        }
        return false;
    }

    //push method
    public void push (int value) {
        if (isFull()) {
            System.out.println("The Stack is full!");
        }
        else {
            arr[topOfStack+1] = value; //add to the array. it will start at one
            topOfStack++; //increase the size of topOfStack
            System.out.println("The value "+value+" is successfully inserted");
        }
    }


    //pop method
    public int pop () {
        if (isEmpty()) {
            System.out.println("The Stack is empty");
            return -1;
        }
        else {
            int topStack = arr[topOfStack];//make topStack equal to the value in the array
            topOfStack --; //decrease top of Stack since we are going down
            return topStack; //return the top of stack that we deleted
        }
    }

    //Peek method
    public int peek() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            return -1;
        }
        else {
            return arr[topOfStack];
        }
    }

    //delete method
    public void deleteStack() {
        arr = null;
        topOfStack= -1;
        System.out.println("The Stack is successfully deleted");
    }
}
