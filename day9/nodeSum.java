class NodeSum {
    Node head;
    static int size;

    class Node {
        int num;
        Node next;

        Node(int data) {
            this.num = data;
            this.next = null;
            ++size;
        }
    }

    void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currentNode=head;
        while(currentNode.next!=null){
            currentNode=currentNode.next;
        }
        currentNode.next=newNode;
    }

    void printList() {
        if (head == null) {
            System.out.println("The list is empty");
        }
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.num + "->");
            currentNode = currentNode.next;
        }
        System.out.println("NULL");
    }

    int listToNum(){
        Node currentNode=head;
        int num= 0;
        int i=0;
        while (i<size && currentNode!=null){
            num=(int)(Math.pow(10,i)* currentNode.num)+num;
            currentNode=currentNode.next;
            i++;
        }
        return num;
    }

    public static void main(String[] args) {
        NodeSum s = new NodeSum();
        s.addNode(1);
        s.addNode(2);
        s.addNode(3);
        s.printList();
        NodeSum s2 = new NodeSum();
        s2.addNode(3);
        s2.addNode(4);
        s2.addNode(5);
        s2.printList();
        int num1=s.listToNum();
        int num2=s2.listToNum();
        int res=num1+num2;
        NodeSum result=new NodeSum();
        while(res!=0){
            result.addLast(res%10);
            res=res/10;
        }
        result.printList();
    }
}
