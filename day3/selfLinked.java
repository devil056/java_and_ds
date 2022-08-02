class SelfNode{
	public static class Node{
		int data;
		String name;
		String hobby;
		Node next;
	}
	public static void main(String[] args){
		Node node1=new Node();
		Node node2=new Node();
		Node node3=new Node();
		node1.data=1;
		node1.name="Murari";
		node1.hobby="Basketball";
		node1.next=node2;
		node2.data=2;
		node2.name="Sukumar";
		node2.hobby="Table Tennis";
		node2.next=node3;
		node3.data=3;
		node3.name="Satya";
		node3.hobby="Swimming";
		node3.next=null;
		for(int i=0;i<3;i++){
			System.out.println("Entry "+node1.data+" : "+node1.name+" hobby is "+node1.hobby);
			node1=node1.next;
		}
	}
}
