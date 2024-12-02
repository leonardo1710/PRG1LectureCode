package at.ac.fhcampuswien.lecture10.bb02122024;

import java.util.Arrays;

public class ArrayStringList implements ListOfStrings{
    private String[] elements;
    private int size = 0;

    public ArrayStringList(int capacity) {
        if(capacity < 0) {
            throw new IllegalArgumentException("Capacity must be greater than 0.");
        }

        this.elements = new String[capacity];
    }

    @Override
    public boolean add(String el) {
        if (size >= elements.length) {
            System.out.println("List is full! Cannot add element.");
            return false;
        }

        elements[size++] = el;
        return true;
    }

    @Override
    public String get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return elements[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elements, size));
    }
}
