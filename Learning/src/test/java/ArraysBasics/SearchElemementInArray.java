package ArraysBasics;

public class SearchElemementInArray {

	public static void main(String[] args) {

		int[] a = { 10, 20, 30, 40, 50 };

		int searchElement = 20;

		for (int i = 0; i <= a.length - 1; i++) {

			System.out.println(a[i]);
			if (a[i] == searchElement) {
				System.out.println("Elemet found");
				break;
			} else {
				System.out.println("Element not found");
			}

		}
	}

	public static void main1(String[] args) {

		int[] a = { 10, 20, 30, 40, 50 };

		int searchElement = 20;
		
		boolean status=false;
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]==searchElement) {
				System.out.println("Element found");
				status=true;
				break;
			}
		}
		
		for(int arr:a) {
			if(arr==searchElement) {
				System.out.println("Element found");
				status=true;
				break;
		}
		
	}
		if(status==false) {
			System.out.println("Element not found");
		}
	}
}
