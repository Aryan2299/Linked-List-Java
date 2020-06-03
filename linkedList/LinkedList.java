package linkedList;

import java.lang.invoke.VarHandle;
import java.util.HashMap;

public class LinkedList{

    public Node getHead() {
        System.out.println("Head's Value: " + head.getValue());
        System.out.println("Next: " + head.getNext());
        return head;
    }

    public Node getTail() {
        System.out.println("Tail's Value: " + tail.getValue());
        System.out.println("Value: " + tail.getNext());
        return tail;
    }

    Node head;
    Node tail;
    Node node = new Node();

    public void addHead(Object value) {
        Node temp = new Node();
        temp.setValue(value);
        temp.setNext(head);
        head = temp;
    }

    public void addTail(Object value) {
        if (getSize() == 0) {
            node.setValue(value);
            node.setNext(null);
            head = node;
        } else {
            Node node1 = new Node();
            node.setNext(node1);
            node1.setValue(value);
            node1.setNext(null);
            node = node1;
            tail = node1;
        }
    }

    public void remove(Object value) {
        if (getSize() == 0) {
            System.out.println("\nThe list is empty");
        }
        Node newNode = new Node();
        newNode = head;
        while (newNode != null ) {
            if (newNode.getNext() == null) {
                System.out.println("\nElement not found in list");
                break;
            }
            if (newNode.getNext().getNext() == null && newNode.getNext().getValue() == value) {
                newNode.setNext(null);
                System.out.println("\nElement at tail removed.");
                break;
            }
            if (newNode == head && newNode.value == value) {
                Node temp = new Node();
                temp = head;
                head = head.getNext();
                temp.setNext(null);
                System.out.println("\nElement at head removed.");
                break;
            }
            if (newNode.getNext().getValue() == value) {
                Node temp = newNode.getNext();
                temp.getNext().setNext(null);
                newNode.setNext(newNode.getNext().getNext());
                System.out.println("\nElement removed.");
                break;
            }

            newNode = newNode.getNext();
        }
    }

    public void removeHead() {
        if (getSize() == 0) {
            System.out.println("\nThe list is empty");
        }
        Node temp = new Node();
        temp = head;
        head = head.getNext();
        temp.setNext(null);
    }

    public void removeTail() {
        if (getSize() == 0) {
            System.out.println("\nThe list is empty");
        }
        Node node = head;
        while (node != null) {
            if (node.getNext() == null) {
                break;
            }
            if (node.getNext().getNext() == null) {
                Node temp = new Node();
                temp = tail;
                node.setNext(null);
                tail = node;
            }
            node = node.getNext();
        }
    }

    public void findIndex(Object value) {
        int i = 0;
        Node node = head;
        while (node != null) {
            if (node.getNext() == null && node.getValue() != value) {
                System.out.println("\nNot found");
            }
            if (node.getValue() == value) {
                System.out.println("\nFound " + value + " at index " + i);
                break;
            }
            i++;
            node = node.getNext();
        }
    }

    public void findByIndex(int i) {
        int j = 0;
        Node node = head;
        while (node != null) {
            if (node.getNext() == null && i != j) {
                System.out.println("\nNot found");
            }
            if (i == j) {
                System.out.println("\nValue: " + node.getValue() + " found at index " + j);
                break;
            } else {j++;}
            node = node.getNext();
        }
    }

    public void findRepetition(Object value) {
        int j = 0;
        Node node = head;
        while (node != null) {
            if (node.getValue() == value) {
                j++;
            }
            node = node.getNext();
        }
        System.out.println("\nFound " + j + " repetition(s) of value " + value);
    }

    public void getList() {
        Node node = head;
        while (node != null){
        System.out.println("Value: " + node.getValue());
        System.out.println("Next: " + node.getNext());
        node = node.getNext();
        }
    }

    public int getSize() {
        int size = 0;
        Node node = head;
        while(node != null) {
            node = node.getNext();
            size++;
        }
        return size;
    }
}
