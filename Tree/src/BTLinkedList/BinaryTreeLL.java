package BTLinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLL {
    BinaryNode root;

    public BinaryTreeLL() {
        this.root = null;
    }

    //Depth first Search - PreOrder Traversal
    void preOrder(BinaryNode node) { //root -> left -> right
        if (node == null) { //base condition - when we reach a leaf node
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left); //do the left then
        preOrder(node.right); //do the right
    }

    //inOrder Traversal
    void inOrder(BinaryNode node) {//left -> root -> right
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    //postOrder Traversal
    void postOrder(BinaryNode node) {//left -> right -> root
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value+ " ");

    }

    //levelOrder Traversal
    void levelOrder() {//levelOrder
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            System.out.print(presentNode.value + " ");
            if (presentNode.left !=null) {
                queue.add(presentNode.left);
            }
            if (presentNode.right !=null) {
                queue.add(presentNode.right);
            }
        }
    }

    //Search Method - using Level Order traversal
    public void search(String value) {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            if (presentNode.value == value) {
                System.out.println("\nThe Value - "+ value +" is found in the tree");
                return;
            }
            else {
                if (presentNode.left != null) {
                    queue.add(presentNode.left);
                }
                if (presentNode.right != null) {
                    queue.add(presentNode.right);
                }
            }
        }
        System.out.println("The Value - "+ value +" is not found in the tree");
    }

    public void insert(String value) { //we use levelOrder traversal for adding in tree
        BinaryNode node = new BinaryNode();
        node.value = value;
        if (root == null) {
            root = node;
            System.out.println("Inserted new node at Root");
            return;
        }
        else {
            Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
            queue.add(root);
            while(!queue.isEmpty()) {
                BinaryNode presentNode = queue.remove();
                if (presentNode.left == null) {
                    presentNode.left = node;
                    System.out.println("Successfully Inserted.");
                    break;
                }
                else if (presentNode.right == null) {
                    presentNode.right = node;
                    System.out.println("Successfully Inserted.");
                    break;
                }
                else {
                    queue.add(presentNode.left);
                    queue.add(presentNode.right);
                }
            }
        }

    }
    //get the Deepest node
    public BinaryNode getDeepestNode() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode presentNode = null;
        while(!queue.isEmpty()){
            presentNode = queue.remove();
            if (presentNode.left != null) {
                queue.add(presentNode.left);
            }
            if (presentNode.right != null) {
                queue.add(presentNode.right);
            }
        }
        return presentNode; //the last node is the deepest node
    }

    //delete deepest Node
    public void deleteDeepestNode() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode prev, curr = null;
        while(!queue.isEmpty()){
            prev = curr;
            curr = queue.remove();
            if (curr.left == null) {
                curr.right = null;
                return;
            }
            else if (curr.right == null) {
                curr.left = null;
                return;
            }
            queue.add(curr.left);
            queue.add(curr.right);
        }
    }

    //Delete Given Node
    void deleteNode(String value) {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            if (presentNode.value == value) {
                presentNode.value = getDeepestNode().value;
                deleteDeepestNode();
                System.out.println("The node is deleted");
                return;
            }
            else {
                if (presentNode.left !=null) queue.add(presentNode.left);
                if (presentNode.right !=null) queue.add(presentNode.right);
            }
        }
        System.out.println("The node does not exist in the binary tree");
    }

    void deleteTree() {
        root = null;
        System.out.println("Binary Tree has been deleted!");
    }

}
