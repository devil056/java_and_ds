class RecurAdd{
	public static int recadd(int a,int b){
		if(b==0)
			return a;
		int sum=a^b;
		int carry=(a&b)<<1;
		return recadd(sum,carry);
	}

	public static int sub(int a, int b){
		int x=~b;
		int m=recadd(a,x);
		return m+1;
	}
	
	public static void main(String[] args){
		System.out.println("Sum of 2 numbers is: "+recadd(5,6));
	}
}
