package kunsan.yongho.report;

import java.util.ArrayList;

abstract class Product {
	private int productId;
	private String name;
	private String maker;
	private int warehousingDay;
	private int stock;
	private int price;
	private ArrayList<Product> productList = new ArrayList<Product>();

	Product(int productId, String name, String maker, int warehousingDay, int stock, int price) {
		this.productId = productId;
		this.name = name;
		this.maker = maker;
		this.warehousingDay = warehousingDay;
		this.stock = stock;
		this.price = price;
	}

	public String toString() {
		return getName() + " " + getMaker();
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public int getWarehousingDay() {
		return warehousingDay;
	}

	public void setWarehousingDay(int warehousingDay) {
		this.warehousingDay = warehousingDay;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
