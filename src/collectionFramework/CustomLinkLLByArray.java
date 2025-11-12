package collectionFramework;

public class CustomLinkLLByArray {
    int size = 100;
    int[] values = new int[size];
    int[] nextAddress = new int[size];
    int head = -1;
    int freeIndex = 0;

    // Insert value at the end
    public void insertList(int value) {
        values[freeIndex] = value;
        nextAddress[freeIndex] = -1;

        if (head == -1) {
            head = freeIndex;
        } else {
            int current = head;
            while (nextAddress[current] != -1) {
                current = nextAddress[current];
            }
            nextAddress[current] = freeIndex;
        }

        freeIndex++;
    }

    // Print the list
    public void printList() {
        int current = head;
        while (current != -1) {
            System.out.print(values[current] + " -> ");
            current = nextAddress[current];
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        CustomLinkLLByArray customLinkLLByArray = new CustomLinkLLByArray();
        customLinkLLByArray.insertList(10);
        customLinkLLByArray.insertList(20);
        customLinkLLByArray.insertList(30);
        customLinkLLByArray.printList();
    }
}
