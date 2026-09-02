package in.co.rays.array;

 public class TestArrayChar {
	
	public static void main(String[] args) {
		
		char[] d = {'a', 'b', 'c', 'd', 'e',};
		
		System.out.println(d[3]);
		
		System.out.println("--------");
		
         for (int i = 0; i < d.length; i++) {
			
			System.out.println(i + " = " + d[i] );
			
			System.out.println("-------");
			
			for(char a : d) {
				
				System.out.println(a);
			}
			
		}
		
		
		
		
	}

}
