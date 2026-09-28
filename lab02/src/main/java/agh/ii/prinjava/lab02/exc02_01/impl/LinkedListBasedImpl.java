package agh.ii.prinjava.lab02.exc02_01.impl;

import agh.ii.prinjava.lab02.exc02_01.StackOfInts;

/**
 * Stack implementation based on a singly linked list.
 */
public class LinkedListBasedImpl implements StackOfInts {

    private Node first = null;
    private int numOfElems = 0;

    /**
     * Removes and returns the top element of the stack.
     *
     * @return the removed element
     * @throws IllegalStateException if the stack is empty
     */
    @Override
    public int pop() {
        if (numOfElems == 0) {
            throw new IllegalStateException("Stack is empty");
        }

        int elem = first.elem;
        first = first.next;
        numOfElems--;

        return elem;
    }

    /**
     * Adds an element to the top of the stack.
     *
     * @param x the element to add
     */
    @Override
    public void push(int x) {
        first = new Node(x, first);
        numOfElems++;
    }

    /**
     * Returns the number of elements in the stack.
     *
     * @return the number of elements
     */
    @Override
    public int numOfElems() {
        return numOfElems;
    }

    /**
     * Returns the top element without removing it.
     *
     * @return the top element
     * @throws IllegalStateException if the stack is empty
     */
    @Override
    public int peek() {
        if (numOfElems == 0) {
            throw new IllegalStateException("Stack is empty");
        }

        return first.elem;
    }

    /**
     * Represents one node of the linked list.
     */
    private static class Node {
        int elem;
        Node next;

        public Node(int elem, Node next) {
            this.elem = elem;
            this.next = next;
        }
    }
}
