package Programs;

public class ReverseString {

	public static void main(String[] args) {

		String str = "Success is path of life";
		
		String[] arr = str.split(" ");
		
		for(String word:arr) {
			
			String rev = "";
			int j = word.length()-1;
			
			while(j>=0) {
				rev = rev + word.charAt(j);
				j--;
			}
			
			System.out.print(rev + " ");
		}
	}

}
