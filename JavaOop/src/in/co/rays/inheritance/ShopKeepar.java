package in.co.rays.inheritance;

public class ShopKeepar extends Businessman {

	private int products;
	private double totalSales;
	private String shopType;

	public int getProducts() {
		return products;
	}

	public void setProducts(int products) {
		this.products = products;
	}

	public double getSales() {
		return totalSales;
	}

	public void setSales(double totalSales) {
		this.totalSales = totalSales;
	}

	public String getShopType() {
		return shopType;
	}

	public void setShopType(String shopType) {
		this.shopType = shopType;
	}

}