class LinkedList{
    Node head;
    private int size;
    LinkedList(){
        this.size=0;
    }
    //Defining a node -> representation of the data we want to store and define a constructor
    //Node can hold any kind of the data that you wish to save
    //if we are to represent it to our own process i would choose associate id, manager id and regular metrics in a node
    class Node{
        int data;
        Node next;
        //constructor to initialize the node
        Node(int data){
            this.data=data;
            this.next=null;
            ++size;
        }
    }
    //Adding a new node
    public void addNode(int data){
        //head will hold the address of the first element
        //incase if there is no first element, set it to the element we just created
        Node newNode=new Node(data);
        if(head == null){
            head=newNode;
            return;
        }
        //suppose there is already a list present then we just need to point the address of first element to the next node
        //of the node we just created and replace the address in head to the newly created node address
        newNode.next=head;
        head=newNode;
    }

    //Adding a node at last
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head == null){
            head=newNode;
            return;
        }
        Node currentNode=head;
        while(currentNode.next != null){
            currentNode=currentNode.next;
        }
        currentNode.next=newNode;
    }

    //Display all the nodes
    public void printList(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node currentNode=head;
        while(currentNode != null){
            System.out.print(currentNode.data+" -> ");
            currentNode=currentNode.next;
        }
        System.out.println("NULL");
    }
    /*
    In this case traversing the nodes follows the simple logic as long as we have the next node replace it with
    current node and keep moving while u print the data specified
     */

    //delete first element in linked list
    public void deleteFirst(){
        if(head ==null){
            System.out.println("The list is empty");
        }
        --size;
        head=head.next;
    }

    public void deleteLast(){
        if(head==null){
            System.out.println("The list is empty");
        }
        --size;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }

    public void getSize(){
        System.out.println("The size of the Linked list: "+size);
    }

    public static void main(String[] args){
        LinkedList ll=new LinkedList();
        ll.addNode(21);
        ll.addNode(56);
        ll.printList();
        ll.addLast(18);
        ll.printList();
        ll.addNode(04);
        ll.printList();
        ll.addLast(55);
        ll.getSize();
        ll.printList();
        ll.deleteLast();
        ll.printList();
        ll.getSize();
        ll.deleteFirst();
        ll.printList();
        ll.getSize();
    }
}