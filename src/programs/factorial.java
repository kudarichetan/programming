package programs;
import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n = scanner.nextInt();
		int fact = 1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println(fact + " is the Factorial of "+n);
	}
}
