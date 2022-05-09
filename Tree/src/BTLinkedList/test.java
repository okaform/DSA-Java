package BTLinkedList;

public class test {
    public static void main(String[] args) {
        String  s = "{(([])[])[]}[]";
        System.out.println(s);

        int n = -1;
        while (s.length() != n) {
            n = s.length();
            s = s.replace("()", "");
            s = s.replace("[]", "");
            s = s.replace("{}", "");
            System.out.println(s);
        }

        System.out.println(s.length());


    }
}
