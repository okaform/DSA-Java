package Exercises;

public class Main {
    public static void main(String[] args) {
        ThreeInOne newStacks = new ThreeInOne(3);
        System.out.println("isFull Method");
        System.out.println(newStacks.isFull(0));
        System.out.println(newStacks.isFull(1));
        System.out.println(newStacks.isFull(2));

        //isEmpty
        System.out.println("is Empty Method");
        System.out.println(newStacks.isEmpty(0));
        System.out.println(newStacks.isEmpty(1));
        System.out.println(newStacks.isEmpty(2));

        //Push
        System.out.println("Push method");
        newStacks.push(0,1);
        newStacks.push(0,2);
        newStacks.push(1,4);
        newStacks.push(1,5);
        newStacks.push(2,8);

        //pop Method
        System.out.println("pop Method");
        System.out.println(newStacks.pop(0));
        System.out.println(newStacks.pop(1));
        System.out.println(newStacks.pop(2));
    }
}
