package BTArray;

public class Main {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree(9);

        bt.insert("N1");
        bt.insert("N2");
        bt.insert("N3");
        bt.insert("N4");
        bt.insert("N5");
        bt.insert("N6");
        bt.insert("N7");
        bt.insert("N8");
        bt.insert("N9");
        System.out.println("\n");

        bt.preOrder(1);

        System.out.println("\nInOrder Traversal");
        bt.inOrder(1);

        System.out.println("\npostOrder Traversal");
        bt.postOrder(1);

        System.out.println("\nlevelOrder Traversal");
        bt.levelOrder();

        System.out.println("\nSearch");
        bt.search("N2");

        System.out.println("\ndelete");
        bt.deleteNode("N2");

        System.out.println("\nlevelOrder Traversal");
        bt.levelOrder();

        System.out.println("\nSearch");
        bt.search("N2");

    }

}
