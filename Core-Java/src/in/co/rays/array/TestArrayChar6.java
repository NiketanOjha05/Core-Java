package in.co.rays.array;

 public class TestArrayChar6 {
	
	public static void main(String[] args) {
		
		
		char[] n = {'r', 'a', 'k', 'e', 's', 'h'};
		
		System.out.println(n[5]);
		
		System.out.println("-----");
		
		for (int i = 0; i < n.length; i++) {
			
			System.out.println(i+ " = " + n[i]);
			
			System.out.println("-----");
			
			for (char c : n) {
				
				System.out.println(c);
				
			}
		}
	}

}
