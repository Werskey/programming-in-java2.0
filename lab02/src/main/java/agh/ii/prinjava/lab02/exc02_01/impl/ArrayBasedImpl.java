package agh.ii.prinjava.lab02.exc02_01.impl;

import agh.ii.prinjava.lab02.exc02_01.StackOfInts;

/**
 * Stack implementation based on an array of integers.
 */
public class ArrayBasedImpl implements StackOfInts {

package agh.ii.prinjava.lab02.exc02_01.impl;

import agh.ii.prinjava.lab02.exc02_01.StackOfInts;

    /**
     * Stack implementation based on an array of integers.
     */
    public class ArrayBasedImpl implements StackOfInts {

        private static final int INITIAL_CAPACITY = 4;

        private int[] elems = new int[INITIAL_CAPACITY];
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

            numOfElems--;
            int elem = elems[numOfElems];

            if (numOfElems > 0
                    && numOfElems <= elems.length / 4
                    && elems.length > INITIAL_CAPACITY) {
                shrink();
            }

            return elem;
        }

        /**
         * Adds an element to the top of the stack.
         *
         * @param x the element to add
         */
        @Override
        public void push(int x) {
            if (numOfElems == elems.length) {
                grow();
            }

            elems[numOfElems] = x;
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

            return elems[numOfElems - 1];
        }

        /**
         * Increases the capacity of the internal array.
         */
        private void grow() {
            int[] newElems = new int[elems.length * 2];

            for (int i = 0; i < elems.length; i++) {
                newElems[i] = elems[i];
            }

            elems = newElems;
        }

        /**
         * Decreases the capacity of the internal array.
         */
        private void shrink() {
            int newCapacity = elems.length / 2;

            if (newCapacity < INITIAL_CAPACITY) {
                newCapacity = INITIAL_CAPACITY;
            }

            int[] newElems = new int[newCapacity];

            for (int i = 0; i < numOfElems; i++) {
                newElems[i] = elems[i];
            }

            elems = newElems;
        }
    }
