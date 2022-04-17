package CircularSinglyLinkedList;

public class Main {

    public static void main(String[] args) {
        CSLL csll = new CSLL();
        csll.createCircularSinglyLinkedList(5);

        csll.insertLinkedList(50,0);
        csll.insertLinkedList(51,4);
        csll.insertLinkedList(52,10);
        csll.insertLinkedList(45, 1);
        csll.searchNode(87);
        csll.searchNode(45);




        System.out.println(csll.head.value);
        System.out.println(csll.head.nextReference.value);
        System.out.println(csll.tail.value);
        System.out.println(csll.tail.nextReference.value);
        System.out.println("The size of the list is :"+csll.size);

        csll.traverseCircularSinglyLinkedList();


        csll.deleteNode(45);

        csll.traverseCircularSinglyLinkedList();


    }
}
