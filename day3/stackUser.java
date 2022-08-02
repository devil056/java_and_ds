import java.util.*;

class UserStack{
	int arr[],top,capacity;

	public void Stack(int size){
		arr =new int[size];
		top=-1;
		capacity=size;
	}

	void push(int data){
		if(top>=capacity-1){
			System.out.println("Stack is full");
		} else {
			++top;
			arr[top]=data;
			System.out.println(arr[top]+" item is pushed");
		}
	}

	void pop(){
		if(top<=0){
			System.out.println("No values to remove");
		} else {
			--top;
			System.out.println("Item is popped");
		}
	}

	void print(){
		System.out.println("Printing values from stack");
		for(int i=0;i<=top;i++){
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args){
		Stack st=new Stack(5);
		st.push(1);
		st.push(4);
		st.push(9);
		st.push(16);
		st.print();
		st.pop();
		st.pop();
		st.print();		
	}
}
