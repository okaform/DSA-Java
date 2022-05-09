package BinaryHeap;

public class Main {
    public static void main(String[] args) {
        BinaryHeap bh = new BinaryHeap(5);
        bh.insert(10, "Max");
        bh.insert(5, "Max");
        bh.insert(15, "Max");
        bh.insert(1, "Max");
        bh.peek();

        System.out.println("\nPreOrder");
        bh.preOrder(1);

        System.out.println("\ninOrder");
        bh.inOrder(1);

        System.out.println("\nPostOrder");
        bh.postOrder(1);

        System.out.println("\nlevelOrder");
        bh.levelOrder();

        System.out.println(bh.extract("Max"));
        bh.levelOrder();
    }
}
