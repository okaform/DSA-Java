package Trie;

public class Trie {
    private TrieNode root;

    Trie() {
        root = new TrieNode();
        System.out.println("Trie has been successfully created");
    }

    //insert method- time and space complexit 0(M)
    public void insert(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch); //get the character from the map key value pair
            if (node == null) {
                node = new TrieNode();
                current.children.put(ch, node);
            }
            current = node;
        }
        current.endOfString = true;
        System.out.println(word+" has been successfully inserted into the Trie.");

    }

    //search method - time and space complexity 0(M) and 0(1)
    public boolean search(String word) {
        TrieNode current = root;
        for (int i = 0; i< word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            if (node == null) {
                System.out.println(word+ " doesn't exist in Trie");
                return false;
            }
            current = node; //move to the next node
        }
        //last step - if currentNOde end of string equals true then it exist, if it doesn't then it is a prefix
        if (current.endOfString == true) {
            System.out.println(word+" exists in string");
            return true;
        }
        System.out.println(word+" is a prefix of another string and does not exists in string");
        return current.endOfString;
    }

    //delete string -
    private boolean delete(TrieNode parentNode, String word, int index) {
        char ch = word.charAt(index);
        TrieNode currentNode = parentNode.children.get(ch); //get the node of the char
        boolean canBeDeleted;
        //case 1 - same prefix. if size is greater than one then we have more than one child
        if (currentNode.children.size() > 1) {//if true, don't delete this node
            delete(currentNode, word, index+1);
            return false;
        }

        //case 2 -
        if (index == word.length() - 1) {
            if (currentNode.children.size() >=1) { //char is a prefix of another word
                currentNode.endOfString = false;
                return false;
            }
            else {
                parentNode.children.remove(ch);
                return true;
            }
        }
        //case 3 -
        if (currentNode.endOfString == true) {//some other word is a prefix of it
            delete(currentNode, word, index+1);
            return false;
        }
        //case 4 - no other node is dependent on it
        canBeDeleted = delete(currentNode, word, index+1);
        if (canBeDeleted ) {
            parentNode.children.remove(ch);
            return true;
        }
        else return false;


    }

    public void deleteString(String word) {
        if (search(word)) delete(root, word, 0);

    }


}
