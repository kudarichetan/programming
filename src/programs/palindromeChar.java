package programs;

import java.util.Scanner;

public class palindromeChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a string :");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		int length = str.length();
		String rev = "";
		for(int i=length-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(str.equalsIgnoreCase(rev)) {
			System.out.println(str+" is a Palindrome");
		}
		else {
			System.out.println(str+" is not a Palindrome");
		}
	}
}
