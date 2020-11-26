package list.runner;

import java.util.LinkedList;
import list.iterator.MyIterator;
import list.node.Node;

public class Runner {
    public static void main(String[] args) {

        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 9, 10};

        LinkedList<Integer> list = new LinkedList<>(array);

        for (Integer in : list) {
            System.out.println(in);
        }
    }
}
