package LinearProbing;
import java.util.ArrayList;

public class LinearProbing {
    String[] hashTable;
    int usedCellNumber;

    LinearProbing(int size) {
       this.hashTable = new String[size];
       this.usedCellNumber = 0;
    }

    //hash function -probably 0(N) time and space complexity
    public int modASCIIHashFunction(String word, int M) {
        char ch[] = word.toCharArray(); //convert the string to a char Array
        int i, sum;
        for (sum = 0, i = 0; i< word.length(); i++) {
            sum = sum  + ch[i]; //we are adding the ASCII character values...
        }
        return sum % M;
    }

    //if loadfactor is greater than 0.75, then we should create another array 2X the old array
    public double getLoadFactor() {return usedCellNumber * 1.0/hashTable.length;}

    //reHash method - new array is 2X the old array and move all elements to it
    public void rehashKeys(String word) {
        usedCellNumber = 0;
        ArrayList<String> data = new ArrayList<String>();
        for (String s: hashTable) {//loop to move all elements to new data structure
            if (s != null) data.add(s);
        }
        //after moving all elements, add the new word
        data.add(word);
        hashTable = new String[hashTable.length*2];

        for (String s: data) {
            //Insert in Hash Table
            insertInHashTable(s);
        }
    }

    //insert in HastTable
    public void insertInHashTable(String word) {
        double loadFactor = getLoadFactor();
        if (loadFactor >= 0.75) rehashKeys(word);
        else {
            int index = modASCIIHashFunction(word, hashTable.length);
            for (int i = index; i < index+ hashTable.length; i++ ) {
                int newIndex = i % hashTable.length;
                if (hashTable[newIndex] == null) {
                    hashTable[newIndex] = word;
                    System.out.println("\""+word+"\" successfully inserted at " + newIndex );
                    break;
                }
                else {
                    System.out.println(newIndex+ " is already occupied. Trying next empty cell.");
                }
            }
        }
        usedCellNumber++;
    }

    //display
    public void displayHashTable() {
        if (hashTable == null) {
            System.out.println("\nHash Table doesn't exist");
            return;
        }
        else {
            System.out.println("------------HastTable----------");
            for (int i = 0; i < hashTable.length; i++) {
                System.out.println("Index " + i + ", key: " +hashTable[i]);
            }
        }
    }

}
