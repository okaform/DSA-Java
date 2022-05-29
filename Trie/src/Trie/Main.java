package Trie;

public class Main {
    public static void main(String[] args) {
        Trie nt = new Trie();
        nt.insert("API");
        nt.insert("APIS");
        nt.insert("ADONIS");

        System.out.println("\n Search");
        nt.search("ADONIS");

        nt.search("AP");

        nt.deleteString("APIS");

        nt.search("APIS");
        nt.search("AP");
    }
}
