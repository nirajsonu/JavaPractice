package collectionFramework;

public class TreeExample {
    public static void main(String a[]){
        TreeNode treeNode=new TreeNode(1);
        treeNode.createNode();

    }


}


class TreeNode{
    private TreeNode node;
    private TreeNode left;
    private TreeNode right;
    private int data;

    public TreeNode(int data){
        this.data=data;
    }


    public void createNode(){
        TreeNode root=new TreeNode(15);
        TreeNode firstNode=new TreeNode(2);
        TreeNode secondNode=new TreeNode(3);
        node=root;
        node.left=firstNode;
        node.right=secondNode;
        System.out.println(node.data);
        System.out.println(node.left.data);
        System.out.println(node.right.data);
    }
}
