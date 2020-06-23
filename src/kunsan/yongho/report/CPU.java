package kunsan.yongho.report;

public class CPU extends Product{
	private double speed;
	private int pinCount;

	CPU(int productId, String name, String maker, int warehousingDay, int stock, int price, double speed, int pinCount) {
		super(productId, name, maker, warehousingDay, stock, price);
		// TODO Auto-generated constructor stub
		this.speed = speed;
		this.pinCount = pinCount;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getPinCount() {
		return pinCount;
	}

	public void setPinCount(int pinCount) {
		this.pinCount = pinCount;
	}

	@Override
	public String toString() {
		return getName() + " "  + getMaker();
	}
	

}
