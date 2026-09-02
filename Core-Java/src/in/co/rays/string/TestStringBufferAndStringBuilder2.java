package in.co.rays.string;

public class TestStringBufferAndStringBuilder2 {
	
	public static void main(String[] args) {
		
		
        StringBuffer sb = new StringBuffer ("Hello");
		
		System.out.println(sb);
		
		System.out.println(sb.append(" Niketan"));
		
		System.out.println(sb);
		
		
		System.out.println("---------------------");
		
		
		StringBuilder sb1 = new StringBuilder ("Hello");
		
		System.out.println(sb1);
		
		System.out.println(sb1.append(" Niketan"));
		
		System.out.println(sb1);
	}

}
