package in.co.rays.basic;

import java.util.Scanner;

public class TestScanner6 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Your 1st Digit");
		int a = sc.nextInt();
		
		System.out.println("Enter Your 2nd Digit");
		int b = sc.nextInt();
		
		System.out.println("Select Your One Opration");
		String opr = sc.next();
		
		
		switch (opr) {
		
		case"+":
			System.out.println("Result : " + (a + b));
			break;
			
		case"-":
			System.out.println("Result : " + (a - b));
			break;
			
		case"*":
			System.out.println("Result : " + (a*b));
			
		case"/":
			System.out.println("Result : " + (a / b));
			break;
			
		
			
		}
		sc.close();
		
		
	}

}
