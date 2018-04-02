package programs;

import java.util.Scanner;

public class fibbonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1,n3;
		System.out.println("Enter the number for which Fibbonacci Series to be generated :");
		Scanner scanner=new Scanner(System.in);
		//String n=System.getProperty("line.separator");
		int fib = scanner.nextInt();
		System.out.print(n1+" "+ n2 +" ");
		for(int i=0;i<fib-2;i++) {
			n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
		}
	}
}
