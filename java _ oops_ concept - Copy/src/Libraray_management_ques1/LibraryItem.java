package Libraray_management_ques1;

abstract class LibraryItem {
	private String title;
	private String itemID;
	private boolean isBorrowed;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getItemID() {
		return itemID;
	}

	public void setItemID(String itemID) {
		this.itemID = itemID;
	}

	public boolean isBorrowed() {
		return isBorrowed;
	}

	abstract void displayDetails();

	void borrowItem() {
		isBorrowed = true;
	}

	void returnItem() {
		isBorrowed = false;
	}
}
