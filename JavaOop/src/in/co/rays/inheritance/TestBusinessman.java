package in.co.rays.inheritance;

public class TestBusinessman {

	public static void main(String[] args) {

		CarDealer c = new CarDealer();

		System.out.println("======Car Dealer======");

		c.setName("Rahul");
		c.setAddress("Dehli");
		c.setIncome(15000);
		c.setBrand("Toyota");
		c.setTotalCars(24);

		System.out.println("Name : " + c.getName());
		System.out.println("Address : " + c.getAddress());
		System.out.println("Income : " + c.getIncome());
		System.out.println("Brand : " + c.getBrand());
		System.out.println("Total Cars : " + c.getTotalCars());

		RestaurantOwner r = new RestaurantOwner();

		System.out.println("======Restaurant Owner======");

		r.setName("Rohit");
		r.setAddress("Mumbai");
		r.setIncome(10000);
		r.setFoodType("Vegatarian");
		r.setTotalTables(10);

		System.out.println("Name : " + r.getName());
		System.out.println("Address : " + r.getAddress());
		System.out.println("Income : " + r.getIncome());
		System.out.println("Food Type : " + r.getFoodType());
		System.out.println("Total Tables : " + r.getTotalTables());

		ShopKeepar s = new ShopKeepar();

		System.out.println("======Shop Keepar======");

		s.setName("Ramesh");
		s.setAddress("Kolkata");
		s.setProducts(12);
		s.setShopType("Grosary");
		s.setSales(13.10);

		System.out.println("Name : " + s.getName());
		System.out.println("Address : " + s.getAddress());
		System.out.println("Products : " + s.getProducts());
		System.out.println("Shop Type : " + s.getShopType());
		System.out.println("Sales : " + s.getSales());

	}

}
