package stacks;

import stacks.SLL;

public class StackinList {

    SLL singleLinkedList;


    public StackinList () {
        singleLinkedList = new SLL();
    }


    //push method
    public void push (int value) {
        singleLinkedList.insertInLinkedList(value, 0); //everytime, it will be zero
        System.out.println("Inserted "+ value +" in stacks.Stack List.");
    }

    //isEmpty method

    public boolean isEmpty() {
        if (singleLinkedList.head == null) { //if the head is null, then the stack is empty
            return true;
        }
        return false;
    }

    //pop method
    public int pop() {
        int result = -1;
        if (isEmpty()) {
            System.out.println("StackList is empty.");
        }
        else {
            result = singleLinkedList.head.value; //make the result equals to the head
            singleLinkedList.deletionOfNode(0);//this class does everything
        }

        return result;
    }

    //peek method
    public int peek() {
        if (isEmpty()) {
            System.out.println("StackList is empty.");
            return -1;
        }
        else {
            return singleLinkedList.head.value;
        }
    }

    //delete method
    public void deleteStackList() {
        singleLinkedList.head = null;
       System.out.println("StackList is deleted.");
    }
}


