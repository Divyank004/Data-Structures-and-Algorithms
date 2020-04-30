package com.dsexercises.arrays;

public class Array {

    private int count;
    private int[] array;

    Array(int size) {
        count = 0;
        array = new int[size];
    }

    public void insert(int element) {

        if (array.length == count) {
            int[] dupArray = new int[count * 2];
            for (int i = 0; i < array.length; i++) {
                dupArray[i] = array[i];
            }
            array = dupArray;
        }
        array[count++] = element;
    }

    public void removeAt(int index) {

        if (index >= count || index < 0) {
            throw new IllegalArgumentException();
        } else {
            count--;
            int[] dupArray = new int[count];
            int j = 0;
            for (int i = 0; i < count + 1; i++) {

                if (i == index)
                    continue;
                dupArray[j] = array[i];
                j++;
            }
            array = new int[count];
            array = dupArray;
        }
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(array[i]);
        }
    }

    public int indexOf(int element) {
        for (int i = 0; i < count; i++) {
            if (element == array[i])
                return i;
        }
        return -1;
    }

    public int max() {
        int max = 0;
        for (int i = 0; i < count; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public int elementAt(int index) {
        return array[index];
    }

    public int findLength() {

        return count;
    }

    public Array intersect(Array secArray) {
        Array intersectElement = new Array(3);
        for (int i = 0; i < secArray.findLength(); i++) {
            for (int j = 0; j < array.length; j++) {
                if (secArray.elementAt(i) == array[j]) {
                    intersectElement.insert(array[j]);
                }
            }
        }
        return intersectElement;
    }

    public void reverse() {
        Array reverseArray = new Array(3);
        for (int i = count - 1; i >= 0; i--) {
            reverseArray.insert(array[i]);
        }
        reverseArray.print();
    }

    public void insertAt(int item, int index) {
        int[] dupArray;
        if (array.length == count) {
            dupArray = new int[2 * count];
        } else {
            dupArray = new int[array.length];
        }
        dupArray[index] = item;
        // System.out.println("Length of dup array " + dupArray.length);
        int j = 0;
        for (int i = 0; i <= count; i++) {
            if (i == index) {
                continue;
            }
            dupArray[i] = array[j];
            j++;
        }
        count++;
        array = dupArray;
    }
}