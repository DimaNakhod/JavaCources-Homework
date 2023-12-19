package collection;

import node.Node;

public class List<T> {

    private Node<T> first;
    private Node<T> last;
    private int size = 0;
    private final static int indexZero = 0;

    public List(T[] array) {
        if (array.length != 0) {
            first = new Node<T>(array[0]);
            last = first;
            if (array.length > 0) {
                for (int i = 1; i < array.length; i++) {
                    addLast(array[i]);
                }
            }
        }
    }

    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data, null);
        if (size() == 0) {
            first = newNode;
        } else {
            newNode.setNext(first);
            first = newNode;
        }
    }

    public void addLast(T value) {
        if (isEmpty()) {
            Node<T> node = new Node<T>(value);
            first = node;
            last = node;

        } else {
            Node<T> node = new Node<T>(value);
            last.setNext(node);
            first = node;
        }
        size++;
    }
    public void add(T data) {
        if (size() == 0) {
            addFirst(data);
        } else {
            Node<T> newNode = new Node<>(data, null);
            Node<T> lastNode = getNode(size() - 1);
            lastNode.setNext(newNode);
        }
    }

    public void swap ( int indexOne, int indexTwo) {
        Node<T> prevOne = getNode(indexOne - 1);
        Node<T> prevTwo = getNode(indexTwo - 1);
        Node<T> nextOne = getNode(indexOne + 1);
        Node<T> nextTwo = getNode(indexTwo + 1);
        Node<T> nodeOne = getNode(indexOne);
        Node<T> nodeTwo = getNode(indexTwo);

        if (isEmpty()) {
            return;
        } else if (indexOne > size() || indexTwo > size()) {
            throw new IndexOutOfBoundsException();
        }

        prevOne.setNext(nodeTwo);
        nodeTwo.setNext(nextOne);
        prevTwo.setNext(nodeOne);
        nodeOne.setNext(nextTwo);

        if (nodeOne == prevTwo) {
            nodeTwo.setNext(nodeOne);
            nodeOne.setNext(nextTwo);
        } else if (nodeTwo == prevOne) {
            nodeOne.setNext(nodeTwo);
            nodeTwo.setNext(nextOne);
        }
    }

    public void deleteFirst() {
        if (isEmpty()) {
            return;
        } else if (size == 1) {
            first = null;
            last = null;
            size--;
        } else {
            first = first.getNext();
            size--;
        }
    }

    public void deleteLast() {
        if (isEmpty()) {
            return;
        } else if (size() == 1){
            first = null;
        } else {
            Node<T> penultimate = getNode(size() - 2);
            penultimate.setNext(null);
        }
    }

    public void deleteByIndex(int index) {
        if (isEmpty()) {
            return;
        } else if (index == size()) {
            throw new IndexOutOfBoundsException();
        } else if (index == 0) {
            deleteFirst();
        } else {
            Node<T> prevNode = getNode(index - 1);
            Node<T> nextNode = getNode(index + 1);
            prevNode.setNext(nextNode);
        }
    }

    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return first == null;
    }
    private Node<T> getNode(int index) {
        Node<T> temp = first;
        int count = 0;
        while (count != index) {
            temp = temp.getNext();
            count++;
        }
        return temp;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "first=" + first +
                ", last=" + last +
                ", size=" + size +
                '}';
    }
}