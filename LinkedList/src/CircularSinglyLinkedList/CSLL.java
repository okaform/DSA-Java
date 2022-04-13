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
            //System.out.println("new node ref is " + newNode.nextReference.value);

            head = newNode; //then points to the new node
            System.out.println("head ref is now " + newNode.nextReference.value);
            Node lastNode = head;
            for (int i = 0; i < size - 1; i++) { //loop through to get the last node in the list
                lastNode = lastNode.nextReference;
            }
            lastNode.nextReference = newNode; //this makes sure that the last node references this first Node
        }

        else if (location >= size) {//insert at the end of a list
            Node tempNode = head;

            for (int i = 0; i < size; i++) {
                System.out.println("size is "+size);
                tempNode= tempNode.nextReference;//keep moving through the nodes till we get to the last one
            }
            newNode.nextReference = head; //tempNode.nextReference; //let them have matching references


            //System.out.println("new node inserted reference is " + newNode.nextReference.value);
            tempNode.nextReference = newNode; //change the last node's reference to the new node

            //System.out.println("last node reference is " + tempNode.nextReference.value);

            tail = newNode; //change tail reference to point to the new node if size is = 0
            //tail.nextReference = head; //the reference should point to the first
        }

        else { //insert at any given location
            Node tempNode = head;
            int index = 0;
            while (index < location -1) {
                tempNode = tempNode.nextReference;
                index++;
            }

            Node nextNode = tempNode.nextReference;
            tempNode.nextReference =newNode;
            newNode.nextReference = nextNode;
        }

        size++; //increase the size
    }
}
