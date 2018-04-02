package programs;
import java.util.Scanner;
public class removeCharacterFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=null,c=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String :"); 
		str=sc.nextLine();
		System.out.println("Entered String is :"+str);
		System.out.println("Enter the Character to be removed from String :");
		c=sc.next();
		str=str.replaceAll(c, "");
		System.out.println("String after removing a char "+str);
	}
}
