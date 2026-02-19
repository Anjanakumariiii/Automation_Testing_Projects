package Libraray_management_ques1;

public class DVD extends LibraryItem {

	private int durationMinutes;

	public DVD(int durationMinutes) {

		this.durationMinutes = durationMinutes;
	}

	public int getDurationMinutes() {
		return durationMinutes;
	}

	public void setDurationMinutes(int durationMinutes) {
		this.durationMinutes = durationMinutes;
	}

	void displayDetails() {
		System.out.println("DVD - " + durationMinutes + " " + getTitle() + " " + getItemID());
	}
}
