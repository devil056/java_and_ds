import java.util.Stack;
import java.util.function.BinaryOperator;

class Node2 {
    int value;
    Node2 left;

    Node2 right;

    public Node2(int data) {
        this.value = data;
    }

    public Node2 root;

    public static void insert(Node2 node, int value) {

        if (value < node.value) {
            if (node.left != null) {
                insert(node.left, value);
            } else {
                System.out.println("Inserted " + value + " to left " + node.value);
                node.left = new Node2(value);
            }
        } else if (value > node.value) {
            if (node.right != null) {
                insert(node.right, value);
            } else {
                System.out.println("Inserted " + value + " to right " + node.value);
                node.right = new Node2(value);
            }
        }
    }

    public static void preOrder(Node2 root) {
        Stack<Node2> st = new Stack();
        st.push(root);
        System.out.println("Pre order value : ");
        while (!st.isEmpty()) {
            Node2 temp = st.pop();
            System.out.print(temp.value + "\t");
            if (temp.right != null)
                st.push(temp.right);
            if (temp.left != null)
                st.push(temp.left);
        }
        System.out.println();
    }

    public static void inOrder(Node2 root) {
        Stack<Node2> st = new Stack();
        Node2 temp = root;
        System.out.println("In order value : ");
        while (!st.isEmpty() || temp != null) {
            while (temp != null) {
                st.push(temp);
                temp = temp.left;
            }
            temp = st.pop();
            System.out.print(temp.value + "\t");
            temp = temp.right;
        }
        System.out.println();
    }

}

class App {
    public static void main(String args[]) {
        Node2 rootNode = new Node2(25);
        rootNode.insert(rootNode, 11);
        rootNode.insert(rootNode, 10);
        rootNode.insert(rootNode, 30);
        rootNode.insert(rootNode, 28);
        rootNode.insert(rootNode, 20);
        rootNode.insert(rootNode, 35);
        rootNode.preOrder(rootNode);
        rootNode.inOrder(rootNode);
    }
}