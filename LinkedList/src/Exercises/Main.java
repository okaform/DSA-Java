package Exercises;

public class Main {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.createLL(3);
        ll.insertNode(1);
        ll.insertNode(5);
        ll.insertNode(9);

        LinkedList ll2 = new LinkedList();
        ll2.createLL(2);
        ll2.insertNode(4);
        ll2.insertNode(6);

        removeDups q = new removeDups();
        q.addSameNode(ll, ll2, 7);
        q.addSameNode(ll, ll2, 2);
        q.addSameNode(ll, ll2, 1);

        Node intersection = q.findIntersection(ll, ll2);
        System.out.println(intersection.value);


    /*    ll2.traverseLL();
        ll.traverseLL();


        removeDups.sumList(ll, ll2);
        LinkedList q = new LinkedList();
        q = removeDups.sumListProf(ll, ll2);

        q.traverseLL();*/


    }
}


