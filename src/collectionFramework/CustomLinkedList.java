package collectionFramework;


//Three classes needs to create
//Node that contains data -->any type and next-->Node type
// Another class which contain method insert, print
// first node will be head node and last node is tail node which contain null at next.
public class CustomLinkedList {
    public static void main(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.insert(10);
        myLinkedList.insert(20);
        myLinkedList.insert(30);
        myLinkedList.show();
    }
}

class MyLinkedList{

    Node head;

    public void insert(int data){
        Node node=new Node();
        node.data=data;
        node.next=null;

        if(head==null){
            head=node;   //head node
        }else{
            Node n=head;
            while (n.next!=null){
                n=n.next; // for jumping one node to another node until reach to last node
            }
            n.next=node;
        }
    }

    public void show(){
        Node node=head;
        while (node.next!=null){
            System.out.println(node.data);
            node=node.next;
        }
        System.out.println(node.data);
    }

}

class Node{
int data;
Node next;

}