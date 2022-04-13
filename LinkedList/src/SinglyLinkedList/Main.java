package SinglyLinkedList;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        SLL sLL = new SLL();
        sLL.createSinglyLinkedList(5);
       // System.out.println(sLL.head.value);


        sLL.insertInLinkedList(6,1);
        sLL.insertInLinkedList(20,2);
        sLL.insertInLinkedList(7,3);
        sLL.insertInLinkedList(8,4);
        sLL.insertInLinkedList(9,5);

        sLL.traveseSinglyLinkedList();
        //sLL.deletionOfNode(5);
        sLL.deleteSLL();
        sLL.traveseSinglyLinkedList();



       // sLL.searchNode(50);
       // System.out.println(sLL.head.nextReference.nextReference.value);

/*        List<String> sdf = new LinkedList<String>();
        sdf.add("the");
        sdf.add("boy");
        sdf.add("is");
        sdf.add("here");
        sdf.add("now");
        System.out.println(sdf.getClass());*/

    }
}
