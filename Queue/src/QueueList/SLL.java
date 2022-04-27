package QueueList;

class Node {
    public int value;
    public Node next;
    public Node prev;
}

public class SLL {
    public Node head;
    public Node tail;
    public int size;

    public Node createLinkedList(int nodeValue ) {
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next = null; //not necessary because it will be null 
        head = newNode;
        tail = newNode;
        size++;
        return head;
    }
    
    public void insertNode( int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createLinkedList(nodeValue);
            return;
        } else if (location == 0) { //insert at the top
            node.next = head;
            head = node;
        }
        else if (location >= size) { //insert at the end
            tail.next = node;
            tail = node;
        }
        else {
            int index = 0;
            Node tempNode = head;
            while (index < location -1) {
                tempNode = tempNode.next;
                index++;
            }
            node.next = tempNode.next;
            tempNode.next = node;

        }
        size++;
    }

    public void traverseList() {
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
                tempNode = tempNode.next; //change the reference every time to go through the list
            }
        }
        System.out.println("\n");
    }

    public void deletionOfNode(int location) {
        if (head == null) {
            System.out.println("SinglyLinkedList does not exist.");
            return;
        } else if (location == 0) {
            head = head.next;
            size--;
            if (size == 0) {
                tail = null;
            }
        } else if (location >= size) {
            Node tempNode = head;
            for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.next;
            }
            if (tempNode == head) {
                tail = head = null;
                size--;
                return;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;

        }
    }

    public void deleteList() {
        head = null;
        tail = null;
        System.out.println("The list has been deleted");
    }




}
