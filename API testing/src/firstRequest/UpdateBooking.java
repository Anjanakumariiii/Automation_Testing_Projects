package firstRequest;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class UpdateBooking {

	public static void main(String[] args) {

		RestAssured.baseURI = "https://restful-booker.herokuapp.com";

		// Get token from AuthUtils
		String token = BookerLogin.getToken();
		System.out.println("Token: " + token);

		// Body for updating booking
		String updateBody = "{\n" + "    \"firstname\" : \"John\",\n" + "    \"lastname\" : \"Cena\",\n"
				+ "    \"totalprice\" : 222,\n" + "    \"depositpaid\" : true,\n" + "    \"bookingdates\" : {\n"
				+ "        \"checkin\" : \"2024-03-01\",\n" + "        \"checkout\" : \"2024-03-05\"\n" + "    },\n"
				+ "    \"additionalneeds\" : \"Dinner\"\n" + "}";

		// PUT request
		String response = given().header("Content-Type", "application/json").header("Accept", "application/json")
				.header("Cookie", "token=" + token).body(updateBody).when().put("/booking/5") // update booking ID = 1
				.then().extract().asString();

		System.out.println("PUT Response:");
		System.out.println(response);
	}
}
