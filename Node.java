public class Node {
    public int value;
    public Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }

    // getter
    public int getValue() {
        return value;
    }

    // setter
    public void setValue(int valueInput) {
        value = valueInput;
    }

    // getter
    public Node getNext() {
        return next;
    }

    // setter
    public void setNext(Node nextInput) {
        next = nextInput;
    }
}