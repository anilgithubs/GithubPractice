package ArraysBasics;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		//Declaration
		
		//Approach1
		
		int a[][] = new int[3][2];
		
		a[0][0]= 100;
		a[0][1]= 101;
		
		a[1][0]= 102;
		a[1][1]= 103;
		
		a[2][0]= 102;
		a[2][1]= 103;
		
		//Approach2
		
		int b[][] = {
				{101,102},
				{103,104},
				{105,106}
		};
		
		
	/*	for(int r=0;r<=2;r++) {
			
			for(int c=0;c<=1;c++) {
				
				System.out.print(b[r][c]+ " ");
			}
			System.out.println(" ");
		}*/
		
		
	for(int r=0;r<=b.length-1;r++) {
			
			for(int c=0;c<=b[r].length-1;c++) {
				
				System.out.print(b[r][c]+ " ");
			}
			System.out.println(" ");
		}
		//How to find Size of Array
//		System.out.println("Number of Row:"+b.length);
//		System.out.println("Number of column:"+b[0].length);
//		System.out.println(b[2][1]);

//=========================================================================================/
	
	/* int c[][] = {
			{100,101},
			{200,201},
			{300,301}
	};
	
	
	for(int arr[]:c) {
		
		for(int x:arr) {
			System.out.print(x + " ");
		}
		
		System.out.println(" ");
	} */
	
	}
	
}
