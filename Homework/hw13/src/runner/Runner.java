package runner;

import java.util.LinkedList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Integer> list = new List<>();

        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        System.out.println(list);

        list.addLast(6);
        System.out.println(list);

        list.add(5);
        System.out.println(list);

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        list.deleteByIndex();
        System.out.println(list);

        list.swap(1,2);
        System.out.println(list);
    }
}