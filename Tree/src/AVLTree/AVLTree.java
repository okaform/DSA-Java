package AVLTree;

import javax.management.Query;
import java.util.LinkedList;
import java.util.Queue;

public class AVLTree {
    public node root;

    AVLTree() {
        this.root = null;
    }

    //traverse : preOrder: root -> left -> right
    public void preOrder(node root) {
        if (root == null) {
            return;
        }
        System.out.print(root + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    //traverse : inOrder: left -> root -> right
    public void inOrder(node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root + " ");
        inOrder(root.right);
    }

    //traverse : postOrder:  left -> right -> root
    public void postOrder(node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root + " ");
    }

    //traverse: levelOrder
    public void levelOrder() {
        Queue<node> queue = new LinkedList<node>();
        queue.add(root);
        while (!queue.isEmpty()) {
            node node = new node();
            node = queue.remove();
            System.out.print(node.value + " ");
            if (node.left !=null) queue.add(node.left);
            if (node.right !=null) queue.add(node.right);
        }
    }

    //search
    public node search(node node, int value) {
        if (node == null) {
            System.out.println(value+ " not found");
            return null;
        }
        if (node.value == value) {
            System.out.println(value +" found");
            return node;
        } else if (value < node.value) {
            return search(node.left, value);
        } else {
            return search(node.right, value);
        }
    }

    public void search(int value) {
        search(root, value);
    }

    //helper functions - getHeight
    public int getHeight(node node) {
        if (node == null) return 0;
        return node.height;
    }

    //rotateRight
    private node rotateRight(node disbalancedNode) {
        node newRoot = disbalancedNode.left;
        disbalancedNode.left = disbalancedNode.left.right;
        newRoot.right = disbalancedNode;
        disbalancedNode.height = 1 + Math.max(getHeight(disbalancedNode.left), getHeight(disbalancedNode.right));
        newRoot.height = 1 + Math.max(getHeight(newRoot.left), getHeight(newRoot.right));
        return newRoot;
    }

    //rotateLeft
    private node rotateLeft(node disbalancedNode) {
        node newRoot = disbalancedNode.right;
        disbalancedNode.right = disbalancedNode.right.left;
        newRoot.left = disbalancedNode;
        disbalancedNode.height = 1 + Math.max(getHeight(disbalancedNode.left), getHeight(disbalancedNode.right));
        newRoot.height = 1 + Math.max(getHeight(newRoot.left), getHeight(newRoot.right));
        return newRoot;
    }

    //getBalanced
    public int getBalance(node node) {
        if (node == null) return 0;
        return getHeight(node.left) - getHeight(node.right);
    }

    //insertNode Method
    private node insert(node node, int value) {
        if (node == null) {
            node newNode = new node();
            newNode.value = value;
            newNode.height = 1;
            return newNode;
        }
        else if (value < node.value) {
            node.left = insert(node.left, value);
        }
        else {
            node.right = insert(node.right, value);
        }
        node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));
        int balance = getBalance(node);
        //conditions
        if (balance > 1 && value < node.left.value) {//Left-left condition
            return rotateRight(node);
        }
        if ( balance > 1 && value > node.left.value) {//left-right condition
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }
        if (balance < -1 && value > node.right.value) {//right-right condition
                return rotateLeft(node);
        }
        if (balance < -1 && value < node.right.value) {
            node.right = rotateRight(node.right); //right-left condition
            return rotateLeft(node);
        }

        return node;
    }

    //public insert method
    public void insert(int value) {
        root = insert(root, value);
    }

    //delete method - Minimum node in the right
    public static node minimumNode(node root) {
        if (root.left == null) {
            return root;
        }
        else {
            return minimumNode(root.left);
        }
    }

    //delete method
    private node deleteNode(node root, int value) {
        if (root == null) {
            System.out.println(value+ " not fount in AVL Tree");
            return root;
        }
        if (value < root.value) {//keep going left of the tree
            root.left = deleteNode(root.left, value);
        }
        else if (value > root.value) {//keep going right of the tree
            root.right = deleteNode(root.right, value);
        }
        else {
            if (root.left != null && root.right != null) {//node has two children
                node temp = root;
                node minNodeForRight = minimumNode(temp.right);//find the minimum node of the right child
                root.value = minimumNode(temp.right).value; //change the value of the root to the minimum value found
                root.right = deleteNode(root.right, minNodeForRight.value);
            } else if (root.left != null) {//node has one child - left
                root = root.left;
            } else if (root.right != null) {//node has one child - right
                root = root.right;
            } else {//leaf node
                root = null; //the actual deletion
            }
        }
        //CHECKING FOR BALANCE
        //root.height = 1 - Math.max(getHeight(root.left), getHeight(root.right));
        int balance = getBalance(root);
        //conditions
        if (balance > 1 && getBalance(root.left)>=0) {//Left-left condition
            return rotateRight(root);
        }
        if ( balance > 1 && getBalance(root.left)<0) {//left-right condition
            root.left = rotateLeft(root.left);
            return rotateRight(root);
        }
        if (balance < -1 && getBalance(root.right)<=0) {//right-right condition
            return rotateLeft(root);
        }
        if (balance < -1 && getBalance(root.right)>0) {
            root.right = rotateRight(root.right); //right-left condition
            return rotateLeft(root);
        }
        return root;

        }

        public void delete(int value) {
            root = deleteNode(root, value);
        }

        public void deleteAVL(){
            root = null;
            System.out.println("AVL Tree has been deleted");
        }


}
