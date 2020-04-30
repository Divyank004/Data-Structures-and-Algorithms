package com.dsexercises.linkedlist;

public class Node {

    private int value;
    private Node next;

    public void setValue(int item) {
        this.value = item;
    }

    public int getValue() {
        return this.value;
    }

    public void setNext(Node temp) {
        this.next = temp;
    }

    public Node getNext() {
        return this.next;
    }
}