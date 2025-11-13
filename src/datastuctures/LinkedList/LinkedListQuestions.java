package datastuctures.LinkedList;

public class LinkedListQuestions {
    private static void lengthOfLinkedList() {
        ListNode head = new ListNode(10);
        head.setNext(new ListNode(20));
        head.getNext().setNext(new ListNode(30));
        int length = 0;
        ListNode current = head;
        while (current != null) {   // ✅ correct condition
            length++;
            System.out.print(current.getData() + "-->");
            current = current.getNext();// ✅ move current, not head
        }
        System.out.println("null");
        System.out.println("Length of Linked List: " + length);
    }

    public static void main(String[] args) {
        lengthOfLinkedList();
    }
}

class ListNode {
    private int data;
    private ListNode next;

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}