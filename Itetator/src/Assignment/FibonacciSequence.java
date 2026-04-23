package Assignment;

import java.io.Serializable;
import java.util.Iterator;

// is responsible for generating the Fibonacci sequence and providing an iterator to traverse through it
// does not need to store the numbers
// should generate the numbers on demand
public class FibonacciSequence implements Iterable<Integer>, SequenceInterface{


    @Override
    public Iterator<Integer> iterator() {
        return new FibonacciIterator(this);
    }
}

