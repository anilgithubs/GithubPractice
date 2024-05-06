package progrms;

public class revrseEachcharinstring {

	public static void main(String[] args) {

		String str = "java program";
		
		String[] arr = str.split(" ");
		
		for(String word:arr) {
			int j = word.length()-1;
			String rev= " ";
			while(j>=0) {
				
				rev = rev + word.charAt(j);
				j--;
			}
			System.out.print(rev+ " ");
		}
	}

}
