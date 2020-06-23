package kunsan.yongho.report;

public class Audio extends Product {
	private int ampPower;
	private String tunerApplication;

	Audio(int productId, String name, String maker, int warehousingDay, int stock, int price, int ampPower, String tunerApplication) {
		super(productId, name, maker, warehousingDay, stock, price);
		// TODO Auto-generated constructor stub
		this.ampPower = ampPower;
		this.tunerApplication = tunerApplication;
	}

	public int getAmpPower() {
		return ampPower;
	}

	public void setAmpPower(int ampPower) {
		this.ampPower = ampPower;
	}

	public String getTunerApplication() {
		return tunerApplication;
	}

	public void setTunerApplication(String tunerApplication) {
		this.tunerApplication = tunerApplication;
	}

	@Override
	public String toString() {
		return getName() + " "  + getMaker();
	}

}
