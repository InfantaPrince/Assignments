package week1.assig;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
	int[] arry={23,45,67,32,89,22 };
	int i;
	Arrays.sort(arry);
	int largno,secndlarno;
	
	largno=arry[arry.length-1];
	for(i=arry.length-2;i>=0 ;i--) 
	
	{
	
		
		if(largno!=arry[i]) {
			secndlarno=arry[i];
			System.out.println(secndlarno);
			break;
		}
		
	//	break;
	
		}
	
	}

}
