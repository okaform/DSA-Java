public class Logic {

    public static void main(String[] args) {
        firstMethod();

    }

    static void firstMethod() {
        secondMethod();
        System.out.println("I am the first Method");
    }

    static void secondMethod() {
        thirdMethod();
        System.out.println("I am the Second Method");
    }

    static void thirdMethod() {
        fourthMethod();
        System.out.println("I am the Third Method");
    }

    static void fourthMethod() {
        System.out.println("I am the Fourth Method");
    }


}
