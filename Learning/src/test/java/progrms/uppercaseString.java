package progrms;

public class uppercaseString {

	public static void main(String[] args) {

		String str = "naveen automation";
		
		String[] arr = str.split(" ");
		
		for(String word : arr) {
			
			String firstLatterUpperCase = word.substring(0, 1).toUpperCase();
			String length = word.substring(1);
			
			
			System.out.print(firstLatterUpperCase + length + " ");
		}
	}

}
