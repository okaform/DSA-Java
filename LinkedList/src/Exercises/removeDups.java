package Exercises;

import java.util.HashSet;

//remove duplicate from a linkedlist
public class removeDups {

    public static void dups(LinkedList list) {
        HashSet<Integer> hs = new HashSet();
        Node currNode = list.head;
        Node prev = null;

        while (currNode != null) {//keep looking until we get to the tail
            int curVal = currNode.value;
            if (hs.contains(curVal)) {//if hashset contains the value. then delete it
                prev.next = currNode.next;
                list.size--;
            }
            else {
                hs.add(curVal); //add to the set
                prev = currNode;
            }
            currNode = currNode.next;
        }


    }

    //this returns the specified number from the last elements
    public static int nthToLast(LinkedList list, int number) {
        Node currNode = list.head;
        Node prev = null;

        if (number >= list.size) {
            return currNode.value;
        }
        else {
            int index = 0;
            int loopSize = list.size - number;
            while(index != loopSize) {
                currNode = currNode.next;
                index++;
            }

            return currNode.value;

        }

    }

    public static LinkedList partition(LinkedList list, int value) {
        Node currNode = list.head;
        list.tail = list.head; //point the head to the tail

        while (currNode != null) {
            Node next = currNode.next;
            if(currNode.value < value) {
                currNode.next = list.head; //insert at the beginning of list
                list.head = currNode;
            }
            else {
               list.tail.next = currNode;
               list.tail = currNode;
            }
            currNode = next;
        }
       // list.tail.next = null;
         return  list;
    }

/*This function takes two lists and returns the addition of the reversed of both lists*/
    public static LinkedList sumList(LinkedList ll, LinkedList ll2) {
        String string1 = "";
        String string2 = "";
        Node tempNode = ll.head;
        Node tempNode2 = ll2.head;

        for (int i = 0; i < ll.size; i++) {
            string1 += tempNode.value;
            string2 += tempNode2.value;

            tempNode = tempNode.next;
            tempNode2 = tempNode2.next;
        }
        StringBuilder reversed1 = new StringBuilder(string1);
        StringBuilder reversed2 = new StringBuilder(string2);
        reversed1.reverse();
        reversed2.reverse();

        int added = Integer.parseInt(reversed1.toString()) + Integer.parseInt(reversed2.toString());

        String flippedString = String.valueOf(added);

        LinkedList flipped = new LinkedList();
        for (int i = 0; i < flippedString.length(); i++) {
            System.out.println("Flipped ds " +flippedString.charAt(i));
            flipped.insertNode(Integer.parseInt(String.valueOf(flippedString.charAt(i))));
        }
        flipped.traverseLL();
        return flipped;
    }

    public static LinkedList sumListProf(LinkedList ll, LinkedList ll2) {
        Node n1 = ll.head;
        Node n2 = ll2.head;
        int carry = 0;
        LinkedList resultLL = new LinkedList();
        while(n1 != null || n2 != null) {
            int result = carry;
            if (n1 != null) {
                result += n1.value;
                n1 = n1.next;
            }
            if (n2 != null) {
                result += n2.value;
                n2 = n2.next;
            }
            resultLL.insertNode(result%10); //to get the last digit
            carry = result/10; //this carries the result over to the next function
        }
        return resultLL;
    }

    //Intersection method
    //get the kthNode
    public static Node getKthNode(Node head, int k) {
        Node current = head;
        while(k > 0 && current != null) {
            current = current.next;
            k--;
        }
        return current;
    }
    public static Node findIntersection(LinkedList ll, LinkedList ll2) {
        if (ll.head == null || ll2.head == null) return null;
        if (ll.tail != ll2.tail) return null;// their tails must be the same if they are intersecting
        Node shorter = new Node();
        Node longer = new Node();

        if (ll.size > ll2.size) {//find the longer size of the two
            longer = ll.head;
            shorter = ll2.head;
        }
        else {
            longer = ll2.head;
            shorter = ll.head;
        }
        //ignore some elements of the longer lists
        longer = getKthNode(longer, Math.abs(ll.size - ll2.size));
        while (shorter != longer) {
            shorter = shorter.next;
            longer = longer.next;
        }
        return longer;
    }
    //add same node
    public static void addSameNode(LinkedList ll, LinkedList ll2, int nodevalue) {
        Node newNode = new Node();
        newNode.value = nodevalue;
        ll.tail.next = newNode;
        ll.tail = newNode;
        ll2.tail.next = newNode;
        ll2.tail = newNode;

    }

}
