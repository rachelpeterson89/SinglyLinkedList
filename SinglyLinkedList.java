public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        this.head = null;
    }
    // SLL methods go here. 

    // add a node to the list
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }    

    // remove a node from the end of the list
    public void remove() {
        Node runner = head;
        if(isEmpty() == true) {
            return;
        } else if ( runner.next == null) {
            runner = null;
        } else {
            while (runner.next.next != null) {
                runner = runner.next;
            }
            runner.next = null;
        }
        
    }

    // see if node head of node is empty or null
    public boolean isEmpty() {
        if(head == null) {
            return true;
        } else {
            return false;
        }
    }

    // print nodes
    public void printValues() {
        Node runner = head;
        System.out.println('\n');
        while (runner != null) {
            System.out.print(" | " + runner.value + " | ");
            runner = runner.next;
        }
    }

    // find a specific node given an input
    public void find(int num) {
        Node runner = head;
        boolean nodeFound = false;

        while (runner != null) {
            if (runner.value == num) {
                nodeFound = true;
                System.out.print('\n' + "----------------------------");
                System.out.print('\n' + " This is the node you were looking for: | " + runner.value + " | ");
            }
            runner = runner.next;
        }
        if (nodeFound == false) {
            System.out.print('\n' + " There is no such node with a value of: " + num);
        }
    }

    // remove the node after n nodes
    public void removeAt(int num) {
        Node runner = head;
        int nodeCounter = 0;

        if(isEmpty() == true) {
            return;
        } else if (num == nodeCounter) {
            head = head.next;
        } else {
            Node previous = runner;
            while (runner.next != null) {
                if(num == nodeCounter) {
                    previous.next = runner.next;
                    break;
                }
                previous = runner;
                runner = runner.next;
                nodeCounter++;
            }
            if (nodeCounter == num) {
                previous.next = runner.next;
            }
        }
    }
}