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
}
