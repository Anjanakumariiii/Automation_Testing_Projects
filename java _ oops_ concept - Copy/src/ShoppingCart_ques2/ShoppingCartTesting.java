package ShoppingCart_ques2;

public class ShoppingCartTesting {
	public static void main(String[] args) {
		ShoppingCart s1 = new ShoppingCart();
		Item i1 = new Item("Icecream", 30);
		Item i2 = new Item("Chips", 70);
		Item i3 = new Item("Milk", 50);
		Item i4 = new Item("ColdDrink", 100);
		Item i5 = new Item("Bread", 20);
		Item i6 = new Item("Bottle", 500);

		s1.addItem(i6);
		s1.addItem(i5);
		s1.addItem(i4);
		s1.addItem(i3);
		s1.addItem(i2);
		s1.addItem(i1);
		System.out.println();

		s1.removeItem("Icecream");

		System.out.println();
		s1.calculateTotal();

		System.out.println();
		s1.viewCart();

	}

}
