class CloneBST {
    static Node root;

    CloneBST() {
        root = null;
    }

    class Node {
        int key;
        Node left, right;

        Node(int key) {
            this.key = key;
            this.left = this.right = null;
        }
    }

    void insertNode(Node n, int data) {
        if (n == null) {
            n = new Node(data);
        }
        if (data < n.key) {
            if (n.left != null) {
                insertNode(n.left, data);
            }
            n.left = new Node(data);
        } else if (data > n.key) {
            if (n.right != null) {
                insertNode(n.right, data);
            }
            n.right = new Node(data);
        }
    }

    public static void main(String[] args) {
        CloneBST bs = new CloneBST();
        bs.insertNode(root, 2);
    }
}