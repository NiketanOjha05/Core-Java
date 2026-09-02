package in.co.rays.string;

public class TestStringBufferAndStringBuilder {
	
	public static void main(String[] args) {
		
		
		StringBuffer sb = new StringBuffer ("Come");
		
		System.out.println(sb);
		
		System.out.println(sb.append(" and Out"));
		
		System.out.println(sb);
		
		
		System.out.println("---------------------");
		
		
		StringBuilder sb1 = new StringBuilder ("Go");
		
		System.out.println(sb1);
		
		System.out.println(sb1.append(" There"));
		
		System.out.println(sb1);
		
		
	}

}
