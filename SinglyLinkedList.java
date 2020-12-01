public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        this.head = null;
    }
    // SLL methods go here. As a starter, we will show you how to add a node to the list.
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
        // Node newNode = new Node(value);
        // if (head == null) {
        //     return null;
        // } 
        // if (head.next = null) {
        //     return null;
        // }
        Node runner = head;
        while (runner.next.next != null) {
            runner = runner.next;
        }
        runner.next = null;
        // System.out.println(SinglyLinkedList())

        // return runner;
    }

    // print nodes
    public void printValues() {
        // for (int i = 0; i < Node.size(); i++) {
        //     System.out.println(Node.getValue(i));
        // }
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
        while (runner != null) {
            if (runner.value == num) {
                System.out.print('\n' + "----------------------------");
                System.out.print('\n' + " This is the node you were looking for: | " + runner.value + " | ");
            }
            runner = runner.next;
        }
        System.out.print('\n' + " There is no such node with a value of: " + num);
    }

    // remove the node after n nodes
    // not currently working for 0 case
    public void removeAt(int num) {
        Node runner = head;
        int nodeCounter = 0;

        if (num == nodeCounter) {
            System.out.println(runner.value);
            runner = runner.next;
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

        // // while (runner.next != null) {
        //     if (num == nodeCounter) {
        //         runner = null;
        //         // nodeCounter++;
        //     } else {
        //         nodeCounter++;
        //     }
        // }
    }
}