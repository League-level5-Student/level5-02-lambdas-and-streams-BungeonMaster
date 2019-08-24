package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s)->{
			String bs = "";
			for(int i =s.length() - 1; i >= 0; i--) {
				bs+= s.charAt(i);
			}
			System.out.println(bs);
		}, "repeat");
		
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{
			String bs = "";
			for(int i = 0; i < s.length(); i++) {
				
				if(i%2==0) {
					bs+= s.charAt(i);
				}
				else {
					bs+= (char)(s.charAt(i) - 32);
				}
				
			}
			System.out.println(bs);
		}, "repeat");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s)->{
			String bs = "";
			for(int i = 0; i < s.length(); i++) {
					bs+= s.charAt(i) + ".";
			}
			System.out.println(bs);
		}, "repeat");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s)->{
			String bs = "";
			for(int i = 0; i < s.length(); i++) {
				char curr = s.charAt(i);
				if(curr!='a'&&curr!='e'&&curr!='i'&&curr!='o'&&curr!='u'&&curr!='y')
					bs+= curr;
			}
			System.out.println(bs);
		}, "repeat");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
