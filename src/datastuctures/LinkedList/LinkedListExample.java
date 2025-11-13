package datastuctures.LinkedList;

public class LinkedListExample {
    private Node head;
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null; // Initially, the node's next reference is null
        }
    }

    // Method to add a new node at the end of the linked list
    public void add(int data) {
        Node newNode = new Node(data);
        // If the list is empty, the new node becomes the head
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            // Traverse the list to find the last node
            while (current.next != null) {
                current = current.next;
            }
            // Link the last node to the new node
            current.next = newNode;
        }
    }

    // Method to display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null"); // To signify the end of the list
    }

    public int length(){
        Node current = head;
        int length =0;
        while (current!=null){
            length++;
            current = current.next;
        }
        return length;
    }

    public void updateList(int data,int position){

    }

    public void deleteList(int position){

    }



    public static void main(String[] args) {
        LinkedListExample list = new LinkedListExample();
        list.add(10);
        list.add(20);
        list.add(30);
        list.display();// Output: 10 -> 20 -> 30 -> null
        list.updateList(50,4);
        list.deleteList(0);
        System.out.println(list.length());
    }
}
