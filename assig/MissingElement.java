package week1.assig;


import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		
int i;
		Arrays.sort(arr);
		
	
		for(i=1;i<arr.length;i++)
		{
							
		if(i!=arr[i-1])
		{
			
			
			System.out.println(arr[i]);
			break;
			
		}
			
			}
		
		
			
		
	}

}