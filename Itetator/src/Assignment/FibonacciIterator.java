package Assignment;

import java.util.Iterator;

// is a concrete iterator that implements the Iterator interface and provides the logic to iterate through the Fibonacci sequence
public class FibonacciIterator implements Iterator<Integer> {

    private FibonacciSequence sequence;

    private int prev = 0, current = 1;

    public FibonacciIterator(FibonacciSequence sequence) {
        this.sequence = sequence;
    }
    @Override
    public boolean hasNext() {
        return sequence != null;
    }

    @Override
    public Integer next() {
        int next = prev + current;
        prev = current;
        current = next;
        return prev;
    }
}
