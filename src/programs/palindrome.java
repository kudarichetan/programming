package programs;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("enter a string :");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		//reverse the given string
		String reverse = new StringBuffer(s).reverse().toString();
		
		//Check if it is a palindrome
		if(s.equals(reverse)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}
}
