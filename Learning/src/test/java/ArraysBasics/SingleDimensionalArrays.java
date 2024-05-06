package ArraysBasics;

public class SingleDimensionalArrays {

	public static void main(String[] args) {
		
		//declaration Array
		
		//Approach 1
		
		int a[]=new int[5];
		
		a[0]=100;
		a[1]=101;
		a[2]=102;
		a[3]=103;
		a[4]=104;
		
		//Approach 2
		
		int[] b= {100,101,102,103,104};
		
		/*for(int a1:b) {
			
			System.out.println(a1);
			if(a1==102) {
				System.out.println("Got a1:"+ a1);
				break;
			}
		}*/
		
		
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
//		
//		System.out.println(b.length);
//		
//		System.out.println(b[2]);
	}

}
