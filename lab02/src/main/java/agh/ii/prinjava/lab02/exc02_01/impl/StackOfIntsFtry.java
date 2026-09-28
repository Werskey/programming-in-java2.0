package agh.ii.prinjava.lab02.exc02_01;

/**
 * Represents a stack of integers.
 */
public interface StackOfInts {

    /**
     * Removes and returns the top element of the stack.
     *
     * @return the removed element
     */
    int pop();

    /**
     * Adds an element to the top of the stack.
     *
     * @param x the element to add
     */
    void push(int x);

    /**
     * Returns the number of elements in the stack.
     *
     * @return the number of elements
     */
    int numOfElems();

    /**
     * Returns the top element without removing it.
     *
     * @return the top element
     */
    int peek();
}
