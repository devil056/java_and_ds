class Sorting1{
	public static void main(String[] args){
		int[] age={12,4,5,2,89};
		int t,j;
		for(int i=0;i<age.length;i++){
			for(j=i+1;j<age.length;j++){
				if(age[i]>age[j]){
					t=age[i];
					age[i]=age[j];
					age[j]=t;
				}
			}
		}
		for(int i=0;i<age.length;i++){
			System.out.println(age[i]);
		}
		System.out.println("Done");
	}
}
