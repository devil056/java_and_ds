class LinkedList {
    Node head;
    class Node{
        int data;
        Node next;
        private static int size=0;
        Node(int data){
            this.data=data;
            this.next=null;
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
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+" ->");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args){
        LinkedList ll=new LinkedList();
        ll.addNode(5);
        ll.addNode(3);
        ll.addNode(9);
        ll.printList();
    }
}
