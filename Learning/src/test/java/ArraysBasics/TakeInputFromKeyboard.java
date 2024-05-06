package ArraysBasics;

import java.util.Scanner;

public class TakeInputFromKeyboard {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Please Enter a Number");
		int num = sc.nextInt();
		
		System.out.println(num+10);
	}

}
