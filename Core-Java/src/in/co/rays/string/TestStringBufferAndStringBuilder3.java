package in.co.rays.string;

public class TestStringBufferAndStringBuilder3 {
	
	public static void main(String[] args) {
		
		
		StringBuffer sb = new StringBuffer ("Welcome");
		
		System.out.println(sb);
		
		System.out.println(sb.append(" Back"));
		
		
		System.out.println("-----------");
		
		
		
		StringBuilder sb1 = new StringBuilder ("Come");
		
		System.out.println(sb1);
		
		System.out.println(sb1.append(" Back"));
	}

}
