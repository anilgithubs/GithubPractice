package Programs;

public class StringUppercase {

	public static void main(String[] args) {

		String str = "naveen automation lab";
		
		String[] arr = str.split(" ");
		
		for (String word : arr) {
			String firstWord = word.substring(0, 1).toUpperCase();
			String secondWord = word.substring(1);
			System.out.print(firstWord+secondWord + " ");
		}
			
		}

}
