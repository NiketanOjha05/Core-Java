package in.co.rays.string;

public class TestStringAndStringBuffer {
	
	public static void main(String[] args) {
		
		
		String name = "Rahul";
		
		System.out.println(name.replace('a', 'b'));
		
		System.out.println("name = " + name);
		
		
		
		System.out.println("--------------------");
		
		
		StringBuffer sb = new StringBuffer ("Ram ");
		
		System.out.println(sb);
		
		System.out.println(sb.append("and Shyam"));
		
		System.out.println(sb);
		
	}

}
