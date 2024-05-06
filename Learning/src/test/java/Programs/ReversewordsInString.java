package Programs;

import java.util.HashMap;
import java.util.Map;

public class ReversewordsInString {

	public static void main(String[] args) {

		String str = "success is path of life success";
		String[] arr = str.split(" ");
		int count=1;
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i=0;i<arr.length;i++) {
			
			if(!map.containsKey(arr[i])) {
				
				map.put(arr[i], count);
			}else {
				
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		
		for(String x: map.keySet()) {
			
			System.out.println("Number of count word"+ x +"=" + map.get(x));
		}
	}

}
