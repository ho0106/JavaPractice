package kunsan.yongho.game;

public class Item {
	private String mName;
	private int mItemCode;
	private int mItemCount;
	private long mGUID;

	public Item(String name, int itemCode, long guid, int itemCount) {
		mName = name;
		mItemCode = itemCode;
		mGUID = guid;
		mItemCount = itemCount;
	}
	
	public static Item createItem(String name, int itemCode, long guid, int itemCount) {
		return new Item(name, itemCode, guid, itemCount);
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public int getmItemCode() {
		return mItemCode;
	}

	public void setmItemCode(int mItemCode) {
		this.mItemCode = mItemCode;
	}

	public int getmItemCount() {
		return mItemCount;
	}

	public void setmItemCount(int mItemCount) {
		this.mItemCount = mItemCount;
	}

	public long getmGUID() {
		return mGUID;
	}

	public void setmGUID(long mGUID) {
		this.mGUID = mGUID;
	}
	
}