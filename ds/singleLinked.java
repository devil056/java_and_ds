class SingleLinked{
    Node head;
    private int size;
    SingleLinked(){
        this.size=0;
    }

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
            ++size;
        }
        Node(int data,Node next){
            this.data=data;
            this.next=next;
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

    void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currentNode=head;
        while (currentNode.next!=null){
            currentNode=currentNode.next;
        }
        currentNode.next=newNode;
    }

    void atPosition(int data,int index){
        if(size<index){
            System.out.println("Unable to add node at the index position provided");
            return;
        }
        Node currentNode=head;
        for(int i=1;i<index;i++) {
            currentNode=currentNode.next;
        }
        Node newNode=new Node(data,currentNode.next);
        currentNode.next=newNode;
    }

    void deleteFirst(){
        if(head==null){
            System.out.println("The list is empty");
        }
        head=head.next;
        --size;
    }

    void deleteLast(){
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

    void deleteAt(int index){
        if(size<index){
            System.out.println("The size of the list :"+size);
            return;
        }
        Node currentNode=head;
        Node nextNode=head.next;
        for(int i=1;i<index;i++){
            nextNode=nextNode.next;
            currentNode=currentNode.next;
        }
        currentNode.next=nextNode.next;
        --size;
    }

    void printList(){
        if(head==null){
            System.out.println("List is empty");
        }
        Node currentNode=head;
        while(currentNode!=null){
            System.out.print(currentNode.data+" -> ");
            currentNode=currentNode.next;
        }
        System.out.println("NULL");
    }

    void getSize(){
        System.out.println("Size of the Linked list is :"+size);
    }

    public static void main(String[] args){
        SingleLinked sl=new SingleLinked();
        sl.getSize();
        sl.addNode(3);
        sl.addNode(4);
        sl.addNode(6);
        sl.addLast(8);
        sl.printList();
        sl.atPosition(5,1);
        sl.printList();
        sl.atPosition(7,4);
        sl.printList();
        sl.deleteFirst();
        sl.printList();
        sl.deleteLast();
        sl.printList();
        sl.deleteAt(3);
        sl.printList();
        sl.getSize();
    }
}