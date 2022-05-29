package LinearProbing;

public class Main {
    public static void main(String[] args) {
        LinearProbing lp = new LinearProbing(13);

        lp.insertInHashTable("The");
        lp.insertInHashTable("quick");
        lp.insertInHashTable("brown");
        lp.insertInHashTable("fox");
        lp.insertInHashTable("over");

        lp.displayHashTable();
    }
}
