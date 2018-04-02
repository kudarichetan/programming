package programs;

import java.util.Scanner;

public class occuranceOfCharInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=null;
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		str=sc.nextLine();
		System.out.println("Entered String is :"+str);
		System.out.println("Enter a character to be counted : ");
		char ch=sc.next().charAt(0);
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==ch) {
				count++;
			}
		}
		System.out.println("Num of Occurance is :"+count);
	}
}
