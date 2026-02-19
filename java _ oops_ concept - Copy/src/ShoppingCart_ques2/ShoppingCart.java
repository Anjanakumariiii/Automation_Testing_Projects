package ShoppingCart_ques2;

import java.util.ArrayList;

public class ShoppingCart {

	public ArrayList<Item> cartItem;

	ShoppingCart() {
		cartItem = new ArrayList<>();
	}

	public void addItem(Item items) {
		cartItem.add(items);
		System.out.println("Succesfully added into cart" + items);
	}
////
//	public void removeItem(String itemName) {
//		for (Item item : cartItem) {
//			if (item.getName().equals(itemName)) {
//				cartItem.remove(item);
//				System.out.println("item Succesfully removed from cart");
//			}
//
//			
//		}

//	}
//
	public void removeItem(String itemName) {
		for (int i = 0; i < cartItem.size(); i++) {
			if (cartItem.get(i).getName().equals(itemName)) {
				cartItem.remove(i);
				System.out.println("item Succesfully removed from cart");
			}

		}

	}

	public void calculateTotal() {
		int totalPrice = 0;
		for (Item item : cartItem) {
			totalPrice += item.getPrice();
		}
		System.out.println("your total cart price is " + totalPrice);
	}

	public void viewCart() {
		System.out.println("items currently in the cart are");
		for (int i = 0; i < cartItem.size(); i++) {
			System.out.println(cartItem.get(i));
		}
	}
}
