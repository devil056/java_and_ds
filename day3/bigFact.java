import java.math.BigInteger;

class BigFact{
	public static BigInteger fact(int num){
		if(num>=1){
			return BigInteger.valueOf(num).multiply(fact(num-1));
		}else{
			return BigInteger.ONE;
		}
	}
	public static void main(String[] args){
		int input=100;
		BigInteger output=fact(100);
		System.out.println(output);
	}
}
