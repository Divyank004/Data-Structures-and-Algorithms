package com.dsexercises.linkedlist;

import java.util.NoSuchElementException;

import javax.lang.model.util.ElementScanner6;

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
    private int size;

    public void addFirst(int item) {

        Node firstnode = new Node(item);
        size++;
        if (isEmpty()) {
            first = last = firstnode;
        } else {
            firstnode.next = first;
            first = firstnode;
        }

    }

    public void addLast(int item) {
        Node lastnode = new Node(item);
        size++;
        if (isEmpty()) {
            first = last = lastnode;
        } else {
            last.next = lastnode;
            last = lastnode;
        }
    }

    public void deleteFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (first == last) {
            first = last = null;
        } else {
            Node secondnode = first.next;
            first.next = null;
            first = secondnode;
        }
        size--;
    }

    public void deleteLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (first == last) {
            first = last = null;
        } else {
            Node previous = getPrevious(last);
            last = previous;
            last.next = null;
        }
        size--;
    }

    private Node getPrevious(Node node) {
        Node current = first;
        while (current != null) {
            if (current.next == node)
                return current;
            current = current.next;
        }
        return null;
    }

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

    public int getSize() {
        return size;
    }

    public int[] toArray() {
        Node current = first;
        int[] array = new int[size];
        int index = 0;
        while (current != null) {
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }

    public void reverse() {

        if (isEmpty())
            return;
        Node prev, next, current;
        current = first;
        next = current.next;
        while (next != null) {
            prev = current;
            current = next;
            next = current.next;
            current.next = prev;
        }

        last = first;
        last.next = null;
        first = current;
    }

    public int getKthFromTheEnd(int k) {
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        Node knode = first;
        Node current = first;

        for (int i = 1; i <= k - 1; i++) {
            if (current.next == null) {
                throw new IllegalArgumentException();
            }
            current = current.next;
        }
        while (current.next != null) {
            current = current.next;
            knode = knode.next;
        }
        return knode.value;

    }

    public void printMiddle() {
        // [10 --> 20 --> 30--> 40 -->50]
        // first last
    }
}