package progrms;

import java.util.HashMap;
import java.util.Map;

public class characcurance {

	public static void main(String[] args) {

		
		String str = "java";
		
		char[] arr = str.toCharArray();
		
		Map<Character,Integer> map = new HashMap<Character, Integer>();
		
		int count =1;
		
		for(int i=0;i<arr.length;i++) {
			
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], count);
			}else {
				
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		
		for(Character x : map.keySet()) {
			System.out.println("Number of Character :"+ " "+ x + "="+ map.get(x) );
		}
	}

}
