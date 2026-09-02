package in.co.rays.string;

public class TestString {
	
		public static void main(String[] args) {
			
		
		
	String name = "NIKETAN OJHA";
	
	System.out.println("name = " + name);
	
	System.out.println("lenth:" + name.length());
	
	System.out.println("3rd char is: " + name.charAt(2));
	
	System.out.println("first index of a:" + name.indexOf("A"));
	
	System.out.println("last index of a:" + name.lastIndexOf("A"));
	
	System.out.println(name.replace('N','M'));
	
	System.out.println(name.toLowerCase());
	
	System.out.println(name.toUpperCase());
	
	System.out.println(name.startsWith("NIKETAN"));
	
	System.out.println(name.endsWith("JHA"));
	
	System.out.println(name.substring(3,6));
	
		
		
	}

}
