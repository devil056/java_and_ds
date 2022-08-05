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
        if (root == null)
            return;
        System.out.print(root.value + "\t");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void postOrder(Node2 root) {
        if (root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.value + "\t");
    }

    public static void inOrder(Node2 root) {
        if (root == null)
            return;
        inOrder(root.left);
        System.out.print(root.value + "\t");
        inOrder(root.right);
    }

    public static void postOrder2(Node2 root) {
        Stack<Node2> st = new Stack<>();
        Node2 c = root;
        while (c != null || !st.isEmpty()) {
            if (c != null) {
                st.push(c);
                c = c.left;
            } else {
                Node2 temp = st.peek().right;
                if (temp == null) {
                    temp = st.pop();
                    System.out.print(temp.value + "\t");
                    while (!st.isEmpty() && temp == st.peek().right) {
                        temp = st.pop();
                        System.out.print(temp.value + "\t");
                    }
                } else
                    c = temp;
            }
        }
        System.out.println();
    }

    public static void preOrder2(Node2 root) {
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

    public static void inOrder2(Node2 root) {
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
        Node2 rootnode = new Node2(25);
        rootnode.insert(rootnode, 11);
        rootnode.insert(rootnode, 10);
        rootnode.insert(rootnode, 30);
        rootnode.insert(rootnode, 28);
        rootnode.insert(rootnode, 20);
        rootnode.insert(rootnode, 35);
        System.out.println("Pre order value : ");
        rootnode.preOrder(rootnode);
        System.out.println();
        //System.out.println("In order value : ");
        //rootnode.inOrder(rootnode);
        //System.out.println();
        System.out.println("Post order value : ");
        rootnode.postOrder(rootnode);
        System.out.println();
        System.out.println("Post order value using iteration : ");
        rootnode.postOrder2(rootnode);
        System.out.println();
        System.out.println("Pre order value using iteration : ");
        rootnode.preOrder2(rootnode);
        System.out.println();
        System.out.println("In order value using iteration: ");
        rootnode.inOrder2(rootnode);
        System.out.println();
    }
}