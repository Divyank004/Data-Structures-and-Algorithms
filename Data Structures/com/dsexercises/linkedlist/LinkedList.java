package com.dsexercises.linkedlist;

import java.util.NoSuchElementException;

public class LinkedList {

    private class Node {

        private int value;
        private Node next;

        Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;

    // addFirst
    public void addFirst(int item) {

        Node firstnode = new Node(item);

        if (isEmpty()) {
            first = last = firstnode;
        } else {
            firstnode.next = first;
            first = firstnode;
        }

    }

    // addLast
    public void addLast(int item) {
        Node lastnode = new Node(item);
        if (isEmpty()) {
            first = last = lastnode;
        } else {
            last.next = lastnode;
            last = lastnode;
        }
    }

    // deleteFirst
    public void deleteFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (first == last) {
            first = last = null;
            return;
        }

        Node secondnode = first.next;
        first.next = null;
        first = secondnode;

    }

    // deleteLast

    public void deleteLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (first == last) {
            first = last = null;
            return;
        }
        Node previous = getPrevious(last);

        last = previous;
        last.next = null;

    }

    // previousnode
    private Node getPrevious(Node node) {
        Node current = first;
        while (current != null) {
            if (current.next == node)
                return current;
            current = current.next;
        }
        return null;
    }

    // print
    public void print() {
        Node current = first;
        while (current.next != null)

        {
            System.out.println(current.value);
            current = current.next;
        }
        System.out.println(current.value);
    }

    public boolean contains(int item) {
        return indexOf(item) != -1;

    }

    public int indexOf(int item) {
        int index = 0;
        Node current = first;

        while (current != null) {

            if (current.value == item)
                return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    private boolean isEmpty() {
        return first == null;
    }
}