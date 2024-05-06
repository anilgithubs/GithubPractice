package Programs;

public class ALphaNumSpl {

	public static void main(String[] args) {

		String str = "jhcdSVKJ^%#&*1234gjkn#(*&490";
		String alpha =" ";
		String num = " ";
		String spl = " ";
		for(int i=0;i<str.length();i++) {
			
			if((str.charAt(i)>='a' && str.charAt(i)<='z') || (str.charAt(i)>='A' && str.charAt(i)<='Z')){
				alpha = alpha + str.charAt(i);
			}else if ((str.charAt(i)>='0' && str.charAt(i)<='9')) {
				
				num = num + str.charAt(i);
			}else {
				spl = spl + str.charAt(i);
			}
		}
		
		System.out.println("Aplhabets :" + alpha);
		System.out.println("Numbers :"+ num);
		System.out.println("Special :"+ spl);
		
	}

}
