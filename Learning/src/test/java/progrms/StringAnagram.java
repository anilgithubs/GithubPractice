package progrms;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {

		String str1 = "java";
		String str2 =  "avasj";
		
		char[] str1Array = str1.toCharArray();
		char[] str2Array = str2.toCharArray();
		
		Arrays.sort(str1Array);
		Arrays.sort(str2Array);
		
		if(Arrays.equals(str1Array, str2Array)) {
			
			System.out.println("given string Anagram");
		}else {
			
			System.out.println("given string not a anagram");
		}
		
	}

}