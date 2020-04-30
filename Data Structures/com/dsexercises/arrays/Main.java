package com.dsexercises.arrays;

public class Main {

    public static void main(String[] args) {
        Array ar = new Array(3);
        ar.insert(10);
        ar.insert(0);
        ar.insert(100);
        ar.insert(40);
        ar.insert(50);
        ar.insert(80);
        Array br = new Array(4);
        br.insert(20);
        br.insert(30);
        br.insert(40);
        br.insert(50);
        // ar.removeAt(2);
        // ar.removeAt(4);
        System.out.println("First array");
        ar.print();
        ar.insertAt(25, 2);
        ar.print();
        // System.out.println("Second array");
        // br.print();
        // System.out.println(ar.max());
        // Array cr = ar.intersect(br);
        // System.out.println("Intersecting elements");
        // cr.print();
        // System.out.println("Reversed array");
        // ar.reverse();
    }
}