package factorialRecursion;

public class Factorial {
	static int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		else {
			return (n*factorial(n-1));
		}
	}

public static void main(String[] args) {
	int fact = 1;
	int n = 5;
	fact = factorial(n);
	System.out.println(fact);
	
	
	}
}