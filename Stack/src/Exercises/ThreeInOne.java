package Exercises;

public class ThreeInOne {
    private int numberOfStacks = 3;
    private int stackCapacity;
    private int[] values;
    private int[] sizes;//sizes of each array

    public ThreeInOne(int stackSize) {
        stackCapacity = stackSize;
        values = new int[stackSize * numberOfStacks];
        sizes = new int[numberOfStacks];
    }

    //isFull
    public boolean isFull(int stackNumber) {
        //stackNumber represents each of the stack
        return sizes[stackNumber] == stackCapacity;
    }

    //isEmpty
    public boolean isEmpty(int stackNumber) {
        return sizes[stackNumber] == 0;
    }

    private int indexOfTop(int stackNumber) {//to return the top of stack of any
        //given stack in the array
        int offset = stackNumber * stackCapacity;
        int size = sizes[stackNumber];//get the size of the stack
        return offset + size -1;
    }

    //push
    public void push(int stackNumber, int value) {
        if (isFull(stackNumber)) {
            System.out.println("The stack is full");
        }
        else {
            sizes[stackNumber]++;
            values[indexOfTop(stackNumber)] = value;
        }
    }

    //pop
    public int pop(int stackNumber) {
        if (isEmpty(stackNumber)) {
            System.out.println("The stack is empty");
            return -1;
        }

        else {
            int result = values[indexOfTop(stackNumber)];
            values[indexOfTop(stackNumber)] = 0;
            sizes[stackNumber]--;
            return result;
        }
    }

    public int peek(int stackNumber) {
        if (isEmpty(stackNumber)) {
            System.out.println("The stack is empty");
            return -1;
        }
        else {
            return values[indexOfTop(stackNumber)];
        }

    }
}
