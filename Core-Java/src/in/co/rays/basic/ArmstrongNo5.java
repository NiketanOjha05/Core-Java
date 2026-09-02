package in.co.rays.basic;

public class ArmstrongNo5 {
	
	public static void main(String[] args) {
		
		
		int num = 128;
		
		int a = num % 10;
		int b = (num / 10)% 10;
		int c = num % 100;
		
		int sum = a*a*a + b*b*b + c*c*c;
		
		if ( sum == num) {
			
			System.out.println("armstrong");
			
		}
		else {
			System.out.println("not armstrong");
		}
	}

}
 