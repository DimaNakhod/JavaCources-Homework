package runner;

import collection.List;

public class Runner {
    public static void main(String[] args) {
        List<Integer> list = new List<>();
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        System.out.println(list);

        System.out.println("add 6");

        list.add(6);
        System.out.println(list);

        System.out.println("addByIndex");

        list.addByIndex(5, 7);
        System.out.println(list);

        System.out.println("removeFirst");

        list.removeFirst();
        System.out.println(list);

        System.out.println("remove last");

        list.removeLast();
        System.out.println(list);

        System.out.println("removeByIndex 3");

        list.removeByIndex(3);
        System.out.println(list);

        System.out.println("swap");

        list.swap(1,3);
        System.out.println(list);
    }
}