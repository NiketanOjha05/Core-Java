package in.co.rays.array;

 public class TestArrayChar4 {
	
	public static void main(String[] args) {
		 
		char[] n = {'a', 'm', 'a', 'n'};
		
		System.out.println(n[3]);
		
		System.out.println("------");
		
		for (int i = 0; i < n.length; i++) {
			
			System.out.println(i+ " = " + n[i] );
			
			System.out.println("------");
			
			for (char c : n) {
				System.out.println(c);
				
			}
		}
	}

}
