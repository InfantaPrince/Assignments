package week1.assig;

public class Palindrome {

	public static void main(String[] args) {
		int num=434; 
	int temp=num;
		int remaind,reverse=0;
		

		/*while(num!=0) {
			
			 remaind=num%10;
			num=num/10;
			reverse=(reverse*10)+remaind;
		
		   }
		System.out.println(reverse);
		System.out.println(num);
		*/
		
for(;num>0;) {
		
		 remaind=num%10;
		num=num/10;
		reverse=(reverse*10)+remaind;
	
	   }
	System.out.println(reverse);
	System.out.println(num);

		
		if(temp==reverse)
		{
			System.out.println("The Number is Palindrome");
			
		}else
		{
			
			System.out.println("The Number is Not a Palindrome");
		}
	}

}
