package collection;

import exeption.CollectionIsEmptyException;
import node.Node;

public class List<T> {

    private Node<T> first;

    public List() {
    }

    public List(T[] array) {
        addArray(array);
    }

    private void addArray(T[] array) {
        for (T t : array) {
            add(t);
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

    public void add(T data) {
        if (size() == 0) {
            addFirst(data);
        } else {
            Node<T> newNode = new Node<>(data, null);
            Node<T> lastNode = getNode(size() - 1);
            lastNode.setNext(newNode);
        }
    }

    public void addByIndex(int index, T data) {
        if (index == size()) {
            throw new IndexOutOfBoundsException();
        } else if (index == 0) {
            addFirst(data);
        } else if (index == size() - 1) {
            add(data);
        }else {
            Node<T> temp = getNode(index);
            Node<T> prevNode = getNode(index - 1);
            Node<T> newNode = new Node<>(data, temp);
            prevNode.setNext(newNode);
        }
    }

    public void swap(int indexOne, int indexTwo) {
        Node<T> prevOne = getNode(indexOne - 1);
        Node<T> prevTwo = getNode(indexTwo - 1);
        Node<T> nextOne = getNode(indexOne + 1);
        Node<T> nextTwo = getNode(indexTwo + 1);
        Node<T> nodeOne = getNode(indexOne);
        Node<T> nodeTwo = getNode(indexTwo);

        if (isEmpty()) {
            throw new CollectionIsEmptyException();
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

    public void removeFirst() {
        if (isEmpty()) {
            throw new CollectionIsEmptyException();
        } else {
            first = getNode(1);
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            throw new CollectionIsEmptyException();
        } else if (size() == 1){
            first = null;
        } else {
            Node<T> penultimate = getNode(size() - 2);
            penultimate.setNext(null);
        }
    }

    public void removeByIndex(int index) {
        if (isEmpty()) {
            throw new CollectionIsEmptyException();
        } else if (index == size()) {
            throw new IndexOutOfBoundsException();
        } else if (index == 0) {
            removeFirst();
        } else {
            Node<T> prevNode = getNode(index - 1);
            Node<T> nextNode = getNode(index + 1);
            prevNode.setNext(nextNode);
        }
    }

    public int size() {
        if (isEmpty())
            return 0;
        else {
            int count = 0;
            Node<T> temp = first;
            while (temp != null) {
                temp = temp.getNext();
                count++;
            }
            return count;
        }
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
        String result = "";
        for(int i = 0; i < size(); i++) {
            result = result + getNode(i);
        }
        return result;
    }
}