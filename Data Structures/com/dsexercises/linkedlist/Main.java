package com.dsexercises.linkedlist;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        LinkedList linkedlist = new LinkedList();
        linkedlist.addLast(30);
        linkedlist.addLast(10);
        linkedlist.addLast(40);
        linkedlist.addLast(20);
        // linkedlist.deleteFirst();
        linkedlist.getSize();
        // linkedlist.print();
        // System.out.println(Arrays.toString(linkedlist.toArray()));
        // System.out.println(linkedlist.contains(40));
        // linkedlist.reverse();
        System.out.println(Arrays.toString(linkedlist.toArray()));

        System.out.println(linkedlist.getKthFromTheEnd(5));
    }
}