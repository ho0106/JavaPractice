package kunsan.yongho.report;

public class Refrigerator extends Product{
	private int storage;
	private String type;

	Refrigerator(int productId, String name, String maker, int warehousingDay, int stock, int price, int storage, String type) {
		super(productId, name, maker, warehousingDay, stock, price);
		// TODO Auto-generated constructor stub
		this.storage = storage;
		this.type = type;
	}

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return getName() + " "  + getMaker();
	}

}
