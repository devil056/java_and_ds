class StackDS{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Stack{
        static Node head;
        void push(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }

        int pop(){
            if(head==null){
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }

        int peek(){
            if(head==null){
                return -1;
            }
            return head.data;
        }

        void pushAtBottom(int data,Stack s){
            if(head==null){
                s.push(data);
                return;
            }
            int top=s.pop();
            pushAtBottom(data,s);
            s.push(top);
        }
        void printStack(){
            while(head!=null){
                System.out.print(head.data+"->");
                head=head.next;
            }
            System.out.println("NULL");
        }
    }
    public static void main(String[] args){
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("Top element: "+s.peek());
        System.out.println("Removed element: "+s.pop());
        System.out.println("Top element: "+s.peek());
        s.pushAtBottom(0,s);
        s.printStack();
    }
}