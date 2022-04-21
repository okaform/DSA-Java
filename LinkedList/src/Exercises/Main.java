package Exercises;

public class Main {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.createLL(1);
        ll.insertNode(2);
        ll.insertNode(56);
        ll.insertNode(4);
        ll.insertNode(5);

        ll.traverseLL();


        //removeDups.dups(ll);

        ll.traverseLL();

        System.out.println(removeDups.nthToLast(ll, 30));


    }
}


