class Node4{
    int item;
    Node4 left, right;
    public Node4(int key){
        item=key;
        left=right=null;
    }
}
class TraverseTree{
    Node4 root;
    TraverseTree(){
        root=null;
    }
    void preOrder(Node4 node){
        if(node==null) return;
        System.out.print(node.item+"->");
        preOrder(node.left);
        preOrder(node.right);
    }
    void inOrder(Node4 node) {
        if (node == null) return;
        inOrder(node.left);
        System.out.print(node.item + "->");
        inOrder(node.right);
    }
    void postOrder(Node4 node) {
        if (node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.item + "->");
    }

    public static void main(String[] args) {
        TraverseTree tree1=new TraverseTree();
        tree1.root=new Node4(1);
        tree1.root.left=new Node4(12);
        tree1.root.right=new Node4(9);
        tree1.root.left.left=new Node4(11);
        tree1.root.left.right=new Node4(6);
        System.out.print("Preorder traversal->");
        tree1.preOrder(tree1.root);
        System.out.println();
        System.out.print("Inorder traversal: ");
        tree1.inOrder(tree1.root);
        System.out.println();
        System.out.print("Post order traversal: ");
        tree1.postOrder(tree1.root);

    }
}
