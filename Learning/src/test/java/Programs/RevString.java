package Programs;

public class RevString {

	public static void main(String[] args) {

		String str = "Hi Hello How Are You";
		//String[] str = str1.split(" ");
		String rev = "";
		
		for(int i=str.length()-1;i>=0;i--) {
			
			System.out.print(str.charAt(i));
		}
	}

}
