package com.dsexercises.linkedlist;

public class LinkedList {

    private Node first;
    private Node last;

    // addFirst
    public void addFirst(int item) {

        Node firstnode = new Node();
        firstnode.setValue(item);

        if (first == null) {

            firstnode.setNext(null);
            first = firstnode;
            last = first;
        } else {
            firstnode.setNext(first);
            first = firstnode;
        }

    }

    // addLast
    public void addLast(int item) {

        Node lastnode = new Node();
        lastnode.setValue(item);
        lastnode.setNext(null);
        if (last == null) {
            first = lastnode;
            last = lastnode;
        } else {
            last.setNext(lastnode);
            last = lastnode;
        }
    }

    // deleteFirst
    public void deleteFirst() {
        Node firstnode = first;
        first = firstnode.getNext();
        firstnode.setNext(null);

    }

    // deleteLast
    public void deleteLast() {
        Node temp = first;
        Node prevlast = new Node();
        while (temp.getNext() != null) {
            prevlast = temp;
            temp = temp.getNext();
        }
        last = prevlast;
        prevlast.setNext(null);
    }

    // print
    public void print() {
        Node temp = first;
        while (temp.getNext() != null) {
            System.out.println(temp.getValue());
            temp = temp.getNext();
        }
        System.out.println(temp.getValue());
    }

    public boolean contains(int item) {
        Node temp = first;
        boolean present = false;
        while (temp.getNext() != null) {

            if (temp.getValue() == item) {
                present = true;
            }
            temp = temp.getNext();
        }
        if (last.getValue() == item) {
            present = true;
        }
        return present;

    }

    public int indexOf(int item) {
        int count = -1;
        Node temp = first;

        while (temp.getNext() != null) {

            if (temp.getValue() == item) {
                count++;
                return count;
            }
            temp = temp.getNext();
            count++;
        }
        if (temp.getNext() == null && temp.getValue() == item) {
            count++;
            return count;
        }

        return -1;
    }
}