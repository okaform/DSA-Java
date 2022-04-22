package SinglyLinkedList;

class Node {
    public int value;
    public Node nextReference;
}

public class SLL { //stacks.SLL means Singly Linked List

    public Node head;
    public Node tail;
    public int size;

    public Node createSinglyLinkedList(int nodeValue) {
        //head = new Node();
        //node is created so we can add the node value to both the head and the tail.
        //The data structure is of node that we created.
        Node copyNode = new Node();
        copyNode.nextReference = null;
        copyNode.value = nodeValue;

        head = copyNode;
        tail = copyNode;
        size = 1;


        return head;
    }

    //insert to linked List
    //there always has to be a head and tail
    public void insertInLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        //check if node is created, if not create one
        if (head == null) {
            createSinglyLinkedList(nodeValue);
            return;
        }
        else if (location == 0) { //check location parameters for inserting at the head
            node.nextReference = head;
            head = node; //make the new head equal to the node that has been inserted
        }
        else if (location >= size){ //if location is the same or greater than size of the list, that means add at the last
            node.nextReference = null;
            tail.nextReference = node; //this tail is actually referring to the last node in the list
            //what's the point of having tail.nextReference = node when we make
                                        //tail = node?
            tail = node; //make the tail to be the new node.
        }
        else { //insert at any given location
            Node tempNode = head;
            int index = 0;
            while (index < location -1) {
                tempNode = tempNode.nextReference;
                index++;
            }

            Node nextNode = tempNode.nextReference;
            tempNode.nextReference = node;
            node.nextReference = nextNode;
        }
        size++;
    }


    //SingleLinkedList Traversal
    public void traveseSinglyLinkedList() {
        if (head == null) { //check if the list exists or not
            System.out.println("Singly Linked List does not exist");
        }
        else {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.nextReference; //change the reference every time to go through the list
            }
        }
        System.out.println("\n");
    }

    //search for a node
    boolean searchNode(int nodeValue) { //right now, I think it is better to search using a boolean
        //and creating a separate class for that so that it can return it if it does find stuff.
        //I also need to remember to use try catch statements to catch common errors.
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.println("Found "+ nodeValue +" at location: " + i + "\n");
                    return true;
                }
                tempNode = tempNode.nextReference;
            }
        }
        System.out.println("Node not found!");
        return false;
    }

    //deleting a node from SinglyLinkedList
    public void deletionOfNode(int location) {
        if (head == null) {
            System.out.println("SinglyLinkedList does not exist.");
            return;
        }

        else if (location == 0) {
            //more than one element in the list
            head = head.nextReference; //set head reference to the second node.
            // we are using head because technically, head is also the first node
            size --; //don't forget to reduce the size

            if (size == 0) {//if size equals zero after deletion, then it means that there is only one element
                            //in the linked list and we have to set tail to null
                tail = null;
            }

        }

        else if (location>=size) {//delete a node at the end of the Linked List
            //more than one element in the list
            //find the node before the last node
            Node tempNode = head;
            for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.nextReference; //goto the next reference
            }
            if (tempNode == head) { //when we have only one element in our list
                tail = head = null; //set both head and tail to null
                size--;
                return;
            }
            //when we have more than one elements in the list
            tempNode.nextReference = null; //usually this would reference the last node, but since we are deleting
            //it has to reference to null and tail has to be the new tempNode.
            tail = tempNode;
            size --;

        }

        else  { //deleting at any given location
           Node tempNode = head;
           for ( int i = 0; i < location -1; i++) { //we are using this loop to find the node we want to delete
               //by finding the node before it.
               tempNode = tempNode.nextReference;
           }
           tempNode.nextReference = tempNode.nextReference.nextReference; //Points to the node after the node we want
            //to delete.
            size--;
        }
    }

    //delete entire SinglyLinkedList
    public void deleteSLL() {
        head = null;
        tail = null;
        System.out.println("stacks.SLL has been deleted successfully");
    }



}




