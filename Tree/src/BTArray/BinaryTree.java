package BTArray;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    String[] arr;
    int lastUsedIndex;

    BinaryTree(int size) {
        this.arr = new String[size+1];
        this.lastUsedIndex = 0;
        System.out.println("Blank tree of size "+size+ " has been created");
    }

    //isFull
    public boolean isFull() {
        return arr.length - 1 == lastUsedIndex;
    }

    //insert method
    public void insert(String value) {
        if (!isFull()) {
            arr[lastUsedIndex+1] =value;
            lastUsedIndex++;
            System.out.println("THe value of "+value+" has been successfully inserted.");
        }
        else {
            System.out.println("The Binary Tree is full");
        }
    }

    //preOrder : root -> left -> right
    public void preOrder(int index) {
        if (index > lastUsedIndex) {
            return;
        }
        System.out.print(arr[index] + " ");
        preOrder(index * 2);
        preOrder((index * 2) + 1);
    }

    //inOrder : left -> root -> right
    public void inOrder(int index) {
        if (index > lastUsedIndex) {
            return;
        }
        inOrder(index * 2);
        System.out.print(arr[index] + " ");
        inOrder((index * 2) + 1);
    }

    //postOrder : left -> right -> root
    public void postOrder(int index) {
        if (index > lastUsedIndex) {
            return;
        }
        postOrder(index * 2);
        postOrder((index * 2) + 1);
        System.out.print(arr[index] + " ");
    }

    //levelOrder
    public void levelOrder() {
        for (int i = 1; i <= lastUsedIndex; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //search method
    public int search(String value) {
        for (int i = 1 ; i <=lastUsedIndex ; i++) {
            if (arr[i] == value) {
                System.out.println(value +" exists at the location " + i);
                return i;
            }
        }
        System.out.println("The value does not exist.");
        return -1;
    }

    //delete from tree
    public void deleteNode(String value) {
        for (int i = 1; i <=lastUsedIndex; i++) {
            if (arr[i] == value) {
                arr[i] = arr[lastUsedIndex];
                lastUsedIndex--;
                System.out.println("The value "+value+ " has been deleted");
                return;
            }
        }
        System.out.println(value +" not found.");
    }
    public void deleteProf(String value) {
        int location = search(value);
        if (location == -1) {
            return;
        }
        else {
            arr[location] = arr[lastUsedIndex];
            lastUsedIndex--;
            System.out.println("The value "+value+ " has been deleted");
        }
    }

    void deleteTree() {
        try {
            arr = null;
            System.out.println("Tree has been successfully deleted");
        }
        catch (Exception e) {
            System.out.println("There was an error deleting the tree");
        }

    }
}
