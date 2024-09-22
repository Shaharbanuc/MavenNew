package demomaven;

import java.util.Scanner;

public class ScannerClassProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c,k;
		Scanner obj=new Scanner(System.in);
		
		System.out.println("enter a string");
		String name=obj.nextLine();
		System.out.println("enetered string is "+name);
		
		System.out.println("enter a character or string");
		c=obj.next().charAt(0);
		//it will print the character at index position which is given inside At()
		System.out.println(c);
		
		System.out.println("enter two integers");
		int a=obj.nextInt();
		int b=obj.nextInt();
		System.out.println("sum is "+(a+b));
		
		

	}

}
