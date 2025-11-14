package datastuctures.Queue;

import java.util.Arrays;

public class QueueExample {
    public static void main(String[] args) {
        MyCustomQueue myCustomQueue = new MyCustomQueue(5);
        myCustomQueue.enqueue(10);
        myCustomQueue.enqueue(20);
        myCustomQueue.enqueue(30);
        myCustomQueue.dequeue();
        System.out.println("size "+ myCustomQueue.size());
        myCustomQueue.printQueue();
    }
}


// fist in first out 10->20->30
class MyCustomQueue{
    private int front = 0;
    private int rear = -1;
    private int size = 0;
    private int capacity;
    private int[] array;

    MyCustomQueue(int capacity){
        this.capacity = capacity;
        this.array= new int[capacity];
    }


    // add in queue
    public void enqueue(int data){
        if(isFull()){
            System.out.println("Queue is Full");
            return;
        }
        rear =(rear +1) % capacity;
        array[rear] = data;
        size++;
    }


    // remove from queue
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        int value = array[front];
        front = (front +1) % capacity;
        size --;
        return value;
    }

    public int peek(){
        if(isEmpty()){
         System.out.println("Queue is empty!");
         return -1;
        }
        return array[front];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
       return size == capacity;
    }

    public int size(){
        return size;
    }

    public void printQueue(){
        for(int a:array) {
            if (a!= 0) {
                System.out.print(a+"-->");
            }
        }
    }

    @Override
    public String toString() {
        return "MyCustomQueue{" +
                "front=" + front +
                ", rear=" + rear +
                ", size=" + size +
                ", capacity=" + capacity +
                ", array=" + Arrays.toString(array) +
                '}';
    }

    public int getFront() {
        return front;
    }

    public void setFront(int front) {
        this.front = front;
    }

    public int getRear() {
        return rear;
    }

    public void setRear(int rear) {
        this.rear = rear;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}