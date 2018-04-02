package programs;
import java.util.Scanner;

public class xPowerY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of X : ");
		int x = scanner.nextInt();
		System.out.println("Enter the value of Y : ");
		int y = scanner.nextInt();
		
		int power=findPower(x,y);
		System.out.println("XPowerY is :"+power);
		
	}

	private static int findPower(int a, int b) {
		// TODO Auto-generated method stub
		if(b==0) {
			return 1;
		}
		else if(b==1){
			return a;
		}
		else {
			return a*findPower(a,b-1);
		}
	}
}
