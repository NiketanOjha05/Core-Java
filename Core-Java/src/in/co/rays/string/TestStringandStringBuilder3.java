package in.co.rays.string;

public class TestStringandStringBuilder3 {
	
	public static void main(String[] args) {
		
		
		String name = "window";
		
		System.out.println(name.replace('w', 'p'));
		
		System.out.println(name);
		
		
		System.out.println("--------------");
		
		
		
		StringBuilder sb = new StringBuilder ("Window ");
		
		System.out.println(sb);
		
		System.out.println(sb.append("Home"));
		
		System.out.println(sb);
	}

}
