package programs;

import java.util.Scanner;

public class firstNonRepeatedCharacterInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.nextLine();
		char c = firstNonRepeatedChar(s.toLowerCase());
		if(c!=' ') {
			System.out.println("The first non repeated character is : "+c);
		}
	}

	private static char firstNonRepeatedChar(String str) {
		// TODO Auto-generated method stub
		char ch = ' ';
		int intUniqueIndex=-1;
		for (int i=0;i<str.length();i++) {
			ch=str.charAt(i);
			if(str.indexOf(ch)==str.lastIndexOf(ch)) {
				System.out.println("First non-repeated char is :"+ch);
				intUniqueIndex=i;
				break;
			}
		}
		if(intUniqueIndex==-1) {
			System.out.println("No Unique Character");
			ch=' ';
		}
		return ch;
	}
}
