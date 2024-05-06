package Pattren;

public class Pattren1 {

	public static void main(String[] args) {

		int row = 5;
		
		for(int i=1;i<=row;i++) {
			
			char ch ='a';
			for(int j=1;j<=i;j++) {
			  
				System.out.print(ch++ + " ");
			
			}
			System.out.println(" ");
		}
	}

}
