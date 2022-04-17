package CircularSinglyLinkedList;

class Node {
    public int value;
    public Node nextReference;
}

public class CSLL {

    public Node head;
    public Node tail;
    public int size;

    public Node createCircularSinglyLinkedList (int nodeValue) {
        Node newNode = new Node(); //create the node
        newNode.value = nodeValue; //assign the node value
        newNode.nextReference = newNode; //assign the reference to itself

        head = newNode; //head = node and tail = node
        tail = newNode;
        size = 1;
        return head;
    }
    public void insertLinkedList(int nodeValue, int location) {
        Node newNode = new Node();
        newNode.value = nodeValue;

        if (head == null) { //check if the list exists
            createCircularSinglyLinkedList(nodeValue);
            return;
        }

        else if (location == 0) { //insert at the head
            newNode.nextReference = head; //new node should point to the head which points to the first node
            tail.nextReference = newNode; //Point the last node reference to the newly added first node
            head = newNode; //change the head to new node
        }

        else if (location >= size) {//insert at the end of a list
            newNode.nextReference = head;
            tail.nextReference = newNode;
            tail = newNode;
        }

        else { //insert at any given location
            Node tempNode = head;
            int index = 0;
            while (index < location -1) {
                tempNode = tempNode.nextReference;
                index++;
            }

            newNode.nextReference = tempNode.nextReference;
            tempNode.nextReference = newNode;
        }

        size++; //increase the size
    }


    public void traverseCircularSinglyLinkedList() {
        if (head == null) {
            System.out.println("Circular Singly Linked List does not exist.");
        }
        else {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size -1) { //prints this out every time except for the last value
                    System.out.print(" -> ");
                }
                tempNode = tempNode.nextReference;
            }
            System.out.println("\n");
        }
    }

    //search for a node
    boolean searchNode(int nodeValue) {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.println("We found the value " + nodeValue + " at location " + i + "\n");
                    return  true;
                }
                tempNode = tempNode.nextReference;
            }
        }
        System.out.println("Node not found");
        return false;
    }

    //delete Node
    public void deleteNode(int location) {
        if (head == null) {
            System.out.println("Circular Singly Linked List doesn't exists.");
            return;
        }
        else if (location == 0) {
            head = head.nextReference;
            tail.nextReference = head;
            size--;
            if (size == 0) {
                tail = head = null;
                head.nextReference = null;
            }
        }
        else if (location >= size) {
            Node tempNode = head;
            for (int i = 0; i < size -1; i++) { //loop until we get to the node just before the last node
                tempNode = tempNode.nextReference;
            }
            if (tempNode == head) {//only one element in the list
                head = tail = null;
                head.nextReference = null;
                size--;
                return;
            }

            tempNode.nextReference = head;
            tail = tempNode;
            size--;
        }
        else {
            int index = 0;
            Node tempNode = head;
            while (index < location -1) {
                tempNode = tempNode.nextReference;
                index++;
            }
            Node toDelete = tempNode.nextReference;
            tempNode.nextReference = toDelete.nextReference;
            size--;
        }
    }

    public void deleteCSLL() {
        if (head == null) {
            System.out.println("The CSLL does not exist!");
        }
        else {
            head = null;
            tail.nextReference = null;
            tail = null;
            System.out.println("CSLL has been deleted successfully. ");
        }
    }
}
