package programs;

import java.util.Scanner;

public class fibbonacciSeriesAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n=scanner.nextInt();
		fib(n);
		System.out.println("Fibonnacci series Addition :"+fib(n));
	}

	private static int fib(int n) {
		// TODO Auto-generated method stub
		if(n<=1)
			return n;
		return fib(n-1) + fib(n-2);
	}

}
