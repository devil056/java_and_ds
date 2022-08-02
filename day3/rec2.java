class RecFact{
	public static long fact(int num){
		if(num>=1){
			return num*fact(num-1);
		}else{
			return num;
		}
	}

	public static void main(String[] args){
		int num=100;
		long out=fact(num);
		System.out.println(out);
	}
}
