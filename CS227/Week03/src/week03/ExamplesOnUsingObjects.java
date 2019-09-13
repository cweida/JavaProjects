package week03;

import java.awt.Rectangle;
import java.awt.Button;

public class ExamplesOnUsingObjects {
	public static void main(String[]args) {
		//declare a new variable
		//assign a value to a variable
		//perform some operation on a variable
		// print out something
		int age = 20;
		double height = 6.0;
		boolean isFresh = true;
		char midInit;
		String name = "Chase M Weida";
		
		
		int posInit = name.indexOf(' ');
		midInit = name.charAt(posInit+1);
		System.out.println(midInit);
		if (isFresh == true) {
			System.out.println(age);
		}
		else {
			System.out.println(height);
		}
		
		
		// Need a constructor to use rectangle
		
		
		Rectangle door = new Rectangle(0,0,3,3);
		
		
		//Check API to see possible Rectangle methods

		
		
	}
	
	
	
}
