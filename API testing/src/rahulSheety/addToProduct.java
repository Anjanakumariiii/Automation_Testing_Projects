package rahulSheety;

import static io.restassured.RestAssured.given;

import java.io.File;

import io.restassured.RestAssured;

public class addToProduct {

	public static String addAproduct() {

		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String token = Login.getToken().trim();

		String response = given().header("Authorization", token).multiPart("productName", "qwerty")
				.multiPart("productAddedBy", "698aa64a48d62064b2f88442").multiPart("productCategory", "fashion")
				.multiPart("productSubCategory", "shirts").multiPart("productPrice", "9900")
				.multiPart("productDescription", "Addidas Originals").multiPart("productFor", "women")
				.multiPart("productImage", new File("C:\\Users\\anjkumar12\\Downloads\\OIP.jpg")).when()
				.post("/api/ecom/product/add-product").then().log().all().extract().asString();

		System.out.println(response);
		return response;
	}

	public static void main(String[] args) {
		addAproduct();
	}

}
