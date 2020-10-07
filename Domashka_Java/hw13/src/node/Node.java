package node;

public class Node<T> {

    private T value;
    private Node<T> next;

    public Node(T value) {
        this(value, null);
    }
    public Node(T element, Node<T> next) {
        this.value = element;
        this.next = next;
    }

    public Node<T> getNext() {
        return next;
    }
    public void setNext(Node<T> next) {
        this.next = next;
    }
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
    public boolean hasNext() {
        return next != null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "element=" + value +
                ", next=" + next +
                '}';
    }
}