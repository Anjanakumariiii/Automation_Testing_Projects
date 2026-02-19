package Libraray_management_ques1;

public class LibraryTesting {
	public static void main(String[] args) {
		Library l1 = new Library();

		LibraryItem b1 = new Book("Mulsi");
		b1.setTitle("yuva");
		b1.setItemID("0012");
		b1.borrowItem();

		LibraryItem d1 = new DVD(40);
		d1.setItemID("0078");
		d1.setTitle("Life Lessons");

		l1.addItem(b1);
		l1.addItem(d1);
		System.out.println();

		l1.borrowItem("0012");
		l1.borrowItem("7764");
		l1.returnItem("0012");
		System.out.println();

		l1.listAllItems();
	}
}
