package HeapSort;

public class BinaryHeap {
        int arr[];
        int sizeOfTree;

        BinaryHeap(int size) {
            this.arr = new int[size+1];
            this.sizeOfTree = 0;
            System.out.println("BinaryHeap has been created.");
        }

        //isEmpty
        public boolean isEmpty() { return sizeOfTree == 0; }

        public Integer peek() {
            if (isEmpty()) {
                System.out.println("Binary Heap is empty");
                return null;
            }
            return arr[1];
        }

        public int size() { return sizeOfTree; }

        //preOrder : root -> left -> right
        public void preOrder(int index) {
            if (index > sizeOfTree) {
                return;
            }
            System.out.print(arr[index] + " ");
            preOrder(index * 2);
            preOrder((index * 2) + 1);
        }

        //inOrder : left -> root -> right
        public void inOrder(int index) {
            if (index > sizeOfTree) {
                return;
            }
            inOrder(index * 2);
            System.out.print(arr[index] + " ");
            inOrder((index * 2) + 1);
        }

        //postOrder : left -> right -> root
        public void postOrder(int index) {
            if (index > sizeOfTree) {
                return;
            }
            postOrder(index * 2);
            postOrder((index * 2) + 1);
            System.out.print(arr[index] + " ");
        }

        //levelOrder
        public void levelOrder() {
            for (int i = 1; i <= sizeOfTree; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        //Heapify for Insert
        public void heapifyBottomToTop(int index, String heapType) {
            int parent = index / 2 ;
            if (index <= 1) { //meaning we are at the top
                return;
            }

            if (heapType == "Min") { //meaning the root of the tree is less than every node
                if (arr[index] < arr[parent]) { //if index/current is less than the parent, then swap
                    int temp = arr[index];
                    arr[index] = arr[parent];
                    arr[parent] = temp;
                }
            }
            else if (heapType =="Max") {
                if (arr[index] > arr[parent]) {
                    int temp = arr[index];
                    arr[index] = arr[parent];
                    arr[parent] = temp;
                }
            }
            heapifyBottomToTop(parent, heapType);
        }

        //insert - Time and space complexity - 0(LogN)
        public void insert(int value, String typeHeap) {
            arr[sizeOfTree+1] = value;
            sizeOfTree++;
            heapifyBottomToTop(sizeOfTree, typeHeap);
            System.out.println(value+" has been inserted.");
        }

        //Heapify for delete -
        public void heapifyToptoBottom(int parent, String heapType) {
            int leftParent = parent*2;
            int rightParent = (parent*2) +1;
            int swapChild=0;
            if (sizeOfTree < leftParent) return; //this means we've gotten to the top

            if (heapType =="Min") {
                if (sizeOfTree == leftParent) { //leaf node
                    if (arr[parent] > arr[leftParent]) {//if parent is less than which means it should swap
                        int temp = arr[parent];
                        arr[parent] = arr[leftParent];
                        arr[leftParent] = temp;
                    }
                    return;
                }
                else { //two children. take the greater child
                    if (arr[leftParent] < arr[rightParent]) {
                        swapChild = leftParent;
                    }
                    else {
                        swapChild = rightParent;
                    }
                    if (arr[parent] > arr[swapChild]) { //compare root node with the swapChild
                        int temp = arr[parent];
                        arr[parent] = arr[swapChild];
                        arr[swapChild] = temp;
                    }
                }

            }

            else if (heapType =="Max") {
                if (sizeOfTree == leftParent) { //leaf node
                    if (arr[parent] < arr[leftParent]) {//if parent is less than which means it should swap
                        int temp = arr[parent];
                        arr[parent] = arr[leftParent];
                        arr[leftParent] = temp;
                    }
                    return;
                }
                else { //two children. take the greater child
                    if (arr[leftParent] > arr[rightParent]) {
                        swapChild = leftParent;
                    }
                    else {
                        swapChild = rightParent;
                    }
                    if (arr[parent] < arr[swapChild]) { //compare root node with the swapChild
                        int temp = arr[parent];
                        arr[parent] = arr[swapChild];
                        arr[swapChild] = temp;
                    }
                }

            }
            heapifyToptoBottom(swapChild, heapType);
        }

        //extract - Time and space complexity 0(LogN)
        public int extract(String heapType) {
            if (isEmpty()) return -1;
            else {
                int extractedValue = arr[1]; //get the first
                arr[1] = arr[sizeOfTree]; //make the first node be the last node's value
                sizeOfTree--;
                heapifyToptoBottom(1, heapType);
                return extractedValue;
            }
        }

        //delete entire binary heap - Time and space complexity 0(1)
        public void deleteHeap() {
            arr = null;
            sizeOfTree = 0;
            System.out.println("Binary Heap has been successfully deleted");
        }


}
