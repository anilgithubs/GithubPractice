import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cls {
	static WebDriver driver;

	public static void main(String[] args) {

		  int [] a={1,1,2,2,3,3,3,4,4,4,4,3};
	       int count=1;
	     Map<Integer, Integer> map =  new HashMap<Integer,Integer>();
	     
	     for(int i=0;i<a.length;i++){
	         
	         if(!map.containsKey(a[i])){
	             
	             map.put(a[i],count);
	         }else{
	             map.put(a[i], map.get(a[i])+1);
	         }
	         
	     }
	     
	     for(Integer x: map.keySet()){
	         
	         System.out.println("Number of times accured :"+x+" = " + map.get(x));
	     }
		
		
	}

}
