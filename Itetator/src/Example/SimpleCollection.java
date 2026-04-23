package Example;

// is the interface
// defines a simple collection of integers that supports adding elements and creating an iterator
// it declares 2 methods: add(int value) for inserting an element to the collection
// and iterator() for creating an iterator for traversing the collection

import java.util.Iterator;

public interface SimpleCollection {

    void add(Integer element);
    Iterator<Integer> iterator();
}
