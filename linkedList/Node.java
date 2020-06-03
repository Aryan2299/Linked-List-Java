package linkedList;

public class Node {

    public Node() {
        this.value = null;
        this.next = null;
    }

    public Node(Object value) {
        this.value = value;
        this.next = null;
    }
    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Object value;
    public Node next;
}
