import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


import files.ReUsableMethods;
import files.payload;
public class GoogleAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Validate if Add place API is working as expected
		//given -all input details
		//When-Submit the API-resource,http method
		//Then -validate the response
		RestAssured.baseURI="https://rahulshettyacademy.com";
		String response=given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body(payload.AddPlace()).when().post("maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200).body("scope",equalTo("APP"))
		.header("server","Apache/2.4.41 (Ubuntu)").extract().response().asString();
		System.out.println(response);
		
		//Add place ->update place with new address->Get place to validate if new address is persent in response
		//get place id
		JsonPath js=new JsonPath(response); //for parsing Json
		String placeid=js.getString("place_id");
		System.out.println("Place Id "+ placeid);
		
		//Update place 
		String NewAddress="K216/4 Saurabh Vihar Jaitpur Badarpur New Delhi";
		given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body("{\r\n"
				+ "  \"place_id\":\""+placeid+"\",\r\n"
				+ "  \"address\":\""+NewAddress+"\",\r\n"
				+ "\"key\":\"qaclick123\"\r\n"
				+ "\r\n"
				+ "}").when().put("maps/api/place/update/json")
		.then().assertThat().log().all().statusCode(200)
		.body("msg", equalTo("Address successfully updated"));
		
		//Get place
		String getplaceResponse=given().log().all().queryParam("key", "qaclick123").queryParam("place_id", placeid)
		.when().get("maps/api/place/get/json").then().assertThat().log().all().statusCode(200)
		.extract().response().asString();
		//JsonPath js1=new JsonPath(getplaceResponse);
		JsonPath js1=ReUsableMethods.rawToJson(getplaceResponse);
		String actualAddress=js1.getString("address");
		//Assert.assertEquals(actualAddress,"Pacific pines");
		
			}

}
