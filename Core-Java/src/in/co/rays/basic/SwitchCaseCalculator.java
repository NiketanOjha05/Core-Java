package in.co.rays.basic;

public class SwitchCaseCalculator {
	public static void main(String[] args) {
		
	String opr = "-";
	int a = 2;
	int b = 4;
	
	switch (opr) {
	case "+":
		System.out.println("result:" +(a+b));
		break;
	case "-":
		System.out.println("result:" +(a-b));
		break;
	case "*":
		System.out.println("result:" +(a*b));
		break;
	case "/":
		System.out.println("result:" +(a/b));
		break;
	case "%":
		System.out.println("result:" +(a%b));
		break;
	}
		
	}

}
