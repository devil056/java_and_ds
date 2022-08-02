import java.util.*;

class ShoppingList{
	public static class Node{
		int ID;
		String ProductName;
		long cost;
		Node next;
	}
	public static void AddProduct(int id,String name,long price,String choice){
		arr[id]=new Node();
		arr[id].ID=id+1;
		arr[id].ProductName=name;
		arr[id].cost=price;
		arr[id].next= choice.equalsIgnoreCase("y")?arr[id+1]:null;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Node[] arr=new Node[];
		System.out.println("Do you wish to add a new product?[y/n]");
		String choice=sc.nextLine();
		if(choice.equalsIgnoreCase("y"){
			System.out.println("Enter the product name you wish to purchase: ");
			String productName=sc.nextLine();
			System.out.println("Enter the price of product: ");
			long price=sc.nextInt();
			sc.nextLine();
			System.out.println("Do you wish to continue shopping?[y/n]");
			choice=sc.nextLine();
			AddProduct(arr.length,productName,price,choice);
		}

	}
}
