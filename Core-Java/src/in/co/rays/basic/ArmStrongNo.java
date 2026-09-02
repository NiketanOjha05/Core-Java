package in.co.rays.basic;

public class ArmStrongNo {
	
	public static void main(String[] args) {
		
		int num = 247;
		
		int a = num % 10; 
		int b = (num / 10) % 10;
		int c = num / 100;
		
		
		int sum = a*a*a + b*b*b + c*c*c;
		
		if (sum == num ) {
			
			System.out.println("Armstrong No");
		} else {
			
			System.out.println(" Not Armstrong No");
		}
		
		
	} 

}
