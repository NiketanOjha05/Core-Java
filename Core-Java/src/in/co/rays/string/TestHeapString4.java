package in.co.rays.string;

public class TestHeapString4 {
	
	public static void main(String[] args) {
		
		
		String s1 = "RAM";
		String s2 = "RAM";
		
		String s3 = new String ("ROM");
		String s4 = new String ("ROM");
		
		System.out.println(s1 ==s2);
		System.out.println(s3 == s4);
	}

}
