package week1.assig;

public class PrimeorNot {

	public static void main(String[] args) {
	double num=2147483647;
	double i,j;
	boolean result;
	result=true;
	System.out.println(System.currentTimeMillis());
	for(i=2;i<num;i++) {
		
		

	
			for(j=2;i<num/2;i++) {
			
			if(num%i==0) {
				result=false;
				System.out.println("Not a prime");
				break;
			}
	}
		if(result==true) {
			
			System.out.println("Is prime");
	}
		System.out.println(System.currentTimeMillis());

	
	
}
	}
}