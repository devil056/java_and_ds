// A Binary Tree NodeClonerCloner
class NodeCloner
{
    int data;
    NodeCloner left, right;

    NodeCloner(int data) {
        this.data = data;
    }
}

class Main12
{
    // Function to print the inorder traversal on a given binary tree
    public static void inorder(NodeCloner root)
    {
        if (root == null) {
            return;
        }

        // recur for the left subtree
        inorder(root.left);

        // print the current NodeCloner's data
        System.out.print(root.data + " ");

        // recur for the right subtree
        inorder(root.right);
    }

    // Recursive function to clone a binary tree
    public static NodeCloner cloneBinaryTree(NodeCloner root)
    {
        // base case
        if (root == null) {
            return null;
        }

        // create a new NodeCloner with the same data as the root NodeCloner
        NodeCloner root_copy = new NodeCloner(root.data);

        // clone the left and right subtree
        root_copy.left = cloneBinaryTree(root.left);
        root_copy.right = cloneBinaryTree(root.right);

        // return cloned root NodeCloner
        return root_copy;
    }

    public static void main(String[] args)
    {
        NodeCloner root = new NodeCloner(1);
        root.left = new NodeCloner(2);
        root.right = new NodeCloner(3);
        root.left.left = new NodeCloner(4);
        root.left.right = new NodeCloner(5);
        root.right.left = new NodeCloner(6);
        root.right.right = new NodeCloner(7);

        NodeCloner clone = cloneBinaryTree(root);

        System.out.print("Inorder traversal of the cloned tree: ");
        inorder(clone);
    }
}
