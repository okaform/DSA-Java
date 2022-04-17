package DoublyLinkedList;

class Node {
    public int value;
    public Node next;
    public Node prev;
}


public class DLL {
    public Node head;
    public Node tail;
    public int size;

    public Node createDoublySinglyLinkedList (int nodeValue) {
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next = null;
        newNode.prev = null;

        head = newNode;
        tail = newNode;
        size = 1;

        return head;
    }

    public void insertLinkedList(int nodeValue, int location) {
        Node newNode = new Node();
        newNode.value = nodeValue;

        if (head == null) {
            createDoublySinglyLinkedList(nodeValue);
            return;
        }
        else if (location == 0) { //insert at the start of the node
            newNode.next = head;
            newNode.prev = null;
            head.prev = newNode;
            head = newNode;
            size++;
        }

        else if (location >= size) { //insert at the end of the node
            newNode.prev = tail;
            newNode.next = null;
            tail.next = newNode;
            tail = newNode;
            size++;
        }
        else { //insert at any location of the node
            int index = 0;
            Node prevNode = head;
            while (index < location -1) { //loop until we get the node before the intended location
                prevNode = prevNode.next;
                index++;
            }//we could also loop to the intended location since we can directly access the previous Node now
            Node afterNode = prevNode.next;
            newNode.next = afterNode;
            afterNode.prev = newNode;

            newNode.prev = prevNode;
            prevNode.next = newNode;


            size++;
        }

    }

    public void traverseDoublySinglyList() {

        if (head == null) {
            System.out.println("List does not exist.");
        }

            else {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print(" --> ");
                }
                tempNode = tempNode.next;
            }
            System.out.println("\n");
        }
    }

    public void reverseTraverse() {
        if (head == null) {
            System.out.println("List does not exist.");
        }
        else {
            Node tempNode = tail;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i !=size -1) {
                    System.out.print( " <-- ");
                }
                tempNode = tempNode.prev;
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
                    System.out.println("Found "+ nodeValue +" at location: " + i + "\n");
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found!");
        return false;
    }

    //delete Node
    public void deleteNode(int location) {
        if (head == null) {
            System.out.println("Doubly Linked List doesn't exists.");
            return;
        }
        else if (location == 0) {
            head = head.next;
            head.prev = null;
            size--;
            if (size == 0) {
                tail = head = null;
            }
        }
        else if (location >= size) {

            if (size == 1) {//only one element in the list
                head = tail = null;
                size--;
                return;
            }
            tail = tail.prev;
            tail.next = null;
            size--;
        }
        else {
            int index = 0;
            Node toDelete = head;
            while (index < location) {
                toDelete = toDelete.next;
                index++;
            }
            Node prev = toDelete.prev;
            Node after = toDelete.next;

            prev.next = after;
            after.prev = prev;
            size--;
        }
    }

    public void deleteDLL() {
        if (head == null) {
            System.out.println("The CSLL does not exist!");
        }
        else {
            head = null;
            tail = null;
            System.out.println("CSLL has been deleted successfully. ");
        }
    }
}
