package firstRequest;

import io.restassured.path.json.JsonPath;

public class ExtractBookingId {

	public static void main(String[] args) {

		// Call CreateBooking class to get full response
		String response = CreateBooking.createNewBooking();

		System.out.println("Response:\n" + response);

		// Extract booking ID using JsonPath
		JsonPath js = new JsonPath(response);
		int bookingId = js.getInt("bookingid");

		System.out.println("\nNewly Created Booking ID: " + bookingId);
	}
}
