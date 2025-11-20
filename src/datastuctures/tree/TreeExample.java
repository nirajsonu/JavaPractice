package datastuctures.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeExample {
    public static void main(String a[]){
        BinaryTreeNode root = new BinaryTreeNode();
        root.setData(1);

        // set left node
        BinaryTreeNode left = new BinaryTreeNode();
        left.setData(2);
        root.setLeft(left);   // ✅ attach left to root

        // set right node
        BinaryTreeNode right = new BinaryTreeNode();
        right.setData(3);
        root.setRight(right); // ✅ attach right to root

        System.out.println("Pre Order");
        root.printPreOrder(root);
        System.out.println("In Order");
        root.printInOrder(root);
        System.out.println("Post Order");
        root.printPostOrder(root);
    }
}

class BinaryTreeNode {
    private int data;
    private BinaryTreeNode left;
    private BinaryTreeNode right;

    public int getData() { return data; }
    public void setData(int data) { this.data = data; }
    public BinaryTreeNode getLeft() { return left; }
    public void setLeft(BinaryTreeNode left) { this.left = left; }
    public BinaryTreeNode getRight() { return right; }
    public void setRight(BinaryTreeNode right) { this.right = right; }

    // Preorder: Root -> Left -> Right
    public void printPreOrder(BinaryTreeNode node) {
        if(node != null){
            System.out.println(node.getData());
            printPreOrder(node.getLeft());
            printPreOrder(node.getRight());
        }
    }

    // Inorder: Left -> Root -> Right
    public void printInOrder(BinaryTreeNode node) {
        if(node != null){
            printInOrder(node.getLeft());
            System.out.println(node.getData());
            printInOrder(node.getRight());
        }
    }

    // Postorder: Left -> Right -> Root
    public void printPostOrder(BinaryTreeNode node) {
        if(node != null){
            printPostOrder(node.getLeft());
            printPostOrder(node.getRight());
            System.out.println(node.getData());
        }
    }

    // fifo
    public void bfs(BinaryTreeNode root) {
        if (root == null) return;
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            BinaryTreeNode current = queue.poll();
            System.out.print(current.getData() + " ");

            if (current.getLeft() != null) queue.add(current.getLeft());
            if (current.getRight() != null) queue.add(current.getRight());
        }
    }

    // stack last in last out
    public void dfs(BinaryTreeNode root) {
        if (root == null) return;
        Stack<BinaryTreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            BinaryTreeNode current = stack.pop();
            System.out.print(current.getData() + " ");
            // Push right first so left is processed first
            if (current.getRight() != null) stack.push(current.getRight());
            if (current.getLeft() != null) stack.push(current.getLeft());
        }
    }
}
