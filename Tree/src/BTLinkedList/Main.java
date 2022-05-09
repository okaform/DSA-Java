package BTLinkedList;

public class Main {
    public static void main(String[] args) {
        BinaryTreeLL bt = new BinaryTreeLL();

        BinaryNode n1 = new BinaryNode();
        n1.value = "N1";
        BinaryNode n2 = new BinaryNode();
        n2.value = "N2";
        BinaryNode n3 = new BinaryNode();
        n3.value = "N3";
        BinaryNode n4 = new BinaryNode();
        n4.value = "N4";
        BinaryNode n5 = new BinaryNode();
        n5.value = "N5";
        BinaryNode n6 = new BinaryNode();
        n6.value = "N6";
        BinaryNode n7 = new BinaryNode();
        n7.value = "N7";
        BinaryNode n8 = new BinaryNode();
        n8.value = "N8";
        BinaryNode n9 = new BinaryNode();
        n9.value = "N9";

        n1.left = n2;      n1.right = n3;
        n2.left = n4;      n3.left = n6;
        n2.right = n5;     n3.right = n7;
        n4.left = n8;
        n4.right = n9;

        bt.root = n1;

        System.out.println("preOrder");
        bt.preOrder(n1);
        System.out.println("\nInOrder");
        bt.inOrder(n1);
        System.out.println("\nPostOrder");
        bt.postOrder(n1);
        System.out.println("\nlevelOrder");
        bt.levelOrder();

        bt.search("N2");

        BinaryTreeLL bt2 = new BinaryTreeLL();
        bt2.insert("N1");
        bt2.insert("N2");
        bt2.insert("N3");
        bt2.insert("N4");
        bt2.insert("N5");
        bt2.insert("N6");

        System.out.println("\n");

        bt2.levelOrder();

        bt2.deleteDeepestNode();
        System.out.println("\n");
        bt2.deleteNode("N3");
        bt2.levelOrder();
        bt.deleteTree();
    }
}
