package Example;

import java.util.Iterator;

// concrete data structure
// manages a circular list of integers
// supports operations such as adding elements to list,
// ensures last elements is linked back to first element
// creates a circular loop
public class Ring implements Iterable<Integer>, SimpleCollection {

    private Node head;
    private Node tail;

    // initializes an empty ring (no elements)
    public Ring() {
        this.head = null;
        this.tail = null;
    }

    @Override
    public void add(Integer data) {
        // when list is empty, head and tail will point to the new node
        Node newNode = new Node(data); // each node stores an Integer value
        if(head == null) {
            // first element
            head = newNode;
            tail = newNode;
            tail.setNext(head); // point tail to head to create circular structure
        }else{
            // old tail points to new node
            tail.setNext(newNode); // point current tail to new node

            tail = newNode; // update tail to new node
            tail.setNext(head); // point new tail to head to maintain circular structure
        }
    }

    public Node getHead() {
        return head;
    }

    @Override
    // allows a foreach loop to iterate over the elements in the ring
    public Iterator<Integer> iterator() {
        return new RingIterator(this);
    }
}
