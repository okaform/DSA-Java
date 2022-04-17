package DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DLL dll = new DLL();
        dll.createDoublySinglyLinkedList(5);

        dll.insertLinkedList(31,10);
        dll.insertLinkedList(32,11);
        dll.insertLinkedList(33,12);
        dll.insertLinkedList(34,13);
        dll.insertLinkedList(35,14);

        System.out.println(dll.tail.value);

        dll.traverseDoublySinglyList();
        dll.reverseTraverse();

        dll.searchNode(31);
        dll.searchNode(564);

        dll.deleteNode(2);
        dll.traverseDoublySinglyList();

        dll.deleteNode(30);
        dll.traverseDoublySinglyList();


        dll.deleteDLL();
        dll.reverseTraverse();

        dll.searchNode(31);
        dll.searchNode(32);
        dll.searchNode(33);
        dll.searchNode(34);
        dll.searchNode(35);


    }
}
