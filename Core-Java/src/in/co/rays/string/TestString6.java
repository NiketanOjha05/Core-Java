package in.co.rays.string;

public class TestString6 {
	
	public static void main(String[] args) {
		
		
		String name = "Aman Bhardwaj";
		
		System.out.println("Name = " + name);
		
		System.out.println("lenght:" + name.length());
		
		System.out.println("7th char is:" + name.charAt(6));
		
		System.out.println("1st index of:" + name.indexOf('a'));
		
		System.out.println("lastindex of:" + name.lastIndexOf('r'));
		
		System.out.println(name.startsWith("Aman"));
		
		System.out.println(name.endsWith("dwaj"));
		
		System.out.println(name.replace('a', 'u'));
		
		System.out.println("Capital : " + name.toUpperCase());
		
		System.out.println("Small : "+name.toLowerCase());
		
		System.out.println(name.substring(2,9));
		
		
	}

}
