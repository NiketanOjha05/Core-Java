package in.co.rays.basic;

import java.util.Scanner;


public class TestScanner2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter your first int..");
		int a = sc.nextInt();
		
		System.out.println("enter your second int..");
		int b = sc.nextInt();
		
		System.out.println("enter your third int..");
		int c = sc.nextInt();
		
		System.out.println("select your one opt..(-, +, /,)");
		String opr = sc.next();
		
		switch (opr) {
		
		case "+":
			System.out.println("result:" +( a + b / c));
			break;
			
			
		case "-":
			System.out.println("result:" + (a - b / c));
			break;
			
			
			
			
		}
		sc.close();
		
		
				
	}

}
