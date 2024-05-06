package ArraysBasics;

import java.util.Arrays;

public class ReapeatedNumberInArray {

	public static void main(String[] args) {
		int[] a = { 100, 200, 300, 100, 200, 400, 500 };
		int num = 300;
		int count = 0;
         System.out.println(Arrays.toString(a));
         Arrays.sort(a);
         System.out.println(Arrays.toString(a));

	}
}
