package list.linkedlist;

import list.node.Node;
import java.util.Iterator;
import list.iterator.MyIterator;

public class LinkedList<T> implements Iterable<T> {

    @Override
    public Iterator<T> iterator() {

        return new MyIterator<>(this);
    }

    private final static int FIRST_ELEMENT_INDEX = 0;

    private Node<T> head;
    private Node<T> tail;
    private int size = 0;


    public LinkedList(T[] data) {
        if (data.length != 0) {
            head = new Node<T>(data[0]);
            tail = head;
            if (data.length > 0) {
                for (int i = 1; i < data.length; i++) {
                    addLast(data[i]);
                }
            }
        }
    }

    public void addFirst(T value) {
        if (isEmpty()) {
            Node<T> node = new Node<T>(value);
            head = node;
            tail = node;

        } else {
            Node<T> node = new Node<T>(value);
            node.setNext(head);
            head = node;
        }
        size++;
    }

    public void addLast(T value) {
        if (isEmpty()) {
            Node<T> node = new Node<T>(value);
            head = node;
            tail = node;

        } else {
            Node<T> node = new Node<T>(value);
            tail.setNext(node);
            tail = node;
        }
        size++;
    }


    public boolean isEmpty() {
        return head == null;
    }

    public void add(T value, int position) {
        if (isEmpty()) {
            return;
        } else if (position == FIRST_ELEMENT_INDEX) {
            addFirst(value);
        } else if (position == size - 1) {
            addLast(value);
        } else {
            Node<T> addedNode = new Node<>(value);
            Node<T> last = findNodeByPosition(size - 1);
            addedNode.setNext(last.getNext());
            last.setNext(addedNode);
            size++;
        }
    }

    public void deleteFirst() {
        if (isEmpty()) {
            return;
        } else if (size == 1) {
            head = null;
            tail = null;
            size--;
        } else {
            head = head.getNext();
            size--;
        }
    }

    public void deleteLast() {
        if (isEmpty()) {
            return;
        } else if (size == 1) {
            head = null;
            tail = null;
            size--;
        } else {
            Node<T> penultimate = head;
            while (penultimate.getNext().getNext() != null) {
                penultimate = penultimate.getNext();

            }
            penultimate.setNext(null);
            tail = penultimate;
            size--;
        }
    }

    public void delete(int position) {
        if (isEmpty()) {
            return;
        } else if (size == 1) {
            head = null;
            tail = null;
            size--;
        } else {
            if (position == FIRST_ELEMENT_INDEX) {
                deleteFirst();
            } else if (position == size - 1) {
                deleteLast();
            } else {
                Node<T> temp = head;
                int counter = 0;
                while (counter != position - 1) {
                    temp = temp.getNext();
                    counter++;
                }
                temp.setNext(temp.getNext().getNext());

                size--;
            }
        }
    }

    public int size() {
        return size;
    }

    public void change(int firstPosition, int secondPosition) {
        if (size < 2) {
            throw new IllegalArgumentException("first position is: " + firstPosition + ",second position is: " +
                    secondPosition + ",but list size is " + size);
        }
        Node<T> nodeBeforeFirst = findNodeByPosition(firstPosition - 1);
        Node<T> firstNode = findNodeByPosition(firstPosition);
        Node<T> nodeBeforeSecond = findNodeByPosition(secondPosition - 1);
        Node<T> secondNode = findNodeByPosition(secondPosition);

        Node<T> oldFirstNode = firstNode.getNext();
        firstNode.setNext(secondNode.getNext());
        secondNode.setNext(oldFirstNode);

        Node<T> oldNodeBeforeFirst = nodeBeforeFirst.getNext();
        nodeBeforeFirst.setNext(nodeBeforeSecond.getNext());
        nodeBeforeSecond.setNext(oldNodeBeforeFirst);

        if (firstPosition == FIRST_ELEMENT_INDEX) {
            head = secondNode;
        }

        if (secondPosition == size - 1) {
            tail = firstNode;
        }

    }

    private Node<T> findNodeByPosition(int position) {
        Node<T> result = head;
        int counter = 0;
        while (counter != position) {
            result = result.getNext();
            counter++;
        }
        return result;
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("size: ").append(size).append("\n");
        Node<T> temp = head;
        if (!isEmpty()) {
            while (temp.hasNext()) {
                sb.append(temp.getValue().toString()).append("\n");
                temp = temp.getNext();
            }
            sb.append(temp.getValue().toString()).append("\n");
        }
        sb.append("---------------------------------");
        return sb.toString();
    }
}