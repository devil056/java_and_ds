import java.util.*;

class Stack{
	int arr[],top,capacity;

	public Stack(int size){
		arr=new int[size];
		top=-1;
		capacity=size;
	}

	void push(int data){
		if(top>=capacity-1){
			System.out.println("Stack is full");
		}else{
			++top;
			arr[top]=data;
			System.out.println(arr[top]+" item is pushed");
		}
	}

	void pop(){
		if(top<=0){
			System.out.println("Stack is empty/ No values in stack.");
		}else{
			--top;
			System.out.println("Item is removed");
		}
	}

	void print(){
		for(int i=0;i<top;i++){
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args){
		Stack st=new Stack(5);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.print();
	}
}
