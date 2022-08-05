class Node4 {
    int item;

    Node4 left, right;

    public Node4(int key) {
        item = key;
        left = right = null;
    }
}

class TraverseTree {
    Node4 root;

    TraverseTree() {
        root = null;
    }

    void preOrder(Node4 node) {
        if (node == null)
            return;

        System.out.print(node.item + "->");

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
        inOrder(node.left);
        inOrder(node.right);
        System.out.print(node.item + "->");
    }

    public static void main(String args[]) {
        TraverseTree tre1 = new TraverseTree();
        tre1.root = new Node4(1);
        tre1.root.left = new Node4(12);
        tre1.root.right = new Node4(9);
        tre1.root.left.left = new Node4(11);
        tre1.root.left.right = new Node4(6);
        System.out.println("Preorder Traversal->");
        tre1.preOrder(tre1.root);
        tre1.inOrder(tre1.root);
        tre1.postOrder(tre1.root);
    }
}

