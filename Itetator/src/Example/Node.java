package Example;

// used inside the Ring class
// holds individual elements of the list
// each Node holds an integer datum and reference to the next node (forming a link in the list)

public class Node {

    private int data;
    private Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }

    public int getData(){
        return data;
    }

    public void setData(int data){
        this.data = data;
    }

    public Node getNext(){
        return next;
    }

    public void setNext(Node next){
        this.next = next;
    }
}
