package HashTable;
import java.util.ArrayList;
import java.util.LinkedList;

public class DirectChaining {
    LinkedList<String>[] hashTable;
    int maxChainSize = 5;

    DirectChaining(int size) {
        this.hashTable = new LinkedList[size];
    }

    public int modASCIIHashFunction(String word, int M) {
        char ch[] = word.toCharArray(); //convert the string to a char Array
        int i, sum;
        for (sum = 0, i = 0; i< word.length(); i++) {
            sum = sum  + ch[i]; //we are adding the ASCII character values...
        }
        return sum % M;
    }

    public void insertHashTable(String word) {
        int newIndex = modASCIIHashFunction(word, hashTable.length); //where the values should be stored in array
        if (hashTable[newIndex] == null) {
            hashTable[newIndex] = new LinkedList<String>();
            hashTable[newIndex].add(word);
        }
        else { //if we already have a word
            hashTable[newIndex].add(word); //add to the linkedList stored in the array
        }
    }

    //display hashTable
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

    //search method
    public boolean searchHashTable(String word) {
        int newIndex = modASCIIHashFunction(word, hashTable.length); //checking if the hash of the word already exists
        if (hashTable[newIndex] !=null && hashTable[newIndex].contains(word)) {
            System.out.println("\""+word +"\" found at location "+ newIndex);
            return true;
        }
        else {
            System.out.println("\""+word +"\" not found");
            return false;
        }
    }

    //delete method
    public void deleteHastTable(String word) {
        int newIndex = modASCIIHashFunction(word, hashTable.length);
        boolean result = searchHashTable(word);
        if (result) {//if it exists
            hashTable[newIndex].remove(word);
            System.out.println("\""+word +"\" deleted from HashTable");
        }
    }
}
