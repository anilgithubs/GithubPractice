package ArraysBasics;

import java.util.Scanner;

public class TakeMultipleInputFromKeyboard {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please Enter a first Number");
		int num1 = sc.nextInt();

		System.out.println("Please Enter a second Number");
		int num2 = sc.nextInt();
		
		System.out.println("Addition of two numbers:"+ (num1+num2));

	}

}
