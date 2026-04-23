package Assignment;

import java.util.Iterator;

// is a concrete iterator that implements the Iterator interface and provides the logic to iterate through the Fibonacci sequence
public class FibonacciIterator implements Iterator<Integer> {

    private FibonacciSequence current;

    private int a = 0, b = 1;

    public FibonacciIterator(FibonacciSequence sequence) {
        this.current = sequence;
    }
    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public Integer next() {
        int next = a + b;
        a = b;
        b = next;
        return a;
    }
}
