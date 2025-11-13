package datastuctures.stack;

public class StackExample {
    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(5); // specify capacity
        arrayStack.push(10);
        arrayStack.push(20);
        arrayStack.push(30);

        System.out.println(arrayStack); // prints stack elements

        arrayStack.pop();
        System.out.println("After pop: " + arrayStack);

        System.out.println("Is stack empty? " + arrayStack.isEmpty());

        System.out.println("Length of stack " + (arrayStack.getTop() + 1));

       // System.arraycopy(arrayStack.getArray(),0,);
    }
}

class ArrayStack {
    private int capacity;
    private int top;
    private int[] array;

    // Constructor with capacity
    ArrayStack(int capacity) {
        this.capacity = capacity;
        array = new int[capacity];
        top = -1;
    }

    public boolean isEmpty() {
        return (top == -1); // ✅ correct
    }

    public boolean isStackFull() {
        return (top == array.length - 1); // ✅ correct
    }

    public void push(int data) {
        if (isStackFull()) {
            System.out.println("Stack is full. Cannot push " + data);
        } else {
            array[++top] = data;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Nothing to pop.");
            return -1; // ✅ safer return
        } else {
            return array[top--];
        }
    }

    public void deleteStack() {
        for(int i=0;i<top;i++){
            array[i] =0;
        }
        top = -1;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "Stack is empty";
        }

        StringBuilder sb = new StringBuilder("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            sb.append(array[i]).append(" ");
        }
        return sb.toString();
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}

