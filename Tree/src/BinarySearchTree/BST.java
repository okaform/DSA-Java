package BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class BST {
     node root;

    BST() {
        this.root = null;
    }

    //insert
    private node inserts(node currentNode, int value) {
        if (currentNode == null) {//if empty
            node node = new node();
            node.value = value;
            //System.out.println("Node is successfully inserted to the Tree");
            return node;
        }
        else if (value <= currentNode.value) {//if less than
            currentNode.left = inserts(currentNode.left, value);
            return currentNode;
        }
        else {
            currentNode.right = inserts(currentNode.right, value);
            return currentNode;
        }
    }
    public void insert(int value) {
        root = inserts(root, value);
    }

    //preOder Traversal
    void preOrder(node node) {//root -> left -> right
        if (node == null) {
            return;
        }
            System.out.print(node.value+" ");
            preOrder(node.left);
            preOrder(node.right);
    }

    //inOder Traversal
    void inOrder(node node) {//left  -> root-> right
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.value +" ");
        inOrder(node.right);
    }

    //postOder Traversal
    void postOrder(node node) {//left -> right -> root
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value+" ");
    }

    //levelOrder Traversal
    void levelOrder() {
        Queue<node> queue = new LinkedList<>();
        queue.add(root);
        node node = new node();
        while (!queue.isEmpty()) {
            node = queue.remove();
            System.out.print(node.value +" ");
            if (node.left !=null) queue.add(node.left);
            if (node.right !=null) queue.add(node.right);
        }
    }

    //search node
    private node search(node node, int value) {
        if (node == null) {
            System.out.println(value + "not found");
            return null;
        }
        else if (node.value == value) {
            System.out.println(value+" found");
            return node;
        }
        else if (value < node.value) {
            return search(node.left, value);
        }
        else {
            return search(node.right, value);
        }
    }
    void search(int value) {
        search(root, value);
    }

    //delete method - Minimum node in the right
    public static node minimumNode(node root) {/*this method finds the minimum node of the right sub tree
    which is a criteria when deleting a node with 2 children*/
        if (root.left == null) {
            return root;
        }
        else {
            return minimumNode(root.left);
        }
    }
    //delete method - delete node
    public node deleteNode(node root, int value) {
        if (root == null) {
            System.out.println(value + "not found in BST");
            return null;
        }
        if (value < root.value) {
            root.left = deleteNode(root.left, value);
        } else if (value > root.value) {
            root.right = deleteNode(root.right, value);
        }
        else {
            if (root.left!=null && root.right!=null) {//node has two children
                node temp = root;
                node minNodeForRight =  minimumNode(temp.right);//find the min node of the right child
                root.value = minNodeForRight.value;
                root.right = deleteNode(root.right, minNodeForRight.value);
            }
            else if(root.left !=null) {//only one child - left
                    root = root.left;
            }
            else if(root.right !=null) {//only one child - right
                root = root.right;
            }
            else {//leaf node
                root = null;
            }
        }

        return root;
    }

    //delete
    public void deleteBST() {
        root = null;
        System.out.println("BST has been deleted successfully.");
    }
}
