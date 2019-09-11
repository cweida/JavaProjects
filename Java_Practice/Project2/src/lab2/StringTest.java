package lab2;

public class StringTest {

	public static void main(String[] args) {
		String message;
		message = "Hello, world!";
		System.out.println(message);
		
		int theLength = message.length();
		System.out.println(theLength);
		
		String messageUP = message.toUpperCase();
		System.out.println(messageUP);
		
		String sub = message.substring(0, 5);
		System.out.println(sub);
		
		String oStar = message.replace('o','*');
		System.out.println(oStar);
	}

}
