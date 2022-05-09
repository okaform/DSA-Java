package BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(70);
        bst.insert(50);
        bst.insert(90);
        bst.insert(30);
        bst.insert(60);
        bst.insert(80);
        bst.insert(100);
        bst.insert(20);
        bst.insert(40);

        System.out.println("\npreOrder");
        bst.preOrder(bst.root);

        System.out.println("\ninOrder");
        bst.inOrder(bst.root);

        System.out.println("\npostOrder");
        bst.postOrder(bst.root);

        System.out.println("\nlevelOrder");
        bst.levelOrder();

        System.out.println("\nsearch");
        bst.search(30);

        System.out.println("\nlevelOrder");
        bst.deleteNode(bst.root, 90);
        bst.levelOrder();

    }
}
