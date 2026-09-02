package in.co.rays.basic;

import java.util.Scanner;

public class TestScanner5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter your 1st int..");
		int a = sc.nextInt();
		
		System.out.println("enter your 2nd int..");
		int b = sc.nextInt();
		
		System.out.println("select your one opr..");
		String opr = sc.next();
		
		switch (opr) {
		
		case "+":
			System.out.println("result:" + (a + b));
			break;
			
		case "-":
			System.out.println("result:" + (a - b) );
			break;
			
		
			
		}
		sc.close();
	}

}
