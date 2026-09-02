package in.co.rays.string;

public class TestHeapString3 {
	
	public static void main(String[] args) {
		
		String s1 = "SCHOOL";
		String s2 = "SCHOOL";
		
		String s3 = new String ("COLLAGE");
		String s4 = new String ("COLLAGE");
		
		System.out.println(s3 == s4);
		System.out.println(s1 == s2);
	}

}
