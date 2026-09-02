package in.co.rays.array;

 public class TestArrayChar2 {
	
	public static void main(String[] args) {
		
		
		char[] b = {'a', 'v', 'm', 's', 'k'};
		
		System.out.println(b[3]);
		
		System.out.println("------");
		
		for (int i = 0; i < b.length; i++) {
			
			System.out.println(i + " = " + b[i]);
			
			System.out.println("------");
			
			for (char c : b) {
				
				System.out.println(c);
				
			}
			
		}
	}

}
