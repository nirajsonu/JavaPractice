package datastuctures.stack;

import java.util.ArrayList;

public class StackArrayListExample {
    public static void main(String[] args) {
        ArrayListStack arrayListStack = new ArrayListStack();
        arrayListStack.push(10);
        arrayListStack.push(20);
        arrayListStack.push(30);
        arrayListStack.pop();
        arrayListStack.peek();
        System.out.println(arrayListStack.getArrayList());

    }
}

class ArrayListStack {
    private ArrayList<Integer> arrayList = new ArrayList<>();

    public void push(int data) {
        arrayList.add(data);
    }

    public void pop() {
        if (!arrayList.isEmpty()) {
            arrayList.remove(arrayList.size() - 1);
        }
    }
        // Peek operation — view top element
        public int peek () {
            if (arrayList.isEmpty()) {
                System.out.println("Stack is empty!");
                return -1;
            }
            return arrayList.get(arrayList.size() - 1);
        }

        // Check if stack is empty
        public boolean isEmpty () {
            return arrayList.isEmpty();
        }

        // Get size
        public int size () {
            return arrayList.size();
        }

        @Override
        public String toString () {
            return arrayList.toString();
        }

    public ArrayList<Integer> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }
}
