package HashTable;

public class Main {
    public static void main(String[] args) {
        DirectChaining dc = new DirectChaining(13);
        dc.insertHashTable("The");
        dc.insertHashTable("quick");
        dc.insertHashTable("brown");
        dc.insertHashTable("fox");
        dc.insertHashTable("over");
       // dc.displayHashTable();

        System.out.println("\n");

        //dc.searchHashTable("fox");
        //dc.searchHashTable("Fox");
        dc.deleteHastTable("The");

        dc.displayHashTable();
    }
}
