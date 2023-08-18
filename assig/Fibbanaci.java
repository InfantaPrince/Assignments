package week1.assig;

import java.util.Iterator;

public class Fibbanaci {

	public static void main(String[] args) {
	int x=0;
	int i;
		int y=1;
		int z=0;
		System.out.print(x+","+y);
	for(i=0;i<=5;i++) {
		
		z=x+y;
        x=y;
       y=z;
   	System.out.print(","+z);
		}
	}

}
