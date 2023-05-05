package com.linkedList;

import com.exception.NotFoundException;
import com.interfaces.IList;
import com.utils.Printer;

// CustomLinked List implements IList Interface
public class CustomLinkedList<T> implements IList<T> {
    // first element
    private Node head;
    // last element
    private Node tail;
    // Maintain list size
    private int counter;

    // add first node
    @Override
    public boolean add(T data) {

        Node node = new Node(data);

        // List is empty, add first and mark head and tail
        if (this.head == null) {
            head = node;
            tail = head;
            counter++;
            Printer.debug("node added as head");
            return true;
        } else {
            // Add node to end of list
            tail.setNext(node);
            tail = node;
            counter++;
            Printer.debug("node added to list at the end");
            return true;
        }
    }

    // obtain the node at specified index
    @Override
    public T get(int index) throws NotFoundException, IndexOutOfBoundsException {

        T data = null;
        Node temp = head;
        int counter = 0;

        if (head == null) {
            throw new NotFoundException("List is empty");
        }
        if (index >= this.counter) {
            throw new IndexOutOfBoundsException("Index greater than list size");
        }
        // Check first or last node for index
        if (index == counter) {
            data = head.getData();
        } else if (index == (counter - 1)) {
            data = tail.getData();
        } else {
            // loop through the list
            while (temp != null) {
                if (counter == index) {
                    data = temp.getData();
                    break;
                }
                temp = temp.getNext();
                counter++;
            }
        }
        return data;
    }

    // remove node from list
    @Override
    public boolean remove(T data) throws NotFoundException {

        if (head == null) {
            throw new NotFoundException("List is empty");
        }

        if (head.getData().equals(data)) {
            Node temp = head;
            head = temp.getNext();
            temp = null;
            this.counter--;
            Printer.debug("node deleted from head");
            return true;
        } else {
            Node temp = head.getNext();
            Node prev = head;
            int index = 0;
            // Iterating over the list to identify data
            while (temp != null) {
                if (temp.getData().equals(data)) {
                    prev.setNext(temp.getNext());
                    temp = null;
                    this.counter--;
                    break;
                }
                index++;
                prev = temp;
                temp = temp.getNext();
                Printer.debug("node deleted at " + index);
                return true;
            }
        }
        return false;
    }

    @Override
    public void printNodes() {
        Node temp = head;
        Printer.print("{ ");
        while (temp != null) {
            Printer.print(temp.getData() + " ");
            temp = temp.getNext();
        }
        Printer.print(" }");
    }

    @Override
    public int size() {
        // return the counter value
        return this.counter;
    }

    // LinkedList Node
    private class Node {

        private final T data;
        private Node next;

        public Node(T data) {
            super();
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public T getData() {
            return data;
        }
    }
}
