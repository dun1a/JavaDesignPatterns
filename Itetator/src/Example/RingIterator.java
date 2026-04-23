package Example;

// used for traversing the ring
// implements the Iterator<Integer> interface
// provides ways to access elements in the ring repeatedly in a circular manner (without modifying data structure)
// concrete iterator
import java.util.Iterator;

public class RingIterator implements Iterator<Integer> {

    private Node current;

    public RingIterator(Ring ring) {
        this.current = ring.getHead();
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public Integer next() {
        int data = current.getData();
        current = current.getNext();
        return data;
    }
}
