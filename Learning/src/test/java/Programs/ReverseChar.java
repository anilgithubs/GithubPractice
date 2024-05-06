package Programs;

import java.util.HashMap;
import java.util.Map;

public class ReverseChar {

	public static void main(String[] args) {

		String str = "success";
		char[] arr = str.toCharArray();
		int count=1;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0;i<arr.length;i++) {
			
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], count);
			}else {
				
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		
		for(Character x : map.keySet()) {
			
			System.out.println("Number of Character present :"+x+": ="+map.get(x));
		}
	}

}
