package Libraray_management_ques1;

import java.util.ArrayList;

public class Library {

	private ArrayList<LibraryItem> bookList;

	Library() {
		bookList = new ArrayList<>();
	}

	public void addItem(LibraryItem item) {
		bookList.add(item);
		System.out.println("Item sucessfully added " + item);
	}

	public void borrowItem(String itemID) {
		for (LibraryItem l : bookList) {
			if (l.getItemID().equals(itemID) && l.isBorrowed()) {
				l.borrowItem();
				System.out.println("item got succesfully borrowed");
				break;
			}
		}

	}

	public void returnItem(String itemID) {
		for (LibraryItem l : bookList) {
			if (l.getItemID().equals(itemID) && l.isBorrowed()) {
				l.returnItem();
				System.out.println("item got succesfully returned");
				break;
			}
		}

	}

	public void listAllItems() {
		for (int i = 0; i < bookList.size(); i++) {
			bookList.get(i).displayDetails();
		}
	}

}
