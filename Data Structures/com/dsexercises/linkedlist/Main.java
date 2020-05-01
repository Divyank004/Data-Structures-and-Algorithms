package com.dsexercises.linkedlist;

public class Main {

    public static void main(String[] args) {
        LinkedList linkedlist = new LinkedList();
        linkedlist.addLast(30);
        linkedlist.addFirst(10);
        linkedlist.addLast(40);
        linkedlist.addFirst(20);
        linkedlist.deleteFirst();

        // linkedlist.print();
        // System.out.println(linkedlist.contains(40));
        System.out.println(linkedlist.contains(40));
    }
}