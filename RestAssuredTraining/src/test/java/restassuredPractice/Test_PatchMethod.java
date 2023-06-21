package restassuredPractice;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Test_PatchMethod {
	@Test
	public void test05()
	{
		JSONObject jsonData=new JSONObject();
		
		jsonData.put("name", "sujit kumar");
		jsonData.put("job", "Rest Assured");
		RestAssured.baseURI="https://reqres.in/api/users/70";
		RestAssured.given().header("Content-Type","application/json")
		.contentType(ContentType.JSON)
		.log().all()
		.body(jsonData.toString())
		.when().patch()
		.then().statusCode(200)
		.log().all();
	}

}
