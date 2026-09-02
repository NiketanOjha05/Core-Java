package in.co.rays.string;

public class TestString4 {
	
	public static void main(String[] args) {
		
		
		String name = "Shubham Tomar";
		
		
		System.out.println("name = " + name);
		
		System.out.println("4th char is:" + name.charAt(3));
		
		System.out.println("lenth:" + name.length());
		
		System.out.println("1st index of:" + name.indexOf('h'));
		
		System.out.println("last index of:" + name.lastIndexOf('o'));
		
		System.out.println(name.startsWith("Shubh"));
		
		System.out.println(name.endsWith("omar"));
		
		System.out.println(name.replace('h', 'l'));
		
		System.out.println(name.toUpperCase());
		
		System.out.println(name.toLowerCase());
		
		System.out.println(name.substring(3,8));
	}

}
