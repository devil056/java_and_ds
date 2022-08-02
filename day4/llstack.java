class Node{
	int data;
	Node next;//self referential -> points to another node of same type
}

class Stack{
	private Node top;
	private int nodeCount;

	public Stack(){
		//for initialization of data members
		this.top=null;
		this.nodeCount=0;
	}

	public void push(int x){
		Node n1=new Node();
		if(n1==null){
			System.out.println("Heap is overflowed");
			return;
		}
		System.out.println("Let's start inserting.");
		n1.data=x;
		n1.next=top;
		top=n1;
		this.nodeCount+=1;
	}

	public boolean isEmpty(){
		return top==null;
	}

	public int peek(){
		if(isEmpty()){
			System.out.println("The stack is empty");
			System.exit(-1);
		}
		return top.data;
	}

	public int pop(){
		if(isEmpty()){
			System.out.println("Stack underflow");
			System.exit(-1);
		}
		int top=peek();
		System.out.println("removing the element "+top);
		this.nodeCount-=1;
		this.top=(this.top).next;
		return top;
	}

	public int size(){
		return this.nodeCount;
	}

	public void print(){
		Node n1=new Node();
		n1=top;
		for(int i=0;i<nodeCount;i++){
			System.out.println("Value is: "+n1.data);
			n1=n1.next;
		}
	}
}

class Main{
	public static void main(String args[]){
		Stack st1=new Stack();
		st1.push(1);
		st1.push(2);
		st1.push(3);
		System.out.println("The top element in the stack: "+st1.peek());
		st1.pop();
		st1.print();

	}
}
