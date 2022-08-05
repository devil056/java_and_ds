class NodeSum {
    Node head;
    static int size;
    class Node{
        int num;
        Node next;
        Node(int data){
            this.num=data;
            this.next=null;
            ++size;
        }
    }

    void addNode(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    void printList(){
        if(head==null){
            System.out.println("The list is empty");
        }
        Node currentNode=head;
        while(currentNode!=null){
            System.out.print(currentNode.num+"->");
            currentNode=currentNode.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args){
        NodeSum s=new NodeSum();
        s.addNode(3);
        s.addNode(4);
        s.addNode(2);
        s.printList();
        NodeSum s2=new NodeSum();
        s2.addNode(4);
        s2.addNode(6);
        s2.addNode(5);
        s2.printList();
    }
}
